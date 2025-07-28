package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkart_toys {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[5]")).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Baby & Kids']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Remote Control Toys']")).click();
		
		if(driver.findElement(By.xpath("//h1[@class='BUOuZu']")).getText().equals("Remote Control Toys")) {
			System.out.println("Successfully opened Remote Control Toys");
		}else {
			System.out.println("Failed to open Remote Control Toys");
		}
	}
}
