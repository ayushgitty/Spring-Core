package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		context.registerShutdownHook();
		AlooBonda ab = (AlooBonda)context.getBean("ab");
		System.out.println(ab);
		
		System.out.println("___________________________________________________________________________");
		Pepsi pep = (Pepsi)context.getBean("pep");
		System.out.println(pep);
		
		System.out.println("____________________________________________________________________________");
		Example eg = (Example) context.getBean("eg");
		System.out.println(eg);
		
	}

}
