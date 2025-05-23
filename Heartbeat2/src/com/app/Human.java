package com.app;

public class Human {
	
	private Heart heart;
	
	public Human()
	{
		System.out.println("In Constructor");
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

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
