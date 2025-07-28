package Day3;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toolsqaForm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://toolsqa.com/");
		Thread.sleep(3000);

		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement enroll=driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
		Thread.sleep(3000);	
		js.executeScript("arguments[0].scrollIntoView(true)",enroll);
		driver.findElement(By.xpath("//div[@class='col col-sm-6 col-md-7']/a")).click();

		WebElement code=driver.findElement(By.xpath("//input[@id='code']"));
		Thread.sleep(3000);	
		js.executeScript("arguments[0].scrollIntoView(false)",code);

		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543210");
		
		WebElement eb=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(eb);
		sel.selectByValue("4");

		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("//textarea[@class='upcoming__registration--input']")).sendKeys("@@@###***Hello World***###@@@");

		
		// Pause and allow user to solve CAPTCHA manually
		System.out.println("Please solve the CAPTCHA manually and press Enter...");
		new Scanner(System.in).nextLine(); // Wait until user hits Enter
		
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']")).click();
		
		
		System.out.println(driver.getTitle());

	}

}
