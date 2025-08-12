package com.harsh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JPA_DOCTOR_INFO")
@Data
public class Doctor {

	@Id
	@Column(name = "DOC_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docId;

	@Column(name = "DOC_NAME")
	private String docName;

	@Column(name = "DOC_SEPCIALIZATION")
	private String specialization;

	@Column(name = "DOC_INCOME")
	private double income;

}
