package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateGoogleAccount_REGISTERfORM {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSi\r\n"
				+ "gnIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select sel=new Select(month);
		sel.selectByValue("8");
		
		driver.findElement(By.xpath("//input[@id='day']")).sendKeys("18");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("1995");
		
		WebElement gender=driver.findElement(By.xpath("//select[@id='gender']"));
		Select sel1=new Select(gender);
		sel1.selectByValue("1");
		
		driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']/button")).click();
		
	}
}
