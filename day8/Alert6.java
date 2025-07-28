package day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert6 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]")).click();
		
		Alert alrt=driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		
		
	}

}
