package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	//@Autowired
	private Heart heart;
	
	public Human()
	{
		System.out.println("In Constructor");
	}

	//@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void pump()
	{
		if(heart!=null)
		{
			heart.pumping();
		}
		else
		{
			System.out.println("Your Deade..!");
		}
	}
}
