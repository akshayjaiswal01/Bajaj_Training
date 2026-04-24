package com.training.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Student;

public class StudentJDBCTemplate implements StudentDao
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(ds);
		
	}

	@Override
	public void create(String name, int age) 
	{
		String sql = "Insert into student (name, age) values (?, ?)";
		
		jdbcTemplate.update(sql, name, age);
		
		System.out.println("Inserted Record: Name = " + name + ", Age = " + age);
		
	}
	
	public List<Student> listStudents()
	{
		String sql = "select * from student";
		
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		
		return students;
	}

}
