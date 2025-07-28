package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_FaceBook {
	
	public static void main(String[] args) {

		System.setProperty("WebDriver.firefox.driver", "D:\\\\Greens Technologies\\\\Selenium_Workspace\\\\Selenium_DailyTask\\\\Learn_Selenium\\\\Driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		String pagetitle=driver.getTitle();

		System.out.println(pagetitle);

		driver.close();

	}
}
