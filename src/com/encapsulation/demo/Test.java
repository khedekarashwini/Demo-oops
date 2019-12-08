package com.encapsulation.demo;
class Account
{
    private double balance=1000;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double deposit) {
		this.balance = balance+deposit;
	}
    
 
}
public class Test {

	public static void main(String[] args) {
		Account a=new Account();
		System.out.println("Default balance...."+a.getBalance());
		a.setBalance(4000);
		System.out.println("After Deposit...."+a.getBalance());

	}

}
