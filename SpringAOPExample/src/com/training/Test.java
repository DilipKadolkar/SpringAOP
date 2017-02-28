package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {  

	public static void main(String[] args) throws Exception {  
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		
		Validate validate=(Validate)ctx.getBean("proxy");
		validate.validate1(30);
		
//		A a=(A)ctx.getBean("proxy");
//		a.showA("Test");
		
//		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		
//		dao.createTable("NewTable5");
//		
//		int status=dao.saveEmployee(new Employee(301,"manisha 2222",24000));  
//		System.out.println(status);  
//
//		int status1=dao.updateEmployee(new Employee(301,"Tanish",5000)); 
//		System.out.println(status1); 
//
//		int st=dao.displayRecords();
//		System.out.println(st);
		
		
		//Employee e=new Employee(); 
	//	e.setId(301); 
		//int st=dao.deleteEmployee(e); 
		//System.out.println(st);
		
		
		//int st=dao.displayRecords();
		//System.out.println(st);
	}  
}