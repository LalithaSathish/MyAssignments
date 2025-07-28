package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class LearnAction {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement wb=driver.findElement(By.linkText("Conditions of Use & Sale"));
		Actions builder=new Actions(driver);
		builder.scrollToElement(wb).perform();
		System.out.println(wb.getText());
	}

}
