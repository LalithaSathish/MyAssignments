package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// search for mobiles and click enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// priint all the mobile prices displayed
		List<WebElement> mobileList = driver.findElements(By.className("a-price-whole"));
		System.out.println(mobileList);
		
//		List<String> sample=new ArrayList<>();
//		 sample.add("Lalitha");
//		 sample.add("Sathish");
//		 sample.add("Sathish");
//		 sample.add("Dhiya");
//		 sample.add("Dummy");
//		 sample.add(0, null);
//		 System.out.println(sample);
//		 
//		 sample.remove(0);
//		 
//		 System.out.println(sample);
//		 
//		 sample.remove("Dummy");
//		 
//		 System.out.println(sample);
//		 
//		 sample.clear();
//		 
//		 System.out.println(sample);
		 
		
	}
	
}
