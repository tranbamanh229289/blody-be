package com.manhtran.blody.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String createdBy;

	@Column
	private String modifiedBy;

	@Column
	private Date createdAt;

	@Column
	private Date modifiedAt;
}
