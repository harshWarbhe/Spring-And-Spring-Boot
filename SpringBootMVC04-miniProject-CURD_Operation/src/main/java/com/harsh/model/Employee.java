package com.harsh.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Employee implements Serializable {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "emp_id_seq", initialValue = 1001, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.AUTO)
	private Integer empno;
	@Column(length = 30)
	private String ename;
	@Column(length = 30)
	private String job;
	private Float sal;
	private Integer deptno;
}
