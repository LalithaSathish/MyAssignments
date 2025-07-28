package Day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBank_Login {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']")).click();
		
		driver.findElement(By.xpath("//input[@title='User Id']")).sendKeys("777777777");
	
		driver.findElement(By.xpath("//input[@class='login-input-password']")).sendKeys("Pass123$");
		
		driver.findElement(By.xpath("//input[@title='Remember User Id']")).click();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println(driver.getTitle());
		
	}

}
