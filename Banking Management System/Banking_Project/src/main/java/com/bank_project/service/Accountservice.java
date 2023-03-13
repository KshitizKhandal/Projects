package com.bank_project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bank_project.entity.Account;

@Service
public interface Accountservice {

	List<Account> getall();

	ResponseEntity<String> add(Account account);



}
