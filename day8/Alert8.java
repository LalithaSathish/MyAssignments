package day8;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert8 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("UserName");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']")).sendKeys("PassWord");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']")).click();
		
		String result=driver.findElement(By.xpath("//div[@class='redbg']")).getText();
		System.out.println(result);
		if (result.contains("Your user ID has been disabled")) {
			System.out.println("Error Message displayed");
		}	
	}
	
}
