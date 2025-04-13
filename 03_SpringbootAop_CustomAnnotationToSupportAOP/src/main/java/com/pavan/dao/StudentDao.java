package com.pavan.dao;

import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	
	
	public int saveStudent()
	{
		System.out.println("Student Saved Successfully.....");
		return 10;
	}
}
