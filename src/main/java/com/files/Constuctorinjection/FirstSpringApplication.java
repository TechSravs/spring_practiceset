package com.files.Constuctorinjection;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApplication {

	public static void main(String[] args) {
		
		System.out.println("project Execution started...!!!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/files/Constuctorinjection/config.xml");
		Dept d=context.getBean("refDept", Dept.class);
		System.out.println(d);
		Emp e=context.getBean("refEmp", Emp.class);
		System.out.println(e);
		System.out.println("project Execution completed...!!!!!");
		
	}
}
