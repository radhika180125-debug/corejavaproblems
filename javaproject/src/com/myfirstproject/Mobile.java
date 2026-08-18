package com.myfirstproject;

public class Mobile {
	static String company="Samsung";
	String brand;
	String model;
	double price;
	int ram;
	static {
		System.out.println("static block executed");
	}
	{
		System.out.println("instance block executed");
	}
	static void displaycompany() {
		System.out.println("Company:"+company);
	}
	void displaymobile() {
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("price:"+price);
		System.out.println("Ram:"+ram);
	}
	public static void main(String[]args) {
		displaycompany();
		Mobile m1=new Mobile();
		m1.brand="Samsung";
		m1.model="Galaxy";
		m1.price=60000;
		m1.ram=12;
		Mobile m2=new Mobile();
		m2.brand="oneplis";
		m2.model="one plus 13";
		m2.price=70000;
		m2.ram=8;
		Mobile m3=new Mobile();
		m3.brand="Vivo";
		m3.model="Vivo y27";
		m3.price=35000;
		m3.ram=8;
		m1.displaymobile();
		m2.displaymobile();
		m3.displaymobile();
	}
}
		
		
		
		
		
		
		

