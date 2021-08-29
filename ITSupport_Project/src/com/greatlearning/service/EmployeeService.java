package com.greatlearning.service;
import com.greatlearning.model.Employee;
public interface EmployeeService {
	public String generatePassword();
	public String generateEmail(Employee e);

}
