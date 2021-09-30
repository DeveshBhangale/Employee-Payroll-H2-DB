package com.bridgelabz.employeepayroll.models;



import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="employee_payroll1")

@Data
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;

	public Employee(int id, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.id = id;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;

	}

}
