package Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopclues_search {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Nude Shade Lipsticks");
		
		Robot click=new Robot();
		click.keyPress(KeyEvent.VK_ENTER);
		click.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> list= driver.findElements(By.xpath("//h2[@class='']"));
		
		System.out.println("Nude Shade lipsticks are:- \n");
		for(WebElement lipstick: list) {
			System.out.println(lipstick.getText());
		}
	}
}
