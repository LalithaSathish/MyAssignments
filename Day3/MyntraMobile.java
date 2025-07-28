package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraMobile {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); // disables notification
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("0987654321");
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();


	}
}
