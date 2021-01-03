package com.laptrinhjavaweb.model;

import java.util.Date;



public class NhanVien {
	private String maNV;
	private String tenNV;
	private Date ngaySinh;
	private String chucVu;
	private String avatar;
	private int luong;
	private String mieuTa;
	private String maPB;
	
	public String getMaPB() {
		return maPB;
	}
	public void setMaPB(String maPB) {
		this.maPB = maPB;
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
