package com.bridgelabz.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//IOC controller class
public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config loaded");
		Airtel air=context.getBean("airtel",Airtel.class);
		air.Calling();
	    
		VodaFone fone=context.getBean("voda",VodaFone.class);
		fone.Calling();
		fone.Data();
	}

}
