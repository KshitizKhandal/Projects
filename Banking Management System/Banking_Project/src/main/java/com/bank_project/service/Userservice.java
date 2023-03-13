package com.bank_project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bank_project.entity.User;

@Service
public interface Userservice  {

	void getadd(User user);

	List<User> getall();

	ResponseEntity<String> checkbalance(long accountnumber, int pin);

	ResponseEntity<String> withdrawBalance(int amountwithdraw);

	ResponseEntity<String> getInterest(long accountnumber, int pin);

	ResponseEntity<String> deposite(Long accountnumber, int amountnum);



}
