package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown4 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select sel=new Select(month);
		List<WebElement> allSelectedOptions = sel.getOptions();
		
		System.out.println("Date of Birth, month available in the Calender ");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		
	}

}
