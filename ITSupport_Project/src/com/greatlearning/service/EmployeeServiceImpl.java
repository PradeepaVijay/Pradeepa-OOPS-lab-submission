package com.greatlearning.service;
import com.greatlearning.model.Employee;
import java.util.Random;
public class EmployeeServiceImpl implements EmployeeService {
	
	
   public String generateEmail(Employee e) {
		// TODO Auto-generated method stub
		return e.getFirstName() + e.getLastName() + e.getDepartmentID() + "@gl.com";
	}

@Override
public String generatePassword() {
	int length = 10;
    String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    String specialCharacters = "!@#$";
    String numbers = "1234567890";
    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
    Random random = new Random();
    char[] password = new char[length];

    password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
    password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
    password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
    password[3] = numbers.charAt(random.nextInt(numbers.length()));
 
    for(int i = 4; i< length ; i++) {
       password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
    }
    String str = String.valueOf(password);
    return str;
 }

}
