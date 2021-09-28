package com.bridgelabz.employeepayroll.models;

import java.sql.Date;

import javax.persistence.Table;

@Table(name="employee_payroll")
public class Employee {
	private int id;
	private String name;
	private char gender;
	private double salary;
	private Date start;
	
	public Employee(int id, String name, char gender, double salary, Date start) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.start = start;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", start="
				+ start + "]";
	}
	
	
	
}