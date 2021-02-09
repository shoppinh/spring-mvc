package com.laptrinhjavaweb.dto;

public class DepartmentDTO extends AbstractDTO<DepartmentDTO>{
	private String maPB;
	private String tenPB;
	
	
	public String getMaPB() {
		return maPB;
	}
	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}
	public String getTenPB() {
		return tenPB;
	}
	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}
	
}
