package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
	context.registerShutdownHook();//to call destroy method
	Test t =	(Test) context.getBean("lifecycle");
	System.out.println(t);
	
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	
	New n = (New) context.getBean("p1");
	System.out.println(n);
	}

}
