package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip_FromTo {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='from_station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='to_station']")).sendKeys("Salem");
		driver.findElement(By.xpath("//button[@id='trainFormButton']")).click();
		
	}

}
