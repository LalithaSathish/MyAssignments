package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(1000);
		WebElement FirstItem=driver.findElement(By.xpath("(//div[@class='product-img'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", FirstItem);
		
		Thread.sleep(1000);
		WebElement product=driver.findElement(By.xpath("(//div[@class='product_name'])[5]"));
		Actions act=new Actions(driver);
		act.contextClick(product).perform();
		
		Thread.sleep(1000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		String ParentID=driver.getWindowHandle();
		
		Set<String> windows=driver.getWindowHandles();
		Thread.sleep(1000);
		
		for (String string : windows) {
			if (!string.equals(ParentID)) {
				driver.switchTo().window(string);
			}
		}
		Thread.sleep(1000);
		System.out.println("Title of the page from Child Window "+driver.getTitle());
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(ParentID);
		System.out.println("Title of the page from parent Window "+driver.getTitle());
		//driver.close();
	}
}
