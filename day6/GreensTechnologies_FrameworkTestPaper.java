package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTechnologies_FrameworkTestPaper {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scroll=driver.findElement(By.xpath("(//div[@class='card']/div/h2)[5]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		WebElement FrameWrorkTestpaper=driver.findElement(By.xpath("(//div[@class='card']/div/h2)[8]"));
		Actions act=new Actions(driver);
		act.contextClick(FrameWrorkTestpaper).perform();
		Robot rb=new Robot();
		for (int i = 0; i < 11; i++) {
			Thread.sleep(1000);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
