/**
 * @author waleed
 *
 * 02-Feb-2022
 */

package com.Spring_Jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DbOperations {

	DataSource dataSource;

	JdbcTemplate jdbcTemplate;

	String qry;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	Integer getCountOfStudents() {

		return jdbcTemplate.queryForObject("select count(*) from students", Integer.class);
	}
	
	String getStudentLocation(int studentId, String studentName) {

		return jdbcTemplate.queryForObject("select location from students where userId = ? and userName = ?",
				String.class, 
				new Object[] {studentId, studentName});	
	}
	
	
	Student getStudentDetails(int userId) {
		qry = "select * from students where userId = ?";
		
		return jdbcTemplate.queryForObject(qry, new StudentMapper(), new Object[] {userId});
	}
	
	List<Student> getAllStudents() {
		qry = "select * from students";
		
		return jdbcTemplate.query(qry, new StudentMapper());
	}
	
	
	
//	Create an Inner class that implements RowMapper
	
	class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
//		Map the fields of Student with columns of table
		Student student = new Student(
				rs.getInt("userId"), 
				rs.getString("userName"), 
				rs.getString("userLocation")
				);
		
		return student;
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
