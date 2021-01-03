package com.laptrinhjavaweb.WebService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.Dao.EmployeeDAO;
import com.laptrinhjavaweb.model.NhanVien;

@Service
public class EmployeeServiceImpl implements EmployeeService {	
	
	@Autowired
	private EmployeeDAO slidesDAO;
	public void setSlidesDAO(EmployeeDAO slidesDAO) {
		this.slidesDAO = slidesDAO;
	}
	
	public List<NhanVien> getDataSlides() {

		return slidesDAO.getDataSlides();
	}
	

}
