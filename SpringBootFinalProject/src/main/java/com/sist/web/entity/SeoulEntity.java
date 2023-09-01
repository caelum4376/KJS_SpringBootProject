package com.sist.web.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEOUL_LOCATION")
@Getter
@Setter
public class SeoulEntity {
    @Id
    private int no;
    private int hit;
    private String title, poster, msg, address;
}
