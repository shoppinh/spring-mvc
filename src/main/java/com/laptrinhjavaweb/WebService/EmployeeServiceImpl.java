package com.laptrinhjavaweb.WebService;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.EmployeeConverter;
import com.laptrinhjavaweb.dto.EmployeeDTO;
import com.laptrinhjavaweb.entity.DepartmentEntity;
import com.laptrinhjavaweb.entity.EmployeeEntity;
import com.laptrinhjavaweb.repository.DepartmentRepository;
import com.laptrinhjavaweb.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeConverter employeeConverter;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<EmployeeDTO> findAll() {
		List<EmployeeDTO> models = new ArrayList<>();
		List<EmployeeEntity> entities = employeeRepository.findAll();
		for (EmployeeEntity item : entities) {
			EmployeeDTO employeeDTO = employeeConverter.toDTO(item);
			models.add(employeeDTO);
		}
		return models;
	}

	@Override
	public EmployeeDTO findByID(String id) {
		EmployeeEntity entity = employeeRepository.findOne(id);
		return employeeConverter.toDTO(entity);
	}

	@Override
	@Transactional
	public EmployeeDTO insert(EmployeeDTO dto) {
		DepartmentEntity department = departmentRepository.findOneByMaPB(dto.getMaPB());
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity = employeeConverter.toEntity(dto);
		employeeEntity.setDepartment(department);
		return employeeConverter.toDTO(employeeRepository.save(employeeEntity));
	}

	@Override
	@Transactional
	public EmployeeDTO update(EmployeeDTO dto) {
		DepartmentEntity department = departmentRepository.findOneByMaPB(dto.getMaPB());
		EmployeeEntity newEmployee = new EmployeeEntity();
		EmployeeEntity oldEmployee = employeeRepository.findOne(dto.getMaNV());
		oldEmployee.setDepartment(department);
		newEmployee = employeeConverter.toEntity(dto, oldEmployee);
		return employeeConverter.toDTO(employeeRepository.save(newEmployee));
	}

	@Override
	@Transactional
	public void Delete(String[] ids) {
		for (String id : ids) {
			employeeRepository.delete(id);

		}
	}

}
