package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal_Sign {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions hover=new Actions(driver);
		hover.moveToElement(sign).perform();
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		Thread.sleep(3000);
		WebElement mobile=driver.findElement(By.xpath("//form[@id='commonView']"));
		mobile.click();
		mobile.sendKeys("0987654321");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
	}
}
