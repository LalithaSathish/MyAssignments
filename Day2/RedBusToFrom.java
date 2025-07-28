package Day2;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusToFrom {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='sc-htoDjs kyqvCq']/input)[1]")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='sc-htoDjs kyqvCq']/input)[2]")).sendKeys("Salem");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
