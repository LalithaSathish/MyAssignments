package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//LoginPage- Attribute Based Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//WelcomePage-Partial text Based Xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//HomePage - text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//CreateLead - Partial Attribute Based X path
		driver.findElement(By.xpath("//input[contains(@id,'createLead')]")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lalitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathishkumar");
		Select sel=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		sel.selectByIndex(4);
		Select sel2=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		sel2.selectByIndex(4);
		Select sel3=new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
	    sel3.selectByIndex(4);
	    
	    //driver.close();
		
	}

}
