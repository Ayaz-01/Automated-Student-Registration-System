package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class EnrollStudentUseCase {
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Enrollment Details");
		
		
		StudentDao dao = new StudentDaoImpl();
	
		
		while(true) {
			
			System.out.println("Enter Student Roll No: ");
			int rollNo = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the Course Id: ");
			int courseId = Integer.parseInt(sc.nextLine());

	
			try {
				
				try {
					System.out.println(dao.enrollStudentInCourse(rollNo, courseId));
				} catch (CourseException e) {
					System.out.println(e.getMessage());
				}

			} catch (StudentException e) {
                System.out.println(e.getMessage());
			}
			
			System.out.println("Do you want to register more Student?(Y/N)");
			String res = sc.nextLine();
			if(res.equalsIgnoreCase("N")) {
				System.out.println("Thank you");
				break;
			}
			
			
		}
		
		
		
	}

}
