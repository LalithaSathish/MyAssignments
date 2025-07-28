package week2.day2;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		String result=driver.findElement(By.className("ui-growl-title")).getText();
		if(result.equals("Checked"))
		{
			System.out.println("Passed:- Notification Checkbox Result: "+result);
		}
		else
		{
			System.out.println("Failed:- Notification Checkbox Result: "+result);
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		for (int i = 0; i < 3; i++) {
			Thread.sleep(7000);	
			driver.findElement(By.xpath("//div[@class='grid formgrid']")).click();
			driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]")).click();
			System.out.println(driver.findElement(By.className("ui-growl-message")).getText());
		}
		Thread.sleep(10000);
		driver.findElement(By.className("ui-toggleswitch-slider")).click();	
		String result1=driver.findElement(By.className("ui-growl-title")).getText();
		if(result1.equals("Checked"))
		{
			System.out.println("Passed:- Toggle Switch Result: "+result);
		}
		else
		{
			System.out.println("Failed:- Toggle Switch Result: "+result);
		}
		
		Thread.sleep(5000);
		boolean bool=driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).isEnabled();
		
		if(bool==false)
		{
			System.out.println("Checkbox is disabled");
		}
		else
		{
			System.out.println("Checkbox is enabled");
		}

		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
		
		System.out.println(driver.findElement(By.id("j_idt87:multiple")).getText());
		driver.close();
	}


}
