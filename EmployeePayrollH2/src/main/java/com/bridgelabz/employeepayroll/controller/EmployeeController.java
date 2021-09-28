package com.bridgelabz.employeepayroll.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayroll.models.Employee;
import com.bridgelabz.employeepayroll.models.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.models.ResponseDTO;


@RestController
@RequestMapping("/EmployeePayroll")
public class EmployeeController {
	
	@RequestMapping(value = {"/","","/getData"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successfull", 
				new Employee(1,new EmployeePayrollDTO("Devesh", 30000)));
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@RequestParam int id){
		ResponseDTO responseDTO = new ResponseDTO("Get Call ID Successfull", 
				new Employee(1,new EmployeePayrollDTO("Devesh", 30000)));
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Successfully", 
				new Employee(1,employeePayrollDTO));
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Successfully", 
				new Employee(1,employeePayrollDTO));
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@RequestParam int id){
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", 
				id);
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
}
