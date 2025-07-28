package Marathon.week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateSaleforce extends SuperClass{
	
	@Test
	public void runCreateSaleforce() throws InterruptedException {
		
		//9.Click on the "New" button.
		WebElement NewWE=driver.findElement(By.xpath("//a[@Title='New']"));	
		driver.executeScript("arguments[0].click();", NewWE);

		//10.Enter the Opportunity name as 'Salesforce Automation by Your Name', get the text, and store it.
		String OpportunityName="Salesforce Automation by Lalitha";
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OpportunityName);
		//11. Enter Amount as 75,000
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75,000");
		//  12.Choose the close date as Today.
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[@name='today']")).click();
		//13.Select 'Stage' as 'Need Analysis'.
		WebElement StageWE=driver.findElement(By.xpath("//button[@aria-label='Stage - Current Selection: --None--']"));
		driver.executeScript("arguments[0].click();", StageWE);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		//  14.Click on the 'Save' button and verify the Opportunity Name.
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		String resultTitle=driver.findElement(By.xpath("//slot[@name='primaryField']")).getText();

		if(OpportunityName.contains(resultTitle))
		{
			System.out.println("Verified the Opportunity Name: Text matched");
		}
		else
		{
			System.out.println("Verification failed for the Opportunity Name: Text not matched");
		}

	}

}
