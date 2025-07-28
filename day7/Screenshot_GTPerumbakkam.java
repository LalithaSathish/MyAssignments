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

public class Screenshot_GTPerumbakkam {

	private static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scrolldown=driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		List<WebElement> titles = driver.findElements(By.xpath("//span[@class='red_text']"));
		
		for (WebElement webElement : titles) {
			if (webElement.getText().contains("Greens technology Perumbakkam")) {
				System.out.println("Greens Technologies Perumbakkam Address is: "+webElement.getText());
				System.out.println("Successfully scrolled down");
			}
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("D:\\Greens Technologies\\Outputs\\GT_perumbakkam.png"));
		
		File f=new File("D:\\Greens Technologies\\Outputs");
		String[] list=f.list();
		
		for (String string : list) {
			if (string.toLowerCase().equals("gt_perumbakkam.png")) {
				System.out.println("Screenshot taken successfully");
			}
		}
	}
}
