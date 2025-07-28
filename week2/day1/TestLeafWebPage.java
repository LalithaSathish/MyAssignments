package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafWebPage {
	public static void main(String[] args) {
		//Open TestLeaf Webpage and maximize window
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//LoginPage
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Test Automation Webpage
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestLeaf9");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Select sel= new Select(driver.findElement(By.name("industryEnumId")));
		sel.selectByIndex(3);
		
		Select sel1=new Select(driver.findElement(By.name("ownershipEnumId")));
		sel1.selectByVisibleText("S-Corporation");
		
		Select sel2=new Select(driver.findElement(By.id("dataSourceId")));
		sel2.selectByValue("LEAD_EMPLOYEE");
		
		Select sel3=new Select(driver.findElement(By.id("marketingCampaignId")));
		sel3.selectByIndex(6);
		
		Select sel4=new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		sel4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		boolean eleSelected= driver.findElement(By.xpath("//span[contains(text(),'TestLeaf9')]")).isDisplayed();
		
		if(eleSelected=true)
		{
			driver.close();
		}
		}
				
		
	}


