package com.ltts.Complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Complaint.dao.*;
import com.ltts.Complaint.model.Complaint;

@RestController
public class complaintController {
	@Autowired
	complaintDao cd;

	@GetMapping("/complaint")
	public List<Complaint> retriveAllUsers() {
		return cd.getAllComplaints();
	}


}
