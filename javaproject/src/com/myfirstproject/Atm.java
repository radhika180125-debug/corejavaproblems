package com.myfirstproject;

public class Atm {
	static String bankname="sbi";
	long accountnumber;
	double balance;
	void deposit(double amount) {
		balance = balance + amount;
		
System.out.println("Deposited:"+amount);
	}
	void withdraw(double amount) {
		if (amount<=balance) {
			balance=balance-amount;
System.out.println("withdraw:"+amount);
		}else {
System.out.println("insufficient balance");
		}
	}
	void checkbalance() {
		System.out.println("Account number:"+accountnumber);
		System.out.println("Bank name:"+bankname);
		System.out.println("Balance:"+balance);
	}
	public static void main(String[]args) {
		Atm account1=new Atm();
		Atm account2=new Atm();
		account1.accountnumber=123445666l;
		account1.balance=10000;
		account2.accountnumber=98774443l;
		account2.balance=20000;
		System.out.println("Account1 operations");
		account1.deposit(5000);
		account1.withdraw(3000);
		System.out.println("Account2 operations");
		account2.deposit(10000);
		account2.withdraw(5000);
		System.out.println("final amount details");
		account1.checkbalance();
		account2.checkbalance();
	}
}
		
	
		
		
