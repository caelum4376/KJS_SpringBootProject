package com.sist.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.web.entity.EmpEntity;

@Repository
public interface EmpDAO extends JpaRepository<EmpEntity, Integer> {

	@Query(value="SELECT * FROM emp "
			+ "WHERE ename CONCAT('%',:ename,'%') "
			+ "ORDER BY empno ASC "
			+ "LIMIT :start, 2", nativeQuery=true)
	public List<EmpEntity> empFindData(@Param("ename") String ename,
			@Param("start") Integer start);
	
	@Query(value = "SELECT CEIL(COUNT(*)/12.0) FROM emp "
			+ "WHERE ename CONCAT('%',:ename,'%')", nativeQuery=true)
	public int empFindTotalPage(String ename);
	
}
