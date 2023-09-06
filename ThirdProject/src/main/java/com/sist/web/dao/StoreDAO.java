package com.sist.web.dao;

import com.sist.web.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public interface StoreDAO extends JpaRepository<StoreEntity, Integer> {
    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail", nativeQuery = true)
    public List<StoreEntity> store_category1();

    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail WHERE scname, score  = '푸드'", nativeQuery = true)
    public List<StoreEntity> store_category2();

    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail WHERE scname, score  = '테크·가전'", nativeQuery = true)
    public List<StoreEntity> store_category3();

    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail WHERE scname, score  = '여행·스포츠'", nativeQuery = true)
    public List<StoreEntity> store_category4();

    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail WHERE scname, score  = '뷰티'", nativeQuery = true)
    public List<StoreEntity> store_category5();

    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail WHERE scname, score  = '취미·클래스'", nativeQuery = true)
    public List<StoreEntity> store_category6();

    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail WHERE scname, score  = '반려동물'", nativeQuery = true)
    public List<StoreEntity> store_category7();

    @Query(value = "SELECT wsno, main_poster, detail_poster, parti_count, tag, goods_title, score, maker_name, maker_totalmoney, maker_supporter, price, review_count, jjim_count, delivery, scname, score  FROM wadiz_store_detail WHERE scname, score  = '패션·잡화'", nativeQuery = true)
    public List<StoreEntity> store_category8();

}
