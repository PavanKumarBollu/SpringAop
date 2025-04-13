package com.pavan.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {
	
	
	
	@Before
	public void before()
	{
		System.out.println("Transaction has Begin");
	}
}
