package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinhotelapp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement Uname=driver.findElement(By.id("username"));
		WebElement Password=driver.findElement(By.id("password"));
		
		Uname.sendKeys("xyz1UserName");
		Password.sendKeys("xyz_passwrod");
		
		Thread.sleep(2000);
		
		System.out.println("Entered UserName:- "+Uname.getDomProperty("value"));
		System.out.println("Entered Password:- "+"xyz_passwrod");
		
	}
}
