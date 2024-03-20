package com.springrest.project.model;

public class Employee {
	
	private int employeeId;
	private String firstName;
//	private String lastName;
//	private String emailId;
//	private String phone;
//	private String managerId;
	private String role;
	
	public Employee() {
		
	}

	
	public Employee(int employeeId, String firstName, String role) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.role = role;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getManagerId() {
//		return managerId;
//	}
//	public void setManagerId(String managerId) {
//		this.managerId = managerId;
//	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
