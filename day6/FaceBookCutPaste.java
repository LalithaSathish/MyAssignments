package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookCutPaste {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("WebDriver.driver.chrome", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("9876543210");
		
		Robot cutpaste=new Robot();
		
		driver.findElement(By.id("email")).click();
		Thread.sleep(3000);

		cutpaste.keyPress(KeyEvent.VK_CONTROL);
		cutpaste.keyPress(KeyEvent.VK_A);
		cutpaste.keyRelease(KeyEvent.VK_CONTROL);
		cutpaste.keyRelease(KeyEvent.VK_A);
		
		
		cutpaste.keyPress(KeyEvent.VK_CONTROL);
		cutpaste.keyPress(KeyEvent.VK_X);
		cutpaste.keyRelease(KeyEvent.VK_CONTROL);
		cutpaste.keyRelease(KeyEvent.VK_X);
		
		driver.findElement(By.id("pass")).click();
		
		cutpaste.keyPress(KeyEvent.VK_CONTROL);
		cutpaste.keyPress(KeyEvent.VK_V);
		cutpaste.keyRelease(KeyEvent.VK_CONTROL);
		cutpaste.keyRelease(KeyEvent.VK_V);	
		
	}
}
