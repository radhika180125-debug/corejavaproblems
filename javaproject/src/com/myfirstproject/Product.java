package com.myfirstproject;

public class Product {
	int productid;
	String productName;
	double productprice;
	String productinfo;
	
	static String companyName="ABC comapny";
	void show() {
		System.out.println("product id:"+productid);
		System.out.println("product Name:"+productName);
		System.out.println("product price:"+productprice);
		System.out.println("product info:"+ productinfo);
}
public static void main(String[]args) {
	Product p=new Product();
	p.productid=101;
	p.productName="laptop";
	p.productprice=50000;
	p.productinfo="hp laptop";
	p.show();
}
}


	
	

