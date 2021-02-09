package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.DepartmentDTO;
import com.laptrinhjavaweb.entity.DepartmentEntity;
@Component
public class DepartmentConverter {
	public DepartmentDTO toDTO(DepartmentEntity entity) {
		DepartmentDTO result = new DepartmentDTO();
		result.setMaPB(entity.getMaPB());
		result.setTenPB(entity.getTenPB());
		return result;
	}
	
	public DepartmentEntity toEntity(DepartmentDTO dto) {
		DepartmentEntity result = new DepartmentEntity();
		result.setMaPB(dto.getMaPB());
		result.setTenPB(dto.getTenPB());
		return result;
	}
}
