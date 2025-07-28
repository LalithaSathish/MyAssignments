package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;

	public static void LaunchBrowser(String browser) {
		switch(browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;


		case "firefox":
			driver=new FirefoxDriver();
			break;

		case "edge":	
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Browser not support");

		}

	}

	public static void LaunchUrl(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void Username(String username) {
		driver.findElement(By.id("email")).sendKeys(username);
	}

	public static void Password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	public static void LoginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();;

	}

	public static boolean IsErrorIn() {
		
		WebElement error=driver.findElement(By.xpath("//div[@class='_9ay7']"));
		
		System.out.println(error.getText());
		
		if(error.getText().contains("entered is incorrect"))
		{
			return true;
		}else {
			return false;
		}

	}
	
}
