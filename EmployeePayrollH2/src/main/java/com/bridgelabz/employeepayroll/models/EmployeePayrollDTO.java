package com.bridgelabz.employeepayroll.models;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public @Data class EmployeePayrollDTO {
	@NotEmpty(message = "Employee Name cannot be null")
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid") String name;

	@Min(value = 500,message = "Minimum Wage should be more than 500")
	public long salary;
	
	public EmployeePayrollDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + getName() + ", salary=" + salary + "]";
	}
	
	
}
