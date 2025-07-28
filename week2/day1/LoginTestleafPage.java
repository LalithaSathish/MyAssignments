package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTestleafPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//LoginPage
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//WelcomePage
		driver.findElement(By.linkText("CRM/SFA")).click();
		//HomePage
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//CreateLead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
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
