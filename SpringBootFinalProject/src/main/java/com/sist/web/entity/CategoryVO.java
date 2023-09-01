package com.sist.web.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FOOD_LOCATION")
@Getter
@Setter
public class CategoryVO {
    @Id
    private int cno;
    private String title, subject, poster, link;
}
