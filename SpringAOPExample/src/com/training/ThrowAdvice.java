package com.training;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception e){
		System.out.println("Additional concern if exception occures : "+e);
	}
}
