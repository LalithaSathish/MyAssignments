package Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snaldeal_searchproduct {
	public static void main(String[] args) throws AWTException, InterruptedException {
          System.setProperty("webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.snapdeal.com/");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          
          driver.findElement(By.id("inputValEnter")).sendKeys("3 piece kurti set");
          Robot click=new Robot();
          click.keyPress(KeyEvent.VK_ENTER);
          click.keyRelease(KeyEvent.VK_ENTER);
          Thread.sleep(3000);
          System.out.println("3 piece kurti set list:- \n");
         List<WebElement> list=driver.findElements(By.xpath("//p[@class='product-title ']"));
         
         for(WebElement products:list) {
        	 System.out.println(products.getText());
         }
	}
}
