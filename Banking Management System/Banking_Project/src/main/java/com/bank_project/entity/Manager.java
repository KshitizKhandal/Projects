package com.bank_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Manager")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column
	String name;

	@OneToOne
	Branch branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", branch=" + branch + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getBranch()=" + getBranch() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Manager(int id, String name, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

}
