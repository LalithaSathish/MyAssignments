package Day5;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class homedepotac {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='sui-flex'])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Shop By Department']")).click();
		driver.findElement(By.xpath("//span[text()='Heating, Cooling, & Air Quality']")).click();
		driver.findElement(By.xpath("//span[text()='Air Conditioners']")).click();
		driver.findElement(By.xpath("//span[text()='Portable Air Conditioners']")).click();
		WebElement ac=driver.findElement(By.xpath("//h1[text()='Portable Air Conditioners']"));
		Thread.sleep(3000);
		if(ac.getText().equals("PORTABLE AIR CONDITIONERS")) {
			System.out.println("Successfully Portable Air Conditioners opened ");
		}else {
			System.out.println("Failed to open Portable Air Conditioners");
		}

	}
}
