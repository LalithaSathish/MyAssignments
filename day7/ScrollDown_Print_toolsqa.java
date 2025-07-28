package day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Print_toolsqa {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scrolldown = driver.findElement(By.xpath("//div[text()='Send us a message:']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		List<WebElement> titles = driver.findElements(By.xpath("//div[@class='links-heading text-uppercase text-white']"));
		
		for (WebElement webElement : titles) {
			if(webElement.getText().toLowerCase().equals("popular tutorials")) {
				System.out.println("Title is: "+webElement.getText());
				System.out.println("Sucessfully scrolled down");
				break;
			}
		}
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("D:\\Greens Technologies\\Outputs\\Scrolldown_toolsqa.png"));
		
		File f=new File("D:\\Greens Technologies\\Outputs");
		
		String[] list = f.list();

		for (String string : list) {
			if (string.toLowerCase().equals("scrolldown_toolsqa.png")) {
				System.out.println("Screensshot Successfully taken");
				}
		} 
		//driver.close();
	}

}
