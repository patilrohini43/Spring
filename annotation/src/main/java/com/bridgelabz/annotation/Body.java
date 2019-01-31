package com.bridgelabz.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{
    public static void main(String[] args)
    {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config loaded");
		Human human=context.getBean("human",Human.class);
		human.Startpumping();
    }
}
