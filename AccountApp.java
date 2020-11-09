package com.danskeit.training.pl;

import com.danskeit.training.basic.Account;


public class AccountApp {

	public static void main(String[] args) {
//		Account a1=new Account();//heap meomory 
		//a1 is a reference variable
		//constructor -- special method in every java class which have same name of the class name 
			//without any return even without void -- default constructor
		Account a2=new Account();
		Account a3=new Account(124, "Manish", 5678);
		
		Account a1=new Account("Suma",45678);
		a1.setAcc_num(123);
		System.out.println("Account got create with the accnum"+a1);
		//a1.setAccount(123, "Suma", 4567);
//		a1.setAcc_num(123);
//		a1.setAcco_holder_name("Suma");
//		a1.setBalance(5678);
		//Account.bankName="ss";
//		Account a2=new Account();
//		
//		a2.acc_num=987;
//		a2.acc_holder_name="Mahesh";
//		a2.balance=5000;
		
		System.out.println(a1);
		//System.out.println(a2);
		
	System.out.println(a1.withdraw(1000));
		
		
	}

}
