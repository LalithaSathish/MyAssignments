package Day5;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart_mousehover {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[1]")).click();
		
		Actions a =new Actions (driver);
		WebElement mouseHover=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		a.moveToElement(mouseHover).perform();
		
		driver.findElement(By.xpath("//a[@title='Bath Towels']")).click();
		Thread.sleep(3000);
		
		List<WebElement> result=driver.findElements(By.xpath("//a[@class='wjcEIp']"));
		System.out.println("Bath towels are below: \n");
		for (WebElement webElement : result) {
			System.out.println(webElement.getText());
		}
	}
}
