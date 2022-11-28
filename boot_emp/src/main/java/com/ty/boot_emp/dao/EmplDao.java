package com.ty.boot_emp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.boot_emp.dto.Empl;
import com.ty.boot_emp.reposit.Repos;

@Repository
public class EmplDao {

	@Autowired
	Repos repos;
	
	public Empl saveemp(Empl emp) {
		return repos.save(emp);
	}
	
	public Empl findbyid(int id) {
		return repos.findById(id).get();
	}
	
	public String deleteempbyid(int id) {
		 repos.deleteById(id);
	return "Emp deleted";
	}
}
