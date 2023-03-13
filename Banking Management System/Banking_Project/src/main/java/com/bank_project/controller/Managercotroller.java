package com.bank_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_project.entity.Manager;
import com.bank_project.service.Managerservice;

@RestController
@RequestMapping("/manager")
public class Managercotroller {
	@Autowired
	Managerservice service;

	@GetMapping("/")
	public List<Manager> getlistm() {

		return service.getlistm();

	}

	@PostMapping("/")
	public void getadd(@RequestBody Manager manager) {
		service.getadd(manager);
	}

}
