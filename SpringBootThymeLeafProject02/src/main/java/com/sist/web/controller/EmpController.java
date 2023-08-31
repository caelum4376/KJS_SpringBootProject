package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sist.web.dao.*;
import com.sist.web.entity.*;
import java.util.*;
@Controller
public class EmpController {
	@Autowired
	private EmpDAO dao;
	
	@RequestMapping("emp/list")
	public String emp_find(String page, String fd, Model model) {
		if (fd==null) {
			fd = "";
		}
		
		int curpage = Integer.parseInt(page);
		int rowSize = 12;
		int start = (rowSize*curpage)-(rowSize);
		
		List<EmpEntity> list = dao.empFindData(fd, start);
		int totalpage = dao.empFindTotalPage(fd);
		
		final int BLOCK = 3;
		int startPage = ((curpage-1)/BLOCK*BLOCK)+1;
		int endPage = ((curpage-1)/BLOCK*BLOCK)+BLOCK;
		if (endPage > totalpage) {
			endPage = totalpage;
		}
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("list", list);
		model.addAttribute("fd", fd);
		
		return "emp/list";
	}
}
