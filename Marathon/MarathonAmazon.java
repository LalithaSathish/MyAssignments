package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MarathonAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome 
		ChromeDriver driver=new ChromeDriver();
		//Load utr
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//implicitlyWait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type "Bags for b" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		Thread.sleep(3000);
		//Choose the 	 item in the result (bags for boys)
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
	    //Print the total number of results (like 50000)
		System.out.println("The total number of results: "+driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small a-spacing-top-small')]")).getText());
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative']")));
		sel.selectByIndex(4);
		//Print the first resulting bag info (name, discounted price)
		System.out.println("The first resulting bag info: "+driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).getText());
		System.out.println("Discounted price : "+driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
		System.out.println("Title of the page: "+driver.getTitle());
		driver.close();
	}

}
