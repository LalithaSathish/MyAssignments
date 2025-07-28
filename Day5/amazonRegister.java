package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class amazonRegister {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mobile=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions act=new Actions(driver);
		act.moveToElement(mobile).perform();
		
		driver.findElement(By.xpath("//a[text()='Start here.']")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		WebElement result=driver.findElement(By.xpath("//h2[@class='a-text-normal']"));
		
		if(result.getText().equals("Password reset required")) {
			System.out.println("Successfully open Password reset required page");
		}else {
			System.out.println("Failed to open Password reset required page");
		}
	}
}
