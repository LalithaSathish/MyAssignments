package org.testngIntro;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_search {
	public WebDriver driver;
	@Test(priority=1,alwaysRun=true,groups={"FirstSearch","SecondSearch"})
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();		
	}
	@Test(priority=2,dependsOnMethods="setUp",groups={"FirstSearch","SecondSearch"})
	public void launchUrl() {	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Scanner scan=new Scanner(System.in);
		scan.next();
	}
	@Test(priority=3,groups={"FirstSearch","SecondSearch"})
	public void searchProduct() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bedsheets+pillows"+Keys.ENTER);
	}
	@Test(priority=4,groups="FirstSearch")
	public void selectProduct() {
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal']")).click();
	}
	@Test(priority=5,groups="FirstSearch")
	public void addcart() {
		String parentWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for (String string : windows) {
			if(!(string==parentWindow)) {
				driver.switchTo().window(string);
			}
		}
		WebElement scroll=driver.findElement(By.xpath("//span[text()='Brand']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.switchTo().window(parentWindow);

	}
	@Test(priority=6,groups="SecondSearch")
	public void selectsecondProd() {
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal'])[2]")).click();
	}
	@Test(priority=7,groups="SecondSearch")
	public void switchWindow2() {
		String parentWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for (String string : windows) {
			if(!(string==parentWindow)) {
				driver.switchTo().window(string);
			}
		}
	}
	@Test(priority=8,groups="SecondSearch")
	public void addtoCart2() {
		WebElement scroll=driver.findElement(By.xpath("//span[text()='Brand']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}
	
	@Test(priority=9,groups={"FirstSearch","SecondSearch"})
	public void back2home() {
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
