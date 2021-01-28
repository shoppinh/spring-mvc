package com.laptrinhjavaweb.WebService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.EmployeeConverter;
import com.laptrinhjavaweb.dto.EmployeeDTO;
import com.laptrinhjavaweb.entity.EmployeeEntity;
import com.laptrinhjavaweb.repository.NhanVienRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {	
	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Autowired
	private EmployeeConverter employeeConverter;
	@Override
	public List<EmployeeDTO> findAll() {
		List<EmployeeDTO> models = new ArrayList<>();
		List<EmployeeEntity> entities = nhanVienRepository.findAll();
		for (EmployeeEntity item: entities) {
			EmployeeDTO employeeDTO = employeeConverter.toDTO(item);
			models.add(employeeDTO);
		}
		return models;
	}

	@Override
	public EmployeeDTO findByID(String id) {
		EmployeeEntity entity = nhanVienRepository.findOne(id);
		return employeeConverter.toDTO(entity);
	}


}
