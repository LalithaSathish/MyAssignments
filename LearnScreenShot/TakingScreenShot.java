package LearnScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		
		File f=new File("\"D:\\Greens Technologies\\Outputs");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("WritingUsername12345");
		driver.findElement(By.id("pass")).sendKeys("WritingPassword12345");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(s, new File("D:\\Greens Technologies\\Outputs\\FaceBookLoginScreenshot2.png"));
		
		Date date=new Date();
		System.out.println(date);
		
//		String[] list = f.list();
//		
//		for (String string : list) {
//			System.out.println(string);
//		}
//		
//		for (String string : list) {
//			if(string.equals("FaceBookLoginScreenshot.png")) {
//				System.out.println("Screenshot Successfully taken");
//			}else {
//				System.out.println("Failed to take ScreenShot");
//			}
//		}
		
		
	}
}

