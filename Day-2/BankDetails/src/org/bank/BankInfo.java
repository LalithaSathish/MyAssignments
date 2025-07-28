package org.bank;

public class BankInfo extends AxisBank{
	public void savings() {
		System.out.println("savings Method from BankInfo Class");
	}
	public void fixed() {
		System.out.println("fixed Method from BankInfo Class");
	}
	
	public static void main(String[] args) {
		BankInfo bi=new BankInfo();
		bi.savings();
		bi.fixed();
		bi.deposit();
	}
}
