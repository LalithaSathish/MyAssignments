package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class snapdeal_mobilecover {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mobile=driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		Actions act=new Actions(driver);
		act.moveToElement(mobile).perform();
		
		driver.findElement(By.xpath("//span[text()='Printed Back Covers']")).click();
		WebElement result = driver.findElement(By.xpath("//h1[@class='category-name']"));
		if(result.getText().equals("Printed Back Covers")) {
			System.out.println("Successfully opened Printed Back Covers");
		}
	}

}
