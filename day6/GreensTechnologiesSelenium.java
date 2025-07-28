package day6;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologiesSelenium {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		WebElement scroll=driver.findElement(By.xpath("(//div[@class='card']/div/h2)[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		driver.findElement(By.xpath("(//div[@class='card']/div/h2)[6]")).click();
		driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']")).click();
		
		
	}
}
