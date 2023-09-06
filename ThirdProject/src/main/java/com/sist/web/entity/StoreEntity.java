package com.sist.web.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wadiz_store_detail")
@Getter
@Setter
public class StoreEntity {
    @Id
    private int wsno;
    private String maker_totalmoney,
            goods_title,scname,tag,maker_name,delivery,detail_poster,main_poster;
    private int parti_count,maker_supporter,price,review_count,
            jjim_count;
    private Double score;
}
