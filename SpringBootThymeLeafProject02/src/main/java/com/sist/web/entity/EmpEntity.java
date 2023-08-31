package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "emp")
@Getter
@Setter
public class EmpEntity {
	@Id
	private int empno;
	private int sal, deptno;
	private String ename, job, mgr, hiredate,comm,address;
}
