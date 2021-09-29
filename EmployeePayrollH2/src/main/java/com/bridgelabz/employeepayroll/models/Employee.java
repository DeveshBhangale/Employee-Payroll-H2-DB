package com.bridgelabz.employeepayroll.models;

import lombok.Data;

import javax.persistence.Table;

@Table(name="employee_payroll1")
public @Data class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.id = id;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
