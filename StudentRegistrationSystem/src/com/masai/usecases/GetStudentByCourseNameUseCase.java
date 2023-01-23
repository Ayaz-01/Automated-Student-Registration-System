package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.exception.CourseException;
import com.masai.model.StudentCourseDTO;

public class GetStudentByCourseNameUseCase {
	
	public static void main(String[] args) {
		
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Course Name");
		String courseName = sc.nextLine();
		
		CourseDao dao = new CourseDaoImpl();
		try {
			List<StudentCourseDTO> list = dao.getAllStudentByCourseName(courseName);
			
			if(list.size()==0) {
				System.out.println("Invalid Course Name..");
			}
			list.forEach(d->System.out.println(d));
			
			
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
