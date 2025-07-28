package Day4;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_userinput {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username for FB");
		String uName=scan.next();
		
		System.out.println("Enter Password for "+uName+" FB Account");
		String uPass=scan.next();
		
		driver.findElement(By.id("email")).sendKeys(uName);
		driver.findElement(By.id("pass")).sendKeys(uPass);
	}

}
