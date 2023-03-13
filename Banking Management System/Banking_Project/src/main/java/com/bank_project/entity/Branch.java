package com.bank_project.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "branch")
public class Branch {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	String ifsccode;
	@Column
	String branchname;
	@Column
	String branchaddress;

	@Column
	int pincode;

	@OneToMany(mappedBy = "branch")
	List<Employee> employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getBranchaddress() {
		return branchaddress;
	}

	public void setBranchaddress(String branchaddress) {
		this.branchaddress = branchaddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
@JsonManagedReference
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(int id, String ifsccode, String branchname, String branchaddress, int pincode,
			List<Employee> employee) {
		super();
		this.id = id;
		this.ifsccode = ifsccode;
		this.branchname = branchname;
		this.branchaddress = branchaddress;
		this.pincode = pincode;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", ifsccode=" + ifsccode + ", branchname=" + branchname + ", branchaddress="
				+ branchaddress + ", pincode=" + pincode + ", employee=" + employee + ", getId()=" + getId()
				+ ", getIfsccode()=" + getIfsccode() + ", getBranchname()=" + getBranchname() + ", getBranchaddress()="
				+ getBranchaddress() + ", getPincode()=" + getPincode() + ", getEmployee()=" + getEmployee()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
