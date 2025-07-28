package Day5;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstechnologies_microstategy {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement course=driver.findElement(By.xpath("//div[text()='Courses ']"));
		Actions act=new Actions(driver);
		act.moveToElement(course).perform();
		
		WebElement DataWarehousing=driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		act.moveToElement(DataWarehousing).perform();
		
		driver.findElement(By.xpath("//span[text()='DataStage Certification Training']")).click();
		
	}
}
