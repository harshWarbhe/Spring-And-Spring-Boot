package com.harsh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JOB_SEEKER_INFO")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class JobSeeker {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "jsld_seq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@NonNull
	@Column(name = "JS_NAME", length = 30)
	private String jsName;
	
	@NonNull
	@Column(name = "JS_QLFY", length = 20)
	private String qlfy;
	
	@NonNull
	@Column(name = "JS_PERCENTAGE")
	private Double percentage;
	
	@Transient
	@Column(name = "JS_CONTACT_INFO")
	private Long mobileNo;

	public JobSeeker() {
		System.out.println("JobSeeker :: 0 param construtor ::\t"+this.getClass()+"\t::\t"+this.getClass().getSuperclass());
	}
	
	
}
