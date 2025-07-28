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

public class ScrollDown_toolsqa {

	public static void main(String[] args) throws IOException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement Latest_Articles=driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", Latest_Articles);

		TakesScreenshot t=(TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshotAs,new File("D:\\Greens Technologies\\Outputs\\ScrollDown_toolsqa.png"));

		File f=new File("D:\\Greens Technologies\\Outputs");
		String[] list = f.list();

		for (String string : list) {
             if(string.equals("ScrollDown_toolsqa.png")) {
            	 System.out.println("ScrollDown and ScreenShot taken");
             }
		}
		driver.close();
	}

}
