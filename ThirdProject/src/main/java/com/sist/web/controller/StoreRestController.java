package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sist.web.entity.*;
import com.sist.web.dao.*;
import java.util.*;
@RestController
@RequestMapping("store/")
@CrossOrigin("http://localhost:3000")
public class StoreRestController {
    @Autowired
    private StoreDAO dao;

    @GetMapping("store_category1")
    public List<StoreEntity> store_category1() {
        List<StoreEntity> list = dao.store_category1();

        return list;
    }
    @GetMapping("store_category2")
    public List<StoreEntity> store_category2() {
        List<StoreEntity> list = dao.store_category2();

        return list;
    }
    @GetMapping("store_category3")
    public List<StoreEntity> store_category3() {
        List<StoreEntity> list = dao.store_category3();

        return list;
    }
    @GetMapping("store_category4")
    public List<StoreEntity> store_category4() {
        List<StoreEntity> list = dao.store_category4();

        return list;
    }
    @GetMapping("store_category5")
    public List<StoreEntity> store_category5() {
        List<StoreEntity> list = dao.store_category5();

        return list;
    }
    @GetMapping("store_category6")
    public List<StoreEntity> store_category6() {
        List<StoreEntity> list = dao.store_category6();

        return list;
    }
    @GetMapping("store_category7")
    public List<StoreEntity> store_category7() {
        List<StoreEntity> list = dao.store_category7();

        return list;
    }
    @GetMapping("store_category8")
    public List<StoreEntity> store_category8() {
        List<StoreEntity> list = dao.store_category8();

        return list;
    }
}
