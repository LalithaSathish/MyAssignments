package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_GreensCourseContent {
	
	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		String pagetitle=driver.getTitle();

		System.out.println(pagetitle);

		driver.close();
	}
}
