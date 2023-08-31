package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="food_loacation")
public class FoodEntity {
	@Id
	private int fno;
	private int hit;
	private double score;
	private String name, address, tel, type, price, time, parking, menu, poster;
}
