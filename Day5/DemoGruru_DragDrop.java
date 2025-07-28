package Day5;
/*
 URL : http://demo.guru99.com/test/drag_drop.html
NOTE: Drag and drop bank in Account ,5000 in amount at debited side
Drag and drop sales in Account ,5000 in amount at credited side
 */

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGruru_DragDrop {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[2]")));
		
		Actions a=new Actions(driver);
		WebElement B2A_source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement B2A_Destination=driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(B2A_source, B2A_Destination).build().perform();
		
		Thread.sleep(2000);
		WebElement F2A_source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement F2A_Destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(F2A_source, F2A_Destination).build().perform();
		
		Thread.sleep(2000);
		WebElement S2A_source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement S2A_Destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(S2A_source, S2A_Destination).build().perform();
		
		Thread.sleep(2000);
		WebElement A2C_source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement A2C_Destination=driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(A2C_source, A2C_Destination).build().perform();
	}

}
