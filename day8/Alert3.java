package day8;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert alrt=driver.switchTo().alert();
		System.out.println(alrt.getText()+":- ");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		alrt.sendKeys(input);
		alrt.accept();
		
		String output=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		if(output.contains(input)) {
			System.out.println("Input Entered successfully");
			System.out.println(output);
		}
		
	}

}
