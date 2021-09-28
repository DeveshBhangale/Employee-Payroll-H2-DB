package com.bridgelabz.employeepayroll.models;

import javax.persistence.Table;

@Table(name="employee_payroll1")
public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.id = id;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
	
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
