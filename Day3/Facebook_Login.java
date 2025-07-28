package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		



	}

}
