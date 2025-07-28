package week3.day2;

public abstract class CanaraBank implements Payments{

	public void cashOnDelivery() {
		System.out.println("cashOnDelivery from interface Payments");
		
	}

	public void upiPayments() {
		System.out.println("upiPayments from interface Payments");
		
	}

	public void cardPayments() {
		System.out.println("cardPayments from interface Payments");
		
	}

	public void internetBanking() {
		System.out.println("internetBanking from interface Payments");
		
	}
	
	public abstract void recordPaymentDetails();


}
