package com.pavan.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {
	
	@Pointcut(value = "@annotation(com.pavan.annotation.MyAnnotationAspect)")
	public void save() {}
	
	
	@Before(value = "save()")
	public void before()
	{
		System.out.println("Transaction has Begin ..... ");
	}
	
	@After(value="save()")
	public void after()
	{
		System.out.println("Tansaction commited ......");
	}
}
