package Day2;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal_Login {
	public static void main(String[] args) throws InterruptedException, AWTException{

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='col-xs-24']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
	
	}
	
}
