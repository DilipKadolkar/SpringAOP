package com.training;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;


public class BeforeAdvisor implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
			System.out.println("BeforeAdvisor.before() called");
			System.out.println("Method Info: "+arg0);
			for (Object object : arg1) {
				System.out.println("Object : "+object);
			}
			System.out.println("arg2 = "+arg2);
			
	}

}
