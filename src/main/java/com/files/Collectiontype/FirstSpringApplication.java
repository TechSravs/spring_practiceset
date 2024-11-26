package com.files.Collectiontype;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApplication {

	public static void main(String[] args) {
		
		System.out.println("project Execution started...!!!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/files/Collectiontype/config.xml");		
 		Eployee p= context.getBean("Eployee1",Eployee.class );
 		System.out.println(p);
		
		System.out.println("project Execution completed...!!!!!");
		
	}
}
