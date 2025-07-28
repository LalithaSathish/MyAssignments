package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenStech_CourseContent {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement scrolldown=driver.findElement(By.xpath("//h2[contains(text(),'Framework Test Papers')]/parent::div"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",scrolldown);
		
		driver.findElement(By.xpath("//div[@id='heading201']")).click();
		driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]")).click();
		System.out.println(driver.getTitle());
	
	}
}
