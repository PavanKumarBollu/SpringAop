package com.pavan.dao;

import org.springframework.stereotype.Component;

import com.pavan.annotation.MyAnnotationAspect;

@Component
public class StudentDao {
	
	@MyAnnotationAspect
	public int saveStudent()
	{
		System.out.println("Student Saved Successfully.....");
		return 10;
	}
}
