package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown6 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scroll=driver.findElement(By.xpath("//div[@class='footer']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select sel_country=new Select(country);
		List<WebElement> options = sel_country.getOptions();
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}

}
