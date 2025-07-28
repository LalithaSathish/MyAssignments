package Day5;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class homedepotcp {
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
		driver.findElement(By.xpath("(//div[@class='sui-flex-auto sui-my-1 sui-block'])[18]")).click();
		driver.findElement(By.xpath("//span[text()='Interior Paint']")).click();
		driver.findElement(By.xpath("//span[text()='Ceiling Paint']")).click();
		
		WebElement Result=driver.findElement(By.xpath("//h1[text()='CEILING PAINT']"));
		
		if(Result.getText().equals("CEILING PAINT")) {
			System.out.println("Successfully opened 'CEILING PAINT' page");
		}else {
			System.out.println("'CEILING PAINT' failed to open");
		}
	}
}
