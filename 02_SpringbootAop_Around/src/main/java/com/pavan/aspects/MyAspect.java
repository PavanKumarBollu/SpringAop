package com.pavan.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	// pointcut
	@Pointcut(value = "execution(public * com.pavan.dao.EmployeeDao.saveEmployee())" )
	public void save() {}
	
	@Around(value = "save()")
	public void around(ProceedingJoinPoint jp)
	{
		System.out.println("Transaction Begin.....");
		try {
			Object obj = jp.proceed();
			System.out.println(obj);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Transaction Commited.....");
		
	}
}
