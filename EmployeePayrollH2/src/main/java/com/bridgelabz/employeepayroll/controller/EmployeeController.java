package com.bridgelabz.employeepayroll.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayroll.models.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.models.ResponseDTO;
import com.bridgelabz.employeepayroll.service.IEmployeePayrollService;


@RestController
@Slf4j
@RequestMapping("/EmployeePayroll")
public class EmployeeController {
	
	@Autowired
	private IEmployeePayrollService employeePayrollService;
	
	@RequestMapping(value = {"/","","/getData"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successful",
				employeePayrollService.getEmployeePayrollData());
		log.debug("Get Call Successful");
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@RequestParam int id){
		ResponseDTO responseDTO = new ResponseDTO("Get Call ID Successful",
				employeePayrollService.getEmployeePayrollDataById(id));
		log.debug("Get Call ID Successful");
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Successfully", 
				employeePayrollService.addEmployeePayrollData(employeePayrollDTO));
		log.debug("Created Employee Payroll Successfully");
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int id,@RequestBody EmployeePayrollDTO employeePayrollDTO){
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Successfully", 
				employeePayrollService.updateEmployeePayrollData(id,employeePayrollDTO));
		log.debug("Created Employee Payroll Successfully");
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@RequestParam int id){
		employeePayrollService.deleteEmployeePayrollData(id);
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", 
				id);
		log.debug("Created Employee Payroll Successfully");
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
}
