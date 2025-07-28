package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		Alert simplealert= driver.switchTo().alert();
		
		System.out.println(simplealert.getText());
		
		simplealert.dismiss();
		
		String text=driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
	
		driver.close();
		
		
	}

}
