package com.pavan.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	
	public int saveEmployee()
	{
		System.out.println("Employee Saved To Database.....");
		return 1;
	}
	
}
