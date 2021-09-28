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
	public List<Employee> getEmployeePayrollDataById(int empId) {
		return employeePayrollList;
	}

	@Override
	public Employee addEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		Employee employeeData= new Employee(employeePayrollList.size()+1,empPayrollDTO);
		employeePayrollList.add(employeeData);
		return employeeData;
	}

	@Override
	public Employee updateEmployeePayrollData(int id, EmployeePayrollDTO empPayrollDTO) {
		employeePayrollList.get(id).setName(empPayrollDTO.getName());
		employeePayrollList.get(id).setSalary(empPayrollDTO.getSalary());
		return employeePayrollList.get(id);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		employeePayrollList.remove(empId-1);
	}
}