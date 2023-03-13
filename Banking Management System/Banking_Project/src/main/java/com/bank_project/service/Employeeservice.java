package com.bank_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank_project.entity.Account;
import com.bank_project.entity.Employee;
import com.bank_project.entity.User;

@Service
public interface Employeeservice {

	

	List<Account> deletebyaccountnumber(long accountnumber);

	void getupdate(User user);

	List<Employee> getall();

	String getAllTotal();
}
