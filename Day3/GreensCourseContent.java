package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensCourseContent {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://greenstech.in/selenium-course-content.html");
	
		WebElement wb=driver.findElement(By.xpath("//div[@id='heading304']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",wb);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='heading20']")).click();
		driver.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
		
		
	}
}
