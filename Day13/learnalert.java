package Day13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnalert {

	public static void main(String[] args) throws InterruptedException {
		//set property
		System.setProperty("Webdriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");
		//launch url
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//Simple Alert
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Alert alrt=driver.switchTo().alert();
		System.out.println("Simple alert Message:- "+alrt.getText());
		alrt.accept();
		System.out.println("Simple alert Result:- "+driver.findElement(By.xpath("//span[@id='simple_result']")).getText());
		
		//Confirm Dialog
		driver.findElement(By.xpath(("(//span[@class='ui-button-text ui-c'])[2]"))).click();
		Alert alrt1=driver.switchTo().alert();
		System.out.println("Confirm Dialog Alert Message:- "+alrt1.getText());
		alrt1.dismiss();
		System.out.println("Confirm Dialog alert Result:- "+driver.findElement(By.xpath("//span[@id='result']")).getText());
		
		//Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath(("(//span[@class='ui-button-text ui-c'])[3]"))).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
//		//Sweet Modal Dialog
//		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		//Alert (Prompt Dialog)
		driver.findElement(By.xpath(("(//span[@class='ui-button-text ui-c'])[6]"))).click();
		Alert alrt2=driver.switchTo().alert();
		System.out.println("Alert (Prompt Dialog) Alert Message:- "+alrt2.getText());
		alrt2.sendKeys("LalithaS");
		alrt2.accept();
		System.out.println("Alert (Prompt Dialog) alert Result:- "+driver.findElement(By.xpath("//span[@id='confirm_result']")).getText());
		
		//Sweet Alert (Confirmation)
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[9]")).click();
		
		//Minimize and Maximize
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[3]")).getText());
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
		
	}
	
	

}

