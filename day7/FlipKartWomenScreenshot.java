package day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartWomenScreenshot {
	public static void main(String[] args) throws IOException {
		
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         
         WebElement mousehover = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));
         Actions act=new Actions(driver);
         act.moveToElement(mousehover).perform();
         
         TakesScreenshot ts=(TakesScreenshot)driver;
         File fashion=ts.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(fashion, new File("D:\\Greens Technologies\\Outputs\\Fashion_FlipKart.png"));
         
         File f=new File("D:\\Greens Technologies\\Outputs");
         String[] list=f.list();
         for (String string : list) {
			if (string.equals("Fashion_FlipKart.png")) {
				System.out.println("Screenshot taken");
			}
		}
	}

}
