package com.ltts.AddDepartment.controller;

import java.util.List;

import com.ltts.AddDepartment.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.AddDepartment.model.AddDepartment;

@RestController
public class DController {
	@Autowired
	addDepartmentDao cd;

	@GetMapping("/viewdepartments")
	public List<AddDepartment> retriveAllUsers() {
		return cd.getAllDepartments();
	}
}
