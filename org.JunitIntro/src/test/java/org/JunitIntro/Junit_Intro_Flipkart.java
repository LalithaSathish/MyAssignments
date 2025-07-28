package org.JunitIntro;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit_Intro_Flipkart {
	
	static WebDriver driver=new ChromeDriver();
	
    @BeforeClass
	public static void Setup() {
		WebDriverManager.chromedriver().setup();
	}
    @Before
	public void LaunchBrowser() {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
    @Test
	public void Search() {
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone"+Keys.ENTER);
		
	}
	@After
	public void SearchResult() {
		List<WebElement> result=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		System.out.println("Search Results are: ");
		for (WebElement webElement : result) {
			System.out.println(webElement.getText());
		}
	}
    @AfterClass
	public static void CloseBrowser() {
		try {
			driver.close();
		} catch (org.openqa.selenium.WebDriverException e) {
			System.out.println("Browser already closed or not reachable: " + e.getMessage());
		}

	}

}


