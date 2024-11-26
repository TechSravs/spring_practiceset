package com.files.referencetype;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApplication {

	public static void main(String[] args) {
		
		System.out.println("project Execution started...!!!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/files/referencetype/config.xml");
		
		B b=context.getBean("refB",B.class);
	    System.out.println(b);
		
 		A a=context.getBean("refa",A.class);
 		System.out.println(a);
		System.out.println("project Execution completed...!!!!!");
		
	}
}
