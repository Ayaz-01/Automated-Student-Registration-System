package com.masai.usecases;

import java.util.List;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;




public class GetAllStudentUseCase {

	public static void main(String[] args) {
		
		
		StudentDao dao = new StudentDaoImpl();
		
		
		try {
			List<Student> students = dao.getAllStudentDetails();
			
				students.forEach(s -> {
				
				System.out.println("Roll is :"+ s.getRoll());
				System.out.println("Name is :"+ s.getName());
				System.out.println("Address is :"+ s.getAddress());
				System.out.println("Marks is :"+ s.getMarks());
				
				System.out.println("==============================");
				
			});
			
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}

			
			
				
		
		
	}

}
