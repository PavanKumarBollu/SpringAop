package com.pavan.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pavan.dao.EmployeeDao;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeDao dao;
	
	
	@Override
	public void run(String... args) throws Exception {
			dao.saveEmployee();
			System.out.println(" ");
			
			dao.getEmployee();
			System.out.println();
			
			
			String deleteEmployee = dao.deleteEmployee();
			System.out.println(deleteEmployee);
			System.out.println();
	}

}
