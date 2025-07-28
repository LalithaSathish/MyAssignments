package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_Greens {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.firefox.driver", "D:\\\\Greens Technologies\\\\Selenium_Workspace\\\\Selenium_DailyTask\\\\Learn_Selenium\\\\Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.greenstechnology.com");
		
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		driver.close();
		
	}

}
