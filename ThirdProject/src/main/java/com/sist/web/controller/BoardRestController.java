package com.sist.web.controller;

import com.sist.web.dao.BoardDAO;
import com.sist.web.entity.BoardEntity;
import com.sist.web.entity.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("board/")
@CrossOrigin("http://localhost:3000")
public class BoardRestController {
    @Autowired
    private BoardDAO dao;

    @GetMapping("board_list_react")
    public List<BoardEntity> board_list(String page) {
        if(page==null) {
            page = "1";
        }
        int curpage = Integer.parseInt(page);
        int rowSize = 10;
        int start = (rowSize*curpage)-rowSize; // Limit => 0번부터 시작
        List<BoardEntity> list = dao.boardListData(start);
        for(BoardEntity vo:list) {
            String s = vo.getRegdate();
            String[] ss = s.split(" ");
            vo.setRegdate(ss[0].trim());
        }
        return list;
    }

    @GetMapping("board_page_react")
    public PageVO board_page(int page) {
        int totalpage = dao.boardTotalPage();

        final int BLOCK = 5;
        int startPage = ((page-1)/BLOCK*BLOCK)+1;
        int endPage = ((page-1)/BLOCK*BLOCK)+BLOCK;
        if (endPage > totalpage)
            endPage = totalpage;
        PageVO vo = new PageVO();
        vo.setCurpage(page);
        vo.setStartPage(startPage);
        vo.setEndPage(endPage);
        vo.setTotalpage(totalpage);

        return vo;
    }

    @GetMapping("board_detail_react")
    public BoardEntity board_detail(int no) {
        BoardEntity vo = dao.findByNo(no);
        vo.setHit(vo.getHit()+1);
        dao.save(vo); // update => save() : update,insert
        vo = dao.findByNo(no);
        return vo;
    }

    @PostMapping("board_insert_ok")
    public void board_insert_ok(BoardEntity vo) {
        dao.save(vo);
    }

    @GetMapping("board_update")
    public BoardEntity board_update(int no) {
        BoardEntity vo = dao.findByNo(no);
        return vo;
    }

    @PostMapping("board_update_ok")
    public void board_update_ok(BoardEntity vo, RedirectAttributes ra) {
        BoardEntity tvo = dao.findByNo(vo.getNo());
        vo.setHit(tvo.getHit());
        dao.save(vo);
    }

    @GetMapping("board_delete")
    public int board_delete(int no) {
        return no;
    }

    @PostMapping("board_delete_ok")
    public void board_delete_ok(String pwd, int no) {
        BoardEntity vo = dao.findByNo(no);
        dao.delete(vo);
    }
}
