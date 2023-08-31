package com.sist.web.dao;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.*;

@Repository
public interface FoodDAO extends JpaRepository<FoodEntity, Integer> {
	
//	public FoodEntity findByFno(int fno);
	// select * from food_location where fno=1
	// insert, update, delete
	
	@Query(value="SELECT * FROM food_location "
			+ "WHERE address CONCAT('%',:address,'%') "
			+ "ORDER BY fno ASC "
			+ "LIMIT :start, 12", nativeQuery=true)
	public List<FoodEntity> foodFindData(@Param("address") String address,
			@Param("start") Integer start);
	// 매개변수가 2개 이상일 경우 @Param사용
	
	@Query(value="SELECT CEIL(COUNT(*)/12.0) FROM food_location "
			+ "WHERE address CONCAT('%', :address, '%')", nativeQuery=true)
	public int foodFindTotalPage(String address);
	
	public FoodEntity findByFno(@Param("fno") Integer fno);
}
