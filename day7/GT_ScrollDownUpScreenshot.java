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

public class GT_ScrollDownUpScreenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(2000);
		WebElement scrolldown=driver.findElement(By.xpath("//h2[contains(text(),'Framework Test Papers')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrolldown);
		
		driver.findElement(By.xpath("(//div[@class='card']//div//h2)[2]")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sd=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sd, new File("D:\\Greens Technologies\\Outputs\\GT_JobOpening.png"));
		
		File f=new File("D:\\Greens Technologies\\Outputs");
		String[] list=f.list();
		
		for (String string : list) {
			if (string.toLowerCase().equals("gt_jobopening.png")) {
				System.out.println("Successfully scrolled down and taken screenshot");
			}
		}
		
		WebElement scrollup=driver.findElement(By.xpath("//div[@class='upcoming-batch-section']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		
		File su=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(su, new File("D:\\Greens Technologies\\Outputs\\GT_OnlineClassroom.png"));
		
		String[] list1=f.list();
		
		for (String string1 : list1) {
			if (string1.toLowerCase().equals("gt_onlineclassroom.png")) {
				System.out.println("Scrolled up sucessfully and taken screenshot");
			}
		}
	}

}
