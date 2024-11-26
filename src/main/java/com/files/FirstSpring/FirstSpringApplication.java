package com.files.FirstSpring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApplication {

	public static void main(String[] args) {
		
		System.out.println("project Execution started...!!!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/files/FirstSpring/config.xml");		
 		Student a=(Student)context.getBean("student1");      
		System.out.println(a);
		
		System.out.println("project Execution completed...!!!!!");
		
	}
}
