package com.masai.usecases;

import java.util.ArrayList;
import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.Student;

public class InsertUseCase2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll");
		int roll= sc.nextInt();
		
		System.out.println("Enter name");
		String name= sc.next();
		
		System.out.println("Enter address");
		String address= sc.next();
		
		System.out.println("Enter marks");
		int marks= sc.nextInt();
		
		
		//Student student = new Student(roll, name, address, marks); 
		
		Student student = new Student();
		student.setMarks(marks);
		student.setRoll(roll);
		student.setName(name);
		student.setAddress(address);
		
		
		
		//StudentDaoImpl dao = new StudentDaoImpl();
		
		StudentDao dao = new StudentDaoImpl();
		
		
		String result= dao.insertStudentDetails2(student);
		
		System.out.println(result);
		
		
		
		
		

	}

}
