package com.pavan.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pavan.dao.StudentDao;

@Component
public class myRunner implements CommandLineRunner {

	@Autowired
	private StudentDao dao;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		int student = dao.saveStudent();
		System.out.println("Data is" + student);
	}

}
