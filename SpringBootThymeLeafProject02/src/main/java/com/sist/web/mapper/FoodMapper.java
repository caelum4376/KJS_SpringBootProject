package com.sist.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.sist.web.vo.*;
@Repository
@Mapper
public interface FoodMapper {
	public List<FoodVO> foodFindData(Map map);
	
	public int foodFindTotalPage(String address);
}
