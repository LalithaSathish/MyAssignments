package Day4;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologies_Paragraph {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		
		List<WebElement> text=driver.findElements(By.xpath("//div[@id='content-wrapper']/div/p"));
		
		for(WebElement wb:text) {
			String str=wb.getText();
			if (str.startsWith("Greens Technology")) {
				System.out.println(str);
			}

			}
		}
		
	}

