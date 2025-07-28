package day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchSS {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("Type the characters you see in this image and press any key and enter: ");
		Scanner scan=new Scanner(System.in);
		scan.next();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motorolo "+Keys.ENTER);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\Greens Technologies\\Outputs\\Amazonsearch.png"));
		
		File f=new File("D:\\Greens Technologies\\Outputs");
		String[] list=f.list();
		for (String string : list) {
			if (string.equals("Amazonsearch.png")) {
				System.out.println("Screenshot taken");
			}
		}
		
	}

}
