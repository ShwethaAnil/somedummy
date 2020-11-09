/**
 * 
 */
package com.danskeit.training.basic;

/**
 * @author shwet
 * 
 */
public class Account {
	private long acc_num; //instance variables
	private String acc_holder_name;
	private double balance;
	final static String bankName="SDFG";
	//overloading
	public Account() {//no arg constructor
		
	}
	public Account( String acc_holder_name, double balance) {
		this.acc_holder_name = acc_holder_name;
		this.balance = balance;
	}
	
	
	
	public Account(long acc_num, String acc_holder_name, double balance) {
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.balance = balance;
	}

	public String toString() {
		return "Account [acc_num=" + acc_num + ", acc_holder_name=" + acc_holder_name + ", balance=" + balance + "]";
	}
	public long getAcc_num() {
		return acc_num;
	}




	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}




	public String getAcc_holder_name() {
		return acc_holder_name;
	}




	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	//withdraw, deposit, getBalance, 
	//amount is local var
	public	double withdraw(int amount){ // method declaration
	//method body
		balance=balance-amount;
		return balance;
	}
	
	public double deposit(int amount){ // method declaration
	//method body
	balance=balance+amount;
	return balance;
	}
	
	
}
