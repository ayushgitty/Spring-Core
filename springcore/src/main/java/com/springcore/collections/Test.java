package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/collections/colconfig.xml");
		Emp employee = (Emp) context.getBean("employee");
		System.out.println(employee.getName());
		System.out.println(employee.getPhones());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCourses());

	}

}
