package week3.day1;

public class Edge extends Browser{
	
	public void takeSnap() {
		System.out.println("takeSnap from Edge class");

	}
	public void clearCookies() {
		System.out.println("takeSnap from Edge class");

	}
	public static void main(String[] args) {
		Edge eg=new Edge();
		System.out.println(eg.browserName="Chrome");
		System.out.println(eg.browserVersion=1.1f);
		eg.openURL();
		eg.closeBrowser();
		eg.navigateBack();
		eg.takeSnap();
		eg.closeBrowser();
	}
}
