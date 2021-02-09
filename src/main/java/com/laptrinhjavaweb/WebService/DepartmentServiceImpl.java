package com.laptrinhjavaweb.WebService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.entity.DepartmentEntity;
import com.laptrinhjavaweb.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Map<String, String> findAll() {
		Map<String, String> result = new HashMap<>();
		List<DepartmentEntity> entities = departmentRepository.findAll();
		for (DepartmentEntity item : entities) {
			result.put(item.getMaPB(), item.getTenPB());
		}
		return result;
	}


}
