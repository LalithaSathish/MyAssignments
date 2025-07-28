package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenstechSeleniumCourse {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://greenstechnologys.com/index.html");
		Thread.sleep(3000);
		
		List<WebElement> wb=driver.findElements(By.xpath("//div[@class='trainer-info']"));
		
		for(WebElement ot:wb) {
			String str=ot.getText();
			if (str.contains("Velachery")) {
				System.out.println(ot.getText());
			}
		}
	}
}
