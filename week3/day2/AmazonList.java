package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		Thread.sleep(3000);

		List<WebElement> allMobilePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		//		for (int i = 0; i < allMobilePrice.size(); i++) {
		//			System.out.println(allMobilePrice.get(i).getText());
		//		}

		//		for (WebElement webElement : allMobilePrice) {
		//			String price=webElement.getText();
		//			System.out.println(price);
		//			
		//		}
		List<Integer> list=new ArrayList();

		for (WebElement webElement : allMobilePrice) {
			String price=webElement.getText();
			String ReplaceAll=price.replaceAll(",","");
			int allPrice=Integer.parseInt(ReplaceAll);	
			list.add(allPrice);
		}
		System.out.println(list);
		
		Set<Integer> unique=new HashSet<>(list);
		
		System.out.println(unique);
		
		driver.close();
	}

}
