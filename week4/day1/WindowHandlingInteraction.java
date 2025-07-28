package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();

		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr/td[2]/a/img")).click();

		//Get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<>(allWindowHandles);

		driver.switchTo().window(list.get(1));
		driver.findElement(By.linkText("DemoCustomer")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[2]/td/a/img")).click();
		
		//Get handles of the windows
		String mainWindowHandle1 = driver.getWindowHandle();
		Set<String> allWindowHandles1 = driver.getWindowHandles();
		List<String> list1=new ArrayList<>(allWindowHandles1);
		
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.linkText("DemoPrivilegedCust")).click();

		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[4]/td/a")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
