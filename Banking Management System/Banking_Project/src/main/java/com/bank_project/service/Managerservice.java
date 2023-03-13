package com.bank_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank_project.entity.Manager;

@Service
public interface Managerservice {

	List<Manager> getlistm();

	void getadd(Manager manager);

}
