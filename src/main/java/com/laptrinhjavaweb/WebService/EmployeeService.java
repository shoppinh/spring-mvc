package com.laptrinhjavaweb.WebService;

import java.util.List;

import com.laptrinhjavaweb.dto.EmployeeDTO;

public interface EmployeeService {
	List<EmployeeDTO> findAll();
	EmployeeDTO findByID(String id);
	EmployeeDTO insert(EmployeeDTO dto);
	EmployeeDTO update(EmployeeDTO dto);
	void Delete(String[] ids);
		
}
