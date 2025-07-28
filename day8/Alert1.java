package day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alrt=driver.switchTo().alert();
		System.out.println("Alert Message is:- "+alrt.getText());
		alrt.accept();
		
	}

}
