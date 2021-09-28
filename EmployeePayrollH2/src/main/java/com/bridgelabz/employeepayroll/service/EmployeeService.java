package com.bridgelabz.employeepayroll.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayroll.models.Employee;
import com.bridgelabz.employeepayroll.models.EmployeePayrollDTO;


@Service
public class EmployeeService implements IEmployeePayrollService{
	
	private List<Employee> employeePayrollList = new ArrayList<>();
	
	@Override
	public List<Employee> getEmployeePayrollData() {
		return employeePayrollList;
	}

	@Override
	public Employee getEmployeePayrollDataById(int empId) {
		Employee employeeData=null;
		return employeeData;
	}

	@Override
	public Employee addEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		Employee employeeData=null;
		return employeeData;
	}

	@Override
	public Employee updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		Employee employeeData=null;
		return employeeData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		
	}
}