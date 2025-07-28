package Day4;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_login {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9876543210");
		
		System.out.println("Entered phone number:- "+driver.findElement(By.xpath("//input[@class='r4vIwl _5BVqVB tuMj3n BV+Dqf']")).getDomProperty("value"));
	}
}
