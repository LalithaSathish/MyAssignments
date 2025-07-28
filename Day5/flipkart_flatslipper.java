package Day5;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkart_flatslipper {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[5]")).click();
		
		WebElement mobile=driver.findElement(By.xpath("//span[text()='Women']"));
		Actions act=new Actions(driver);
		act.moveToElement(mobile).perform();
		
		driver.findElement(By.xpath("//a[@title='Flats']")).click();
		
		WebElement result=driver.findElement(By.xpath("//h1[@class='BUOuZu']"));
		
		if (result.getText().equals("Women's Flats")) {
			System.out.println("Successfully opened Women's Flats page");	
		}else {
			System.out.println("Failed to open Women's Flats page");
		}
	}
}
