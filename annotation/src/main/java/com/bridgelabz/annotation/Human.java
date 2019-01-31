package com.bridgelabz.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	
	private Heart heart;
	
	
	
   @Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("Constructor Called");
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Method Called");
	}
	
	public void Startpumping()
	{
		if(heart != null)
		{
		heart.pump();
	}else
	{
		System.out.println("You are Dead");
	}
	}

}
