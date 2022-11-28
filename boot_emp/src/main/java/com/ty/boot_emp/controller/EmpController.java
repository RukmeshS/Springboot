package com.ty.boot_emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.boot_emp.dao.EmplDao;
import com.ty.boot_emp.dto.Empl;

@RestController
public class EmpController {

	@Autowired
	EmplDao dao;
	
	
	@PostMapping("/save")
	public Empl saveemp(@RequestBody Empl emp) {
		return dao.saveemp(emp);
	}
	
	@GetMapping("get")
	public Empl findbyid(@RequestParam int id) {
		return dao.findbyid(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteemp(@PathVariable int id) {
		return dao.deleteempbyid(id);
	}
}
