package day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert7 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("UserName");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("12345678");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		
		Alert alrt=driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
	}

}
