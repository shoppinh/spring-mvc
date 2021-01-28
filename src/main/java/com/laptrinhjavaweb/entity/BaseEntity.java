package com.laptrinhjavaweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	
	@Column(name = "NgayTao")
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "NgaySua")
	@LastModifiedDate
	private Date modifiedDate;
	
	@Column(name = "NguoiTao")
	@CreatedBy
	private String createdBy;
	
	@Column(name = "NguoiSua")
	@LastModifiedBy
	private String modifiedBy;

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}
}
