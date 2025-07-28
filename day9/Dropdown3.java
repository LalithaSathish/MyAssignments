package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 { 
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select sel=new Select(year);
		List<WebElement> allSelectedOptions = sel.getOptions();
		
		System.out.println("Date of Birth, years available in the Calender ");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
			
	}
}
