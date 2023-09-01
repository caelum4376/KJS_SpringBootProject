package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import com.sist.web.dao.*;
import com.sist.web.entity.*;

@Controller
@RequestMapping("movie/")
public class MovieController {
    @Autowired
    private MovieDAO dao;

    @GetMapping("movie_list")
    public String movie_list(String page, Model model) {
        if(page==null)
            page="1";
        int curpage = Integer.parseInt(page);
        int rowSize = 20;
        int start = (rowSize*curpage)-rowSize;
        List<MovieEntity> list = dao.movieListData(start);
        int totalpage = dao.movieTotalPage();

        final int BLOCK = 10;
        int startPage = ((curpage-1)/BLOCK*BLOCK)+1;
        int endPage = ((curpage-1)/BLOCK*BLOCK)+BLOCK;

        if (endPage>totalpage)
            endPage=totalpage;

        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", totalpage);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("list", list);
        model.addAttribute("main_html", "movie/movie_list");
        return "main";
    }
}
