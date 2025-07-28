package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser_Greens {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.internetexplorer.driver", "D:\\\\Greens Technologies\\\\Selenium_Workspace\\\\Selenium_DailyTask\\\\Learn_Selenium\\\\Driver\\IEDriverServer.exe");

		WebDriver driver=new InternetExplorerDriver();

		driver.get("http://www.greenstechnology.com");

		String pagetitle=driver.getTitle();

		System.out.println(pagetitle);
	}
}