package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class snadeal_footwear {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mobile=driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(mobile).perform();
		
		driver.findElement(By.xpath("(//span[text()='Footwear'])[2]")).click();
		
		WebElement foot=driver.findElement(By.xpath("//h1[@class='category-name']"));
		
		if(foot.getText().equals("Women's Footwear")) {
			System.out.println("Successfully opened Women's Footwear page ");
		}else {
			System.out.println("Failed to open Women's Footwear");
		}
	}
}
