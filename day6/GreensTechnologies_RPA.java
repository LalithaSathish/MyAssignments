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

public class GreensTechnologies_RPA {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);

		WebElement scroll=driver.findElement(By.xpath("//h3[contains(text(),'Top Selenium Trends In 2020')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		Thread.sleep(1000);
		WebElement rpa=driver.findElement(By.xpath("//a[text()='RPA']"));
		Actions act=new Actions(driver);
		act.contextClick(rpa).perform();
		
		Robot rbt=new Robot();
		for (int i = 1; i<=7; i++) {
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
		}
	
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println(driver.getTitle());
		
	}
}
