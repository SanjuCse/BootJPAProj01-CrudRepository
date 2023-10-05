package com.sanju.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Caller_Tune_Info")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class CallerTuneInfo {
	@Id
	@GeneratedValue(generator = "Tune_ID_Seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "Tune_ID_Seq", sequenceName = "Tune_ID_Seq", allocationSize = 1, initialValue = 10000)
	private Integer tuneID;

	@Column(name = "Tune_Name", length = 30)
	@Nonnull
	public String tuneName;

	@Column(name = "Movie_Name", length = 20)
	@Nonnull
	public String movieName;

	@Column(name = "Update_Count")
	@Version
	public Integer updateCount;

	@CreationTimestamp
	@Column(name = "service_Opted_On")
	public LocalDateTime serviceOptedOn;

	@UpdateTimestamp
	@Column(name = "lastly_Updated_On")
	public LocalDateTime lastlyUpdatedOn;
}
