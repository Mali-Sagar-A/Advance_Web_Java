package com.app.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomerUtility {
	
	public static List<Customer> getCustomer()
	{
		List<Customer> l= new ArrayList<Customer>();
		l.add(new Customer("Sagar","Mali","Sagar@gamil.com",true));
		l.add(new Customer("Prasad","Patil","Prasad@gamil.com",true));
		l.add(new Customer("Tejas","Jadhav","Tejas@gamil.com",false));
		l.add(new Customer("Viki","Kamble","Viki@gamil.com",false));
		l.add(new Customer("Zakan","Zulya","Zakan@gamil.com",true));
		
		return l;
	}

}
