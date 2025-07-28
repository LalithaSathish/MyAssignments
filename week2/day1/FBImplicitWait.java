package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		//Load url
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		//maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//create Account
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Sample1");
		driver.findElement(By.name("lastname")).sendKeys("Sample2");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("987654321");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Pass123$");
		
		Select sel=new Select(driver.findElement(By.name("birthday_day")));
		sel.selectByIndex(9);
		Select sel1=new Select(driver.findElement(By.name("birthday_month")));
		sel1.selectByIndex(11);
		Select sel2=new Select(driver.findElement(By.name("birthday_year")));
		sel2.selectByValue("1998");
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	}

}
