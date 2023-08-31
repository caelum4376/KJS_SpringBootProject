package com.sist.web.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.web.mapper.*;
import com.sist.web.vo.*;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodMapper mapper;
	
	@Override
	public List<FoodVO> foodFindData(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int foodFindTotalPage(String address) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
