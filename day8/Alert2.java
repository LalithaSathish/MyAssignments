package day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel '] ")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        Alert alrt=driver.switchTo().alert();
        System.out.println(alrt.getText());
        alrt.accept();
        
        WebElement result=driver.findElement(By.xpath("//p[@id='demo']"));
        
        if (result.getText().equals("You pressed Ok")) {
			System.out.println("Alert handled successfully");
		}
	}
}
