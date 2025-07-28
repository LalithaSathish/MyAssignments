package week3.day1;

public class Safari extends Browser{
	
	public void readerMode() {
		System.out.println("readerMode from Safari class");

	}
	public void fullScreenMode() {
		System.out.println("fullScreenMode from Safari class");

	}
	public static void main(String[] args) {
		Safari sf=new Safari();
		System.out.println(sf.browserName="Chrome");
		System.out.println(sf.browserVersion=1.1f);
		sf.openURL();
		sf.closeBrowser();
		sf.navigateBack();
		sf.readerMode();
		sf.fullScreenMode();
	}

}
