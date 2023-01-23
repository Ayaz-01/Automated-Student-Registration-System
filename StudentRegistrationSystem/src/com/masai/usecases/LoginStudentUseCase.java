package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class LoginStudentUseCase {
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Login Details");
		
		
		StudentDao dao = new StudentDaoImpl();
	
		
		while(true) {
			
			System.out.println("Enter Student Email: ");
			String username = sc.nextLine();
			
			System.out.println("Enter the Student Password: ");
			String password = sc.nextLine();

	
			try {
				 Student student = dao.loginStudent(username, password);
				 System.out.println("Welcome "+student.getName());
			} catch (StudentException e) {
                System.out.println(e.getMessage());
			}
			
			System.out.println("Do you want to login for other student?(Y/N)");
			String res = sc.nextLine();
			if(res.equalsIgnoreCase("N")) {
				System.out.println("Thank you");
				break;
			}
			
			
		}
		
		
	}

}
