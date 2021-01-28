package com.laptrinhjavaweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "thannhan")
public class RelativeEntity extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TenThanNhan")
	private String tenThanNhan;
	
	@Column (name = "NS")
	private Date ngaySinh;
	
	@Column(name = "QuanHe")
	private String quanHe;
	

	
	@ManyToOne
	@JoinColumn(name = "MaNhanVien")
	private EmployeeEntity employee;

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
	public String getTenThanNhan() {
		return tenThanNhan;
	}

	public void setTenThanNhan(String tenThanNhan) {
		this.tenThanNhan = tenThanNhan;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getQuanHe() {
		return quanHe;
	}

	public void setQuanHe(String quanHe) {
		this.quanHe = quanHe;
	}

	
}
