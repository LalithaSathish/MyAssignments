package Marathon.week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DeleteSaleforce extends SuperClass{
	
	//public static ChromeDriver driver;
	@Test(dependsOnMethods="Marathon.week7.EditSaleforce.runEditSaleforce")
	public void runDeleteSaleforce() throws InterruptedException {
	
		// 9.Search for the Opportunity 'Salesforce Automation by Your Name'.
		String OpportunityName="Salesforce Automation by Lalitha";
		WebElement Search=driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		Search.sendKeys(OpportunityName);
		Search.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		//10.Click on the Dropdown icon and select 'Edit'.
		WebElement EditWE=driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']"));
		EditWE.click();
		driver.findElement(By.xpath("(//li[@class='uiMenuItem']/a)[2]")).click();

		driver.findElement(By.xpath("(//span[@class=' label bBody'])[4]")).click();

		String result=driver.findElement(By.xpath("//span[text()='Perception Analysis']")).getText();

		if(result.contains("Perception Analysis"))
		{
			System.out.println("Perception Analysis Deleted successfully");
		}
		else
		{
			System.out.println("Perception Analysis verification failed");
		}
	}

}
