package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//label[@class='_aa48']/input)[1]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']/div")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}

}
