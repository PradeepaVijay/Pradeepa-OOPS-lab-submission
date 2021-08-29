package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String DepartmentID;
	private String lastName;
	
	public Employee(String firstName,String lastName, String DepartmentID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.DepartmentID = DepartmentID;		
		}
	public String getDepartmentID() {
		return DepartmentID;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	

	
}
