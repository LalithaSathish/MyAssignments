package Day5;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class shopclues_search {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement mouseover_mobiles=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseover_mobiles).perform();
		
		driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']")).click();
		
        String parentWindowID=driver.getWindowHandle();
        
        Set<String> Windows=driver.getWindowHandles();
        
        for (String string : Windows) {
			if (!string.equals(parentWindowID)) {
				driver.switchTo().window(string);
			}
		}
		
        System.out.println("Search Result from child window is : "+ driver.findElement(By.xpath("//span[@class='prod_name ']")).getText());
        driver.close();
        driver.switchTo().window(parentWindowID);
        System.out.println("Title from parent window: "+driver.getTitle());
        driver.close();
	}
}
