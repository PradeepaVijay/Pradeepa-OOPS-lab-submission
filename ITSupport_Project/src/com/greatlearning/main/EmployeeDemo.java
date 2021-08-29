
package com.greatlearning.main;
//import com.greatlearning.service.*;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.*;
public class EmployeeDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//Employee employee = new Employee(firstName,lastName);
		//public void employee() {
		System.out.println("Enter first name");
		String firstName = sc.next();
		//Employee e = new Employee();
		System.out.println("Enter last name");
		String lastName=sc.next();
		System.out.println("Enter department ");
		String deptName = sc.next();
		Employee emp = new Employee(firstName, lastName, deptName);
		EmployeeService ies = new EmployeeServiceImpl();
		System.out.println(ies.generateEmail(emp));
		System.out.println(ies.generatePassword());
		
}
}