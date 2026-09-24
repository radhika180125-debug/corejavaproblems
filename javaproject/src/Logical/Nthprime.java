package Logical;
import java.util.Scanner;

public class Nthprime {
	public static void main(String[]args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("nth prime enter number");
		int n=sc.nextInt();
		int count=0;
		int num=1;
		while(count<n);
		num++;
		boolean prime=true;
		for(int i=2; i<=n; i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			count++;
		}
	
	System.out.println("number  of prime number="+count);
}
}
