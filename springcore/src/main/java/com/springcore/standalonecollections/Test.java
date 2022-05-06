package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalonecollections/standconfig.xml");
 
		Person per = context.getBean("person1",Person.class);
		System.out.println(per.getFriends());
		System.out.println(per.getFriends().getClass().getName());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(per.getFeestruct());
		System.out.println(per.getFeestruct().getClass().getName());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(per.getPro());
		System.out.println(per.getPro().getClass().getName());
		
	}

}
