package com.myfirstproject;

public class Demo {
	void method1() {
		System.out.println("method1");
	}
	void method2() {
		System.out.println("method2");
	}
	void method3() {
		System.out.println("method3");
	}
	void method4() {
		System.out.println("method4");
	}
	static Demo d= new Demo(); 
		static {
			d.method1();
			d.method2();
			d.method3();
			d.method4();
		}
		public static void main(String[]args) {
		}
}
		

		
