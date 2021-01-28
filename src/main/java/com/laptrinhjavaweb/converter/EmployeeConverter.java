package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.EmployeeDTO;
import com.laptrinhjavaweb.entity.EmployeeEntity;

@Component
public class EmployeeConverter {
	public EmployeeDTO toDTO(EmployeeEntity entity) {
		
		EmployeeDTO result = new EmployeeDTO();
		result.setMaNV(entity.getMaNV());
		result.setTenNV(entity.getTenNV());
		result.setNgaySinh(entity.getNgaySinh());
		result.setAvatar(entity.getAvatar());
		result.setChucVu(entity.getChucVu());
		result.setLuong(entity.getLuong());
		result.setMieuTa(entity.getMieuTa());
		return result;
	}
	public EmployeeEntity toEntity(EmployeeDTO dto) {
		EmployeeEntity result = new EmployeeEntity();
		result.setMaNV(dto.getMaNV());
		result.setTenNV(dto.getTenNV());
		result.setNgaySinh(dto.getNgaySinh());
		result.setAvatar(dto.getAvatar());
		result.setChucVu(dto.getChucVu());
		result.setLuong(dto.getLuong());
		result.setMieuTa(dto.getMieuTa());
		return result;
		
	}
	
	
}
