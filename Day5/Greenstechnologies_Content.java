package Day5;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstechnologies_Content {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement course=driver.findElement(By.xpath("//div[text()='Courses ']"));
		WebElement softwaretesting=driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		WebElement SeleniumTraining=driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(course).perform();
		act.moveToElement(softwaretesting).perform();
		SeleniumTraining.click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
	}
}
