package com.DemoApp;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/DemoApp/config.xml");
		
	   Dev d= context.getBean(Dev.class);
	   
	   //System.out.println(d.getAge());
		d.build();

	}
}
