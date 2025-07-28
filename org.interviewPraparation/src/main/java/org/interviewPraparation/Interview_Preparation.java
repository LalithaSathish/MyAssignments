package org.interviewPraparation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interview_Preparation {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		
		//Step-1
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		button.sendKeys(Keys.ENTER);
		
		//Step-2
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		//Step-3
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Step-4
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', {'key': 'Enter'}));", button);	
		
	}

}
