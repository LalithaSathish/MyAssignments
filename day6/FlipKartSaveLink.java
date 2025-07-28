package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartSaveLink {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[1]")).click();
		Thread.sleep(3000);
		
		WebElement baby=driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions act=new Actions(driver);
		act.moveToElement(baby).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Educational Toys']")).click();
		WebElement product=driver.findElement(By.xpath("(//a[@class='wjcEIp'])[3]"));
		act.contextClick(product).perform();
		
		Robot rbt=new Robot();
		for (int i = 0; i < 6; i++) {
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
}
