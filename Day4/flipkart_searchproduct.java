package Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_searchproduct {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='_2SmNnR']/input")).sendKeys("Kids Study toys");
		
		Thread.sleep(2000);
		Robot click=new Robot();
		click.keyPress(KeyEvent.VK_ENTER);
		click.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		List<WebElement> toys=driver.findElements(By.xpath("//a[@class='wjcEIp']"));
		
		System.out.println("Study toy list are below:- \n");
		for(WebElement result:toys) {
			System.out.println(result.getText());
		}
	}
}
