package com.myfirstproject;
class objectcount{
	static int count=0;
	objectcount(){
		count++;
	}
	static void staticMethod1() {
		System.out.println("Static Method1");
	}
	static void StaticMethod2() {
		System.out.println("static Method2");
	}
	static void StaticMethod3() {
		System.out.println("staticMethod3");
	}
	void instanceMethod1() {
		System.out.println("instanceMethod1");
	}
	 void instanceMethod2() {
		 System.out.println("instanceMethod2");
	 }
	 public static void main(String[]args) {
		 objectcount obj1=new objectcount();
		 objectcount obj2=new objectcount();
		 objectcount obj3=new objectcount();
		 objectcount obj4=new objectcount();
		 objectcount obj5=new objectcount();
		 System.out.println("total objects created:"+count);
		 staticMethod1();
	
}



		 
	 
	 
	 
			
			
			
			
	}
	
	
		
	

		
