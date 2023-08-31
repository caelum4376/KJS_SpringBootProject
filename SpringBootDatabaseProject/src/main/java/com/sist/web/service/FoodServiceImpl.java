package com.sist.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sist.web.vo.*;
import com.sist.web.dao.*;
@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	private FoodMapper mapper;

	@Override
	public List<CategoryVO> categoryListData() {
		return mapper.categoryListData();
	}
	
	
}
