package Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class MarathonServiceNow {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		//Launch a web browser.
		driver.get("https://dev200784.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter the username and the password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("k6C8-ajUWqY%");
		driver.findElement(By.id("sysverb_login")).click();
		
		//Click on "All."
		Shadow dom=new Shadow(driver);
		dom.setImplicitWait(30);
		WebElement sample=dom.findElementByXPath("//div[@class='sn-polaris-navigation polaris-header-menu']/div");
		sample.click();
		
		Thread.sleep(7000);
		//Click on "Service Catalog."
		WebElement fil=dom.findElementByXPath("//input[@id='filter']");
		fil.sendKeys("Service Catalog");
		WebElement sel=dom.findElementByXPath("//span[@class='label']/mark");
		sel.click();
	
		//Thread.sleep(3000);
		//Click on "Mobiles."
		WebElement sel1=dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(sel1);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//Click on "Apple MacBook Pro 13."
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		//Choose all mandatory fields
		driver.findElement(By.xpath("//span[@class='input-group-radio']")).click();
		driver.findElement(By.xpath("(//div[@class='col-xs-6  form-field input_controls sc-form-field '])[2]/input[2]")).sendKeys("9876543210");
		Thread.sleep(3000);
		Select sample1=new Select(driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")));
		sample1.selectByIndex(1);
		
		//Click on "Order now"
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		//Print the order message.
		System.out.println("Order Message --> "+driver.findElement(By.xpath("//div[@class='notification notification-success']/span")).getText());
		
		//Print the request number
		System.out.println("Request Number --> "+driver.findElement(By.xpath("//a[@id='requesturl']")).getText());
		
		//Take a snap of the resulting page.
		File screens=driver.getScreenshotAs(OutputType.FILE);
		File store=new File("./snap/image.png");
		FileUtils.copyFile(screens, store);
		
		//Close the browser
		driver.close();
		
	}

}
