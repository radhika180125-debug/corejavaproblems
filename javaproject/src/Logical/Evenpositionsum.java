package Logical;
import java.util.Scanner;

public class Evenpositionsum{
	public static void main(String[]args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0;
		int position=1;
		
		while(n>0) {
			int digits=n%10;
			if(position%2==0) {
				n=n/10;
			}
			sum=sum+digits;
			position++;
		}
		System.out.println("sum of digits at even position="+sum);
	}
}
