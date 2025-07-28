package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologiesIndex {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://greenstechnologys.com/index.html");
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='article-wrapper']/p")).getText());
	}
}
