package E2EMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIndividuals {
/*
 * "Test Steps:
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Individuals from App Launcher
4. Click on the Dropdown icon in the Individuals tab
5. Click on New Individual
6. Enter the Last Name as 'Kumar'
7.Click save and verify Individuals Name"

 */
	public static void main(String[] args) throws InterruptedException {
		
	
	//WebDriverManager.chromedriver().setup();

	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");

	ChromeDriver driver = new ChromeDriver(option);

	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("Leaf$123");
	driver.findElement(By.id("Login")).click();
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();

	WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
	driver.executeScript("arguments[0].scrollIntoView();", scroll);
	WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
	driver.executeScript("arguments[0].click();", individual);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
	//WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
	driver.findElement(By.xpath("//div[text()='New']")).click();
	//driver.executeScript("arguments[0].click();", clk);
	
	driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys("Lalitha");
	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	//verify Individuals Name
	if (message.contains("Lalitha")) {
		System.out.println("CreateSaleforce successfully completed");
		driver.close();
	}else {
		System.out.println("Individuals Name not verified");
	}
	
	
	}
}
