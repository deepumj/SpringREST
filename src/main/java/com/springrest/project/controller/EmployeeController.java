package com.springrest.project.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.project.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	public Employee emp;
	
	@GetMapping("{empId}")
	public Employee getEmpDetails(String empId) {
		
		//return new Employee(1,"Deepak","TA");
		return emp;
		
	}
	
	@PostMapping
	public String createEmployee(@RequestBody Employee emp)
	{
		this.emp=emp;
		return "Done";
	}
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee emp)
	{
		this.emp=emp;
		return "Update Done";
	}
	
	@DeleteMapping("{empId}")
	public String deleteEmployee(String empId) {
		this.emp=null;
		return "Deleted";
	}
}
