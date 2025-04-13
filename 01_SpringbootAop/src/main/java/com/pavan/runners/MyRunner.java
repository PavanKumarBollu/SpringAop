package com.pavan.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.pavan.dao.EmployeeDao;

public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeDao dao;
	
	
	@Override
	public void run(String... args) throws Exception {
			dao.saveEmployee();
			System.out.println("******");
	}

}
