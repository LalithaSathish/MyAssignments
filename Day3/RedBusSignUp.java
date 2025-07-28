package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSignUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());	
		Thread.sleep(3000);
		driver.findElement(By.xpath("((//div[@class='navOption___3dbbee']/i)[3])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign up']/parent::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9876543210");

	}
}
