package day9;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDown1_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement scroll=driver.findElement(By.xpath("//label[@class='form-file-label']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='col-md-4 col-sm-12'])[1]")).click();

		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class=' css-11unzgr']/div"));
		
		for (int i = 0; i <= findElements.size()-1; i++) {
               if (i%2==0) {
            	System.out.println("Even options are ");
				System.out.println(findElements.get(i).getText());
			}else {
				System.out.println("odd options are ");
				System.out.println(findElements.get(i).getText());
			}
		}
	}

}
