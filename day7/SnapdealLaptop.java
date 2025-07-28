package day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealLaptop {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("HP Laptop"+Keys.ENTER);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\Greens Technologies\\Outputs\\snapdeallaptop.png"));
		
		File f=new File("D:\\Greens Technologies\\Outputs");
		String[] list=f.list();
		for (String string : list) {
			if (string.equals("snapdeallaptop.png")) {
				System.out.println("Screenshot taken");
			}
		}
	}

}
