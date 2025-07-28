package day6;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech_Content {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scroll=driver.findElement(By.xpath("(//div[@class='card']//div//h2)[7]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		driver.findElement(By.xpath("(//div[@class='card']//div//h2)[1]")).click();
		driver.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
		String ParentWindow=driver.getWindowHandle();
		Set<String> links=driver.getWindowHandles();
		
		for (String string : links) {
			if (!string.equals(ParentWindow)) {
				driver.switchTo().window(string);
			}
		}
		System.out.println("CTS Interview Question opened and the page title is "+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		driver.close();
	}
}
