package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		
		Sim sim = context.getBean(Sim.class,"sim");
		sim.calling();
		sim.data();
	}
}
