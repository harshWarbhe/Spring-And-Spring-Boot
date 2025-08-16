package com.harsh.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "CALLER_TUNE_INFO")
@RequiredArgsConstructor
@NoArgsConstructor
public class CallerTuneInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tuneId;

	@Column(length = 20)
	@NonNull
	private String tuneName;

	@Column(length = 20)
	@NonNull
	private String movieName;

	@Version
	@Column(name = "UPDATED_COUNT")
	private Integer updatedCount;
	
	@CreationTimestamp
	@Column(name = "SERVICE_OPTED_ON")
	private LocalDateTime serviceOptedOn;
	
	@UpdateTimestamp
	@Column(name = "LASTY_UPDATED_ON")
	private LocalDateTime lastlyUpdatedOn;
}
