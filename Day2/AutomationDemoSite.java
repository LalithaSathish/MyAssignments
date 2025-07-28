package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sathish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea")).sendKeys("Medavakkam");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("LaliDhiya");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("LaliDhiya");
	
	}

}
