package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelApp_Login {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Usernamexyz");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Usernamexyz");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		System.out.println(driver.getTitle());
		
	}
}
