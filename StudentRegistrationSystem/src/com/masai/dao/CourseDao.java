package com.masai.dao;

import java.util.List;

import com.masai.exception.CourseException;
import com.masai.model.StudentCourseDTO;

public interface CourseDao {
	
	public List<StudentCourseDTO> getAllStudentByCourseName(String courseName)throws CourseException;

}
