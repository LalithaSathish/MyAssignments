package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks { 
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		WebElement wb=links.get(3);
		
		System.out.println(wb.getText());
		
		List<String> all=new ArrayList<String>();
		
		for (int i = 0; i < links.size(); i++) {
			
			String web=links.get(i).getText();
			all.add(web);
		}
		System.out.println(all);
		
		Collections.sort(all);
		
		
	}

}
