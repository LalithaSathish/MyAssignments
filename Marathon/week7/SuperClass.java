package Marathon.week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SuperClass {
	
	public static ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeClass
	public void PreCondition(String url,String username, String password) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//1.Launch the browser.
		driver=new ChromeDriver(options);
		//  2.Load the URL: https://login.salesforce.com.
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//   3.Enter the username as gokul.sekar@testleaf.com.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		//   4.Enter the password as Leaf$123.
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		// 5.Click on the Login button.
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(3000);
		
		// 6.Click on the toggle menu button in the left corner.
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//7.Click on "View All"
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		//and select "Sales" from the App Launcher.
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//8.Click on the "Opportunity" tab.
		Thread.sleep(3000);

		WebElement OpportunitiesWE=driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", OpportunitiesWE);

	}
	@AfterClass
	public void PostCondition() {
		driver.close();

	}

}
