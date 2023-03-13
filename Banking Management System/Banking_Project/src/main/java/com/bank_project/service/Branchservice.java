package com.bank_project.service;

import java.util.List;

import com.bank_project.entity.Account;
import com.bank_project.entity.Branch;

public interface Branchservice {

	List<Branch> getlist();

	Account getaccount(int accountnumber);

	void getadd(Branch branch);

	void getupdate(Branch branch);

}
