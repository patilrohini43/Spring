package com.bridgelabz.depandancyInje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	
public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config loaded");
		Student stud=context.getBean("student",Student.class);
		stud.displayStudentInfo();

}
}