package com.bridgelabz.employeepayroll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/EmployeePayroll")
public class EmployeeController {
	
	@RequestMapping(value = {"/","","/connect"})
	public String connect() {
		return "connected";
	}

}
