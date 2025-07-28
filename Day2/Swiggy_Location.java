package Day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy_Location {

	public static void main(String[] args) throws InterruptedException, AWTException{

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Enter your delivery location']")).sendKeys("Medavakkam");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
				
		System.out.println(driver.getTitle());

	}

}
