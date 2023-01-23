package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception.CourseException;
import com.masai.model.StudentCourseDTO;
import com.masai.utility.DBUtil;

public class CourseDaoImpl implements CourseDao {

	@Override
	public List<StudentCourseDTO> getAllStudentByCourseName(String courseName) throws CourseException {
		  List<StudentCourseDTO> list = new ArrayList<>();
		  
		  try(Connection conn = DBUtil.provideConnection()) {
			  
			  PreparedStatement ps =  conn.prepareStatement("select s.roll,s.name,s.address,s.email,c.cname,c.fee,c.duration from student s INNER JOIN course c INNER JOIN student_course sc ON s.roll=sc.roll AND c.cid=sc.cid AND c.cname=?");
			  ps.setString(1, courseName);
			  ResultSet rs = ps.executeQuery();
			  
			  while(rs.next()) {
				
				  StudentCourseDTO dto = new StudentCourseDTO();
				  dto.setRoll(rs.getInt("roll"));
				  dto.setName(rs.getString("name"));
				  dto.setAddress(rs.getString("address"));
				  dto.setEmail(rs.getString("email"));
				  dto.setCname(rs.getString("cname"));
				  dto.setFee(rs.getInt("fee"));
				  dto.setDuration(rs.getString("duration"));
				  
				  list.add(dto);
			  
			  }
				  
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CourseException(e.getMessage());
		}
		  
		  
		  return list;
	}

}
