package com.pavan.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public void saveEmployee()
	{
		System.out.println("EmployeeDao.saveEmployee()");
	}
	
	public void getEmployee()
	{
		System.out.println("EmployeeDao.getEmployee()");
	}
	
	public String deleteEmployee()
	{
		return "Employee deleted Successfully ::::";
	}
	
}
