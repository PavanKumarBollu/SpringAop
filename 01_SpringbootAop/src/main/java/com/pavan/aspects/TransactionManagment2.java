package com.pavan.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagment2 {

	@Pointcut(value = "execution(public * com.pavan.dao.EmployeeDao.saveEmployee())")
	public void save() {

	}
	
	@Pointcut(value = "execution(public * com.pavan.dao.EmployeeDao.deleteEmployee() )")
	public void delete() {}
	
	@Pointcut(value="save() || delete()")
	public void operation() {}

	@Before(value = "operation()")// JoinPoint
	public void begingTansaction() {
		System.out.println("Transactionhas Begin .....");
	}

	@After(value="operation()")
	public void commitTansaction() {
		System.out.println("Transaction Commited .....");
	}

}
