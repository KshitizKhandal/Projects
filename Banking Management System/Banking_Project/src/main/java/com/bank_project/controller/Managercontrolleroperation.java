package com.bank_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_project.entity.Employee;
import com.bank_project.service.Managercontrolleroperationservice;

@RestController
@RequestMapping("/manageroperation")
public class Managercontrolleroperation {

	@Autowired
	Managercontrolleroperationservice service;

	@GetMapping("/")
	public List<Employee> getlist() {
		return service.getlist();
	}

	@PostMapping("/")
	public void getadd(@RequestBody Employee employee) {
		service.getadd(employee);
	}

	@PutMapping("/")
	public void getupdate(@RequestBody Employee employee) {
		service.getupdate(employee);
	}

}
