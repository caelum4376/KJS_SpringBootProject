package com.sist.web.dao;

import com.sist.web.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import java.util.*;

@Repository
public interface MovieDAO extends JpaRepository<MovieEntity, Integer> {
    @Query(value = "SELECT imdb_Id, Imdb_Link, title, IMDB_Score, genre, poster FROM MOVIEGENRE LIMIT :start, 20", nativeQuery = true)
    public List<MovieEntity> movieListData(@Param("start") Integer start);

    @Query(value = "SELECT CEIL(COUNT(*)/20.0) FROM MOVIEGENRE", nativeQuery = true)
    public int movieTotalPage();
}
