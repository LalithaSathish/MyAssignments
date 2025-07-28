package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.greenstechnologys.com");
		Thread.sleep(3000);
		
		WebElement text=driver.findElement(By.xpath("//span[@class='blue_text']"));
		
		System.out.println(text.getText());
		
		List<WebElement> address=driver.findElements(By.xpath("//div[@class='trainer-info']"));
		
		for(WebElement op:address) {
			String ad=op.getText();
            if(ad.contains("Trichy")) {	
			break;
            }
            System.out.println(op.getText());
		}
		
		
	}
}
