package week3.day2;

public class Amazon extends CanaraBank {

	@Override
	public void recordPaymentDetails() {
		System.out.println("recordPaymentDetails from CanaraBank");
		
	}
	
	public static void main(String[] args) {
		Amazon az=new Amazon();
		az.upiPayments();
		az.cashOnDelivery();
		az.recordPaymentDetails();
		az.internetBanking();
		az.upiPayments();
	}

}
