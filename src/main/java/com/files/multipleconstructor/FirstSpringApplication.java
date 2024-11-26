package com.files.multipleconstructor;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApplication {

	public static void main(String[] args) {
		
		System.out.println("project Execution started...!!!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/files/multipleconstructor/config.xml");
		
		Test a=context.getBean("test1", Test.class);
		a.add();
		System.out.println(a);
		System.out.println("project Execution completed...!!!!!");
		
	}
}
