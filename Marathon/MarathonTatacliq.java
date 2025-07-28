package Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MarathonTatacliq {
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);

		//Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//MouseHover on 'Brands'
		WebElement brand=driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();

		//MouseHover on 'Watches & Accessories'
		WebElement brandname=driver.findElement(By.xpath("//div[contains(text(),'Watches & Accessories')]"));
		Actions builder1=new Actions(driver);
		builder1.moveToElement(brandname).perform();

		//Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[contains(text(),'Featured brands')]/following::div")).click();

		Thread.sleep(15000);

		//Select sortby: New Arrivals
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']")));
		sel.selectByVisibleText("New Arrivals");

		//choose men from catagories filter.
		driver.findElement(By.xpath("//div[@class='CheckBox__base']")).click();

		Thread.sleep(7000);
		//print all price of watches
		List<WebElement> watchprices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		for (int i = 0; i < watchprices.size(); i++) {
			System.out.println(watchprices.get(i).getText());
		}

		Thread.sleep(7000);
		String FirstWatchPrice= driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")).getText();
		
		//click on the first resulting watch.
		driver.findElement(By.xpath("//div[@class='Grid__element'][1]")).click();

		//Get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> windows=new ArrayList<>(allWindowHandles);

		driver.switchTo().window(windows.get(1));
		Thread.sleep(15000);
		String childwatchprice=driver.findElement(By.xpath("//div[text()='Inclusive of all taxes']/preceding::h3")).getText();

		//compare two price are similar
		String sub=childwatchprice.substring(5,10);
		if(FirstWatchPrice.equals(sub)) {
			System.out.println("Price are Similar ");
		}
		//click Add to cart and get count from the cart icon.
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		System.out.println("Add to bag count: "+driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText());
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(7000);
		//Take a snap of the resulting page.
		File ss=driver.getScreenshotAs(OutputType.FILE);
		File dec=new File("./snap/image.png");
		FileUtils.copyFile(ss, dec);
		
		driver.close();
		driver.switchTo().window(windows.get(0));
		//click Add to cart and get count from the cart icon.
		driver.close();
	}

}
