package com.gaurav.java.thread;

public class Account {

	public synchronized void withdraw()
	{
		for (int i = 0; i < 8; i++) {
			
			System.out.println("You account is gettin withdraw::"+Thread.currentThread().getName());
		}
	}
	public synchronized void withdraw2()
	{
		for (int i = 0; i < 8; i++) {
			
			System.out.println("You account is gettin withdraw2::"+Thread.currentThread().getName());
		}
	}
	public  void withdraw3()
	{
		for (int i = 0; i < 8; i++) {
			
			System.out.println("You account is gettin withdraw3::"+Thread.currentThread().getName());
		}
	}
}
class MyThreadNew extends Thread
{
	Account account;
	public MyThreadNew(Account account) {
		this.account=account;
	}
	
	@Override
	public void run() {
		account.withdraw();
		account.withdraw2();
		account.withdraw3();
	}
}