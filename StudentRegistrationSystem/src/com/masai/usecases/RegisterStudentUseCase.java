package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class RegisterStudentUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Details");
		
		
		StudentDao dao = new StudentDaoImpl();
	
		
		while(true) {
			
			System.out.println("Enter Student Student Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter the Student address: ");
			String address = sc.nextLine();
			
			System.out.println("Enter Student Email: ");
			String mail = sc.nextLine();
			
			System.out.println("Enter The Student Password: ");
			String password = sc.nextLine();
			
			Student student = new Student();
			
			student.setName(name);
			student.setAddress(address);
			student.setPassword(password);
			student.setEmail(mail);
			
			try {
				System.out.println(dao.registerStudent(student));
			} catch (StudentException e) {
                System.out.println(e.getMessage());
			}
			
			System.out.println("Do you want to register more student?(Y/N)");
			String res = sc.nextLine();
			if(res.equalsIgnoreCase("N")) {
				System.out.println("Thank you for registeration..");
				break;
			}
			
			
		}
		
	}
	
	

}
