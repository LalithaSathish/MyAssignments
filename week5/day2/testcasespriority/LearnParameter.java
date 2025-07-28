package week5.day2.testcasespriority;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class LearnParameter {
  @Test
  public void parameter() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("CompanyName");
	    driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("FirstName");
	    driver.findElement(By.xpath("//span[text()='Last name']/following::input")).sendKeys("LastName");
	    driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input")).sendKeys("FirstNameLocal");
	    driver.findElement(By.name("departmentName")).sendKeys("DepartmentName");
	    driver.findElement(By.name("description")).sendKeys("Description for the description");
	    driver.findElement(By.name("primaryEmail")).sendKeys("primaryEmail@CompanyName.com");
	    Select sel=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
	    sel.selectByVisibleText("New York");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	    driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Fill the Important Note Field with Any text.");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
  }


}
