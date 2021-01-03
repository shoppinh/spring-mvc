package com.laptrinhjavaweb.DaoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.Dao.EmployeeDAO;
import com.laptrinhjavaweb.mapper.MapperNhanVien;
import com.laptrinhjavaweb.model.NhanVien;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	public List<NhanVien> getDataSlides(){
		CommonDAO commonDao = new CommonDAO();
		String sql = "Select * from nhanvien";
		return commonDao.query(sql, new MapperNhanVien());
	}
}
