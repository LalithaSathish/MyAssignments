package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_FaceBook {
	
	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

		String pagetitle=driver.getTitle();

		System.out.println(pagetitle);

		driver.close();

	}
}
