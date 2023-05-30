package com.vaishnavi.demo.boottomvc.model;

public class Student {
	private String name;
	private String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + "]";
	}
	
	

}
