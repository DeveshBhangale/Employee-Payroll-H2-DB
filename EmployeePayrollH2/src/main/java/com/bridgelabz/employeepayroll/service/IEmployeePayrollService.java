package com.bridgelabz.employeepayroll.service;

import java.util.List;


import com.bridgelabz.employeepayroll.models.Employee;
import com.bridgelabz.employeepayroll.models.EmployeePayrollDTO;

public interface IEmployeePayrollService {
	List<Employee> getEmployeePayrollData(); 
	
	List<Employee> getEmployeePayrollDataById(int id) ;
	
	Employee addEmployeePayrollData( EmployeePayrollDTO employeePayrollDTO);
	

	
	void deleteEmployeePayrollData(int id);

	Employee updateEmployeePayrollData(int id, EmployeePayrollDTO empPayrollDTO);

	}
