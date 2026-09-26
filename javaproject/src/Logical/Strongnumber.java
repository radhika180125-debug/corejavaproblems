package Logical;
import java.util.Scanner;
public class Strongnumber {
	public static void main(String[]args) {
		System.out.println("main methos started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0;
		int original=n;
		while(n>0) {
			int digits=n%10;
			n=n/10;
			int fact=1;
			for(int i=1; i<=digits;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			if(sum==original) {
       System.out.println("original is a strong number");
			}else {
	   System.out.println("123"
	   		+ "original is not a strong number");
			}
		}
	}
}
				

