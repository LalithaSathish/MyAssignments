package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ListAjioProducts {
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		//Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//In the search box, type as "bags" and press enter
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//span[text()='gender']//following::label[2]")).click();
		Thread.sleep(3000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//span[text()='category']/following::label[2]")).click();
		Thread.sleep(3000);
		
		//Print the count of the items found.
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='brand']"));
	
		for (WebElement bag : bags) {
			{
				System.out.println(bag.getText());
			}
			
		}
	}

}
