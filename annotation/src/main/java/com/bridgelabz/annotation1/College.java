package com.bridgelabz.annotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("college")
public class College {
	
	@Autowired
	private Principal principal;
	@Autowired
	private Teacher teacher;
	
	

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public College(Principal principal) {
		super();
		this.principal = principal;
	}


	public void test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing methods called");
	}

}
