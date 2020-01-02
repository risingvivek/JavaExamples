package com.vk.quasys.dto;

import lombok.Data;

@Data
public class Employee {
	
	private String name;
	private String department;
	private Double salary;
	

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


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Employee(String name, String department, Double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
}
