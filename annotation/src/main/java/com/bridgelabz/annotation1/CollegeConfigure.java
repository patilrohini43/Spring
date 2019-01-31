package com.bridgelabz.annotation1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration 
@ComponentScan(basePackages ="com.bridgelabz.annotation1")

public class CollegeConfigure {
	
	/*
  public Teacher mathTeacherBean()
  {
	  return new MathTeacher();
  }
	
	@Bean
	public Principal principalBean()
	{
		Principal principal=new Principal();
		return principal;
		
	}
	
	
	@Bean
	public College collegeBean()
	{
		College college=new College(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
		
	}
*/
}
