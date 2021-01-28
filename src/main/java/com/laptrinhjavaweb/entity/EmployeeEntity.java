package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "nhanvien")
public class EmployeeEntity extends BaseEntity{
	@Id
	private String maNV;
	
	@Column(name = "TenNV")
	private String tenNV;
	
	@Column (name = "NS")
	private Date ngaySinh;
	
	@Column (name ="ChucVu")
	private String chucVu;
	
	@Column (name = "Avatar")
	private String avatar;
	
	@Column (name = "Luong")
	private int luong;
	
	@Column (name = "MieuTa", columnDefinition = "TEXT")
	private String mieuTa;
	

	@ManyToOne
	@JoinColumn(name = "MaPhongBan")
	private DepartmentEntity department_id;

	
	public DepartmentEntity getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(DepartmentEntity department_id) {
		this.department_id = department_id;
	}

	@OneToMany(mappedBy = "employee")
	private List<RelativeEntity> relatives = new ArrayList<>();

	public List<RelativeEntity> getRelatives() {
		return relatives;
	}
	
	public void setRelatives(List<RelativeEntity> relatives) {
		this.relatives = relatives;
	}




	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public String getMieuTa() {
		return mieuTa;
	}

	public void setMieuTa(String mieuTa) {
		this.mieuTa = mieuTa;
	}
	
}
