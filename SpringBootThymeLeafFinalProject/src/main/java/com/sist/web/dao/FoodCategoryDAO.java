package com.sist.web.dao;
import java.util.*;
import com.sist.web.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCategoryDAO extends JpaRepository<CategoryVO, Integer> {
    @Query(value = "SELECT cno, title, poster, subject, link FROM FOOD_CATEGORY", nativeQuery = true)
    public List<CategoryVO> categoryListData();
}
