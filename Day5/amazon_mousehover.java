package Day5;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_mousehover {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a =new Actions (driver);
		WebElement mousehover=driver.findElement(By.xpath("//div[@id='nav-link-amazonprime']"));
		a.moveToElement(mousehover).perform();
		
		driver.findElement(By.xpath("//div[@class='student-nav-content-img']")).click();
		
		System.out.println(driver.getTitle());
	}
}
