package day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GtTopSelenium {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scroll=driver.findElement(By.xpath("//h3[contains(text(),'Blogs')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Screensot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screensot, new File("D:\\Greens Technologies\\Outputs\\gttopselenium.png"));
		
		File f=new File("D:\\Greens Technologies\\Outputs");
		String[] list=f.list();
		for (String string : list) {
			if(string.equals("gttopselenium.png"))
			{
				System.out.println("Successfully scrolldown and take screenshot");
			}
		}
	}

}
