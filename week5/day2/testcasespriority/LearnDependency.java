package week5.day2.testcasespriority;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearnDependency extends PriorityBseClass {

	@Test
	public void TestCreateLead() {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();

	}
	@Test(dependsOnMethods = "week5.day2.testcases.LearnDependency.TestCreateLead")
	public void TestDeleteLead() throws InterruptedException
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}
	@Test(enabled= false)
	public void TestEditLead() throws InterruptedException
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
	}
	@Test(enabled= false)
	public void TestMergeLead() throws InterruptedException
	{	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Merge Leads")).click();
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("gopi");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles.get(0));

	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("babu");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles2.get(0));
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();

	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}

	}

}
