package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkart_Mi {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[5]")).click();
		
		WebElement tvs=driver.findElement(By.xpath("(//span[@class='TSD49J'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(tvs).perform();
		
		driver.findElement(By.xpath("//a[@title='Mi']")).click();
		Thread.sleep(3000);
		
		System.out.println("First product result is: "+driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).getText());
	}
}
