package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown5 {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(date);
		List<WebElement> allSelectedOptions = sel.getOptions();
		
		System.out.println("Date of Birth, Even dates in the Calender: ");
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			if (!(i%2==0)) {
				System.out.println(allSelectedOptions.get(i).getText());
			}
		}
		
	}
}
