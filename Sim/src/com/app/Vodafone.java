package com.app;

public class Vodafone implements Sim {
	
	
	public Vodafone() {
		
		System.out.println("Vodafone Constructor Calling");
	};

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Colling Using Vodafone Sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Borwsing using VodaFone");
	}
	
}
