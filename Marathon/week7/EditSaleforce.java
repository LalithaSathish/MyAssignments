package Marathon.week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class EditSaleforce extends SuperClass{
	
	//public static ChromeDriver driver;
	
	@Test(dependsOnMethods="Marathon.week7.CreateSaleforce.runCreateSaleforce")
	public void runEditSaleforce() throws InterruptedException {
		
		// 9.Search for the Opportunity 'Salesforce Automation by Your Name'.
		String OpportunityName="Salesforce Automation by Lalitha";
		WebElement Search=driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		Search.sendKeys(OpportunityName);
		Search.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		//10.Click on the Dropdown icon and select 'Edit'.
		WebElement EditWE=driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']"));
		EditWE.click();
		driver.findElement(By.xpath("//li[@class='uiMenuItem']/a")).click();
		//11.Choose the close date as Tomorrow's date.
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		
		Thread.sleep(3000);
		//12.Select 'Stage' as 'Perception Analysis'.
		WebElement StageWE=driver.findElement(By.xpath("//button[@aria-label='Stage - Current Selection: Needs Analysis']"));
		driver.executeScript("arguments[0].click();", StageWE);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();

		// 13.Select 'Delivery/Installation Status' as 'In Progress'.
		WebElement DeliveryWE=driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status - Current Selection: --None--']"));
		driver.executeScript("arguments[0].click();", DeliveryWE);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='In progress']")).click();

		//14.Enter Description as 'SalesForce'.SalesForce
		driver.findElement(By.xpath("//Textarea[@class='slds-textarea']")).sendKeys("SalesForce");
		//15.Click on 'Save' and verify the Stage as 'Perception Analysis'.
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		String result=driver.findElement(By.xpath("//span[text()='Perception Analysis']")).getText();
		
		if(result.contains("Perception Analysis"))
		{
			System.out.println("Perception Analysis verified successfully");
		}
		else
		{
			System.out.println("Perception Analysis verification failed");
		}

	}

}
