package Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("WebDriver.chrome.driver","D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@role='button'])[11]")).click();   
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("greens technology Velachery");
        
       Robot enter=new Robot();
       enter.keyPress(KeyEvent.VK_ENTER);
       enter.keyRelease(KeyEvent.VK_ENTER);
       
       System.out.println("Fill captcha check then any key & enter: ");
       Scanner scan= new Scanner(System.in);
       scan.next();
       
       System.out.println(driver.getTitle());
        
       driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
       System.out.println(driver.getTitle());
  
        
        
        
	}

}
