package com.bank_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	String employeename;
	@Column
	int salary;

	@ManyToOne
	Branch branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@JsonBackReference
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeename=" + employeename + ", salary=" + salary + ", branch=" + branch
				+ ", getId()=" + getId() + ", getEmployeename()=" + getEmployeename() + ", getSalary()=" + getSalary()
				+ ", getBranch()=" + getBranch() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Employee(int id, String employeename, int salary, Branch branch) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.salary = salary;
		this.branch = branch;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
