package week3.day1;

public class Polymorphism {
	
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println("Three input arguments: "+ "msg: "+msg+" Status: "+status+" snap: "+snap);

	}

	public void reportStep(String msg,String status) {
		System.out.println("Two input arguments:  "+"msg: "+msg+" Status: "+status);

	}
	
	public static void main(String[] args) {
		Polymorphism pol=new Polymorphism();
		pol.reportStep("Hello", "Pass");
		pol.reportStep("Hello", "Pass",false);
	}
}
