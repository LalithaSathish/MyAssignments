package Day5;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class amazonsdcash {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Finish typing characters and press anykey and enter: ");
		new Scanner(System.in).next();
		
		WebElement mobile=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions act=new Actions(driver);
		act.moveToElement(mobile).perform();
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		
		WebElement result=driver.findElement(By.xpath("//h1[contains(text(),'Your Account')]"));
		
		if(result.getText().contains("Your Account")){
			System.out.println("Successfully opened Your Account page ");
		}else {
			System.out.println("Failed to open Your Account");
		}
	}
}
