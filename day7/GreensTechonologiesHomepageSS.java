package day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechonologiesHomepageSS {

	public static void main(String[] args) throws IOException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs,new File("D:\\Greens Technologies\\Outputs\\day7screenshotattempt3.png"));

		File f=new File("D:\\Greens Technologies\\Outputs");
		String[] list = f.list();

		for (String string : list) {
			if(string.equals("day7screenshotattempt3.png")) {
				System.out.println(string+" ScreenShot taken");
				break;
			}
		}
		driver.close();
	}

}
