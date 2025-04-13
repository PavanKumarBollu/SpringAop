package com.pavan.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManagment {

	
	
	public void begingTansaction()
	{
		System.out.println("Transactionhas Begen");
	}
	public void commitTansaction()
	{
		System.out.println("Transaction Commited ...");
	}
	
	
}
