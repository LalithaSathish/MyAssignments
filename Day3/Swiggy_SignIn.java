package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy_SignIn {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='create an account']")).click();
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("0987654321");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("SaDhiLaThiyali");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@abc.com");
		
		driver.findElement(By.xpath("//div[@class='_1cmcE _3R9Dd']")).click();
		
	}
}
