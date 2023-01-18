package com.masai.dao;

import java.sql.ResultSet;
import java.util.List;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public interface StudentDao {

	//fine grain details
	public String insertStudentDetails(int roll, String name, String address, int marks);
	
	//coarse grain details
	public String insertStudentDetails2(Student student);
	
	
	public int getStudentMarksByRoll(int roll) throws StudentException;
	
	public Student getStudentDetailsByRoll(int roll)throws StudentException;
	
	public List<Student> getAllStudentDetails() throws StudentException;
	
	
	
	
	
	
	
	
	
	
}
