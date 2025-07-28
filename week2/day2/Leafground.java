package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following::span")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Dashboard"))
		{
			System.out.println("Passed --> Webpage Title: "+title);
		}
		driver.navigate().back();

		boolean result=driver.findElement(By.xpath("(//h5[text()='Click and Confirm title.']/following::button)[2]")).isEnabled();
		if(result==false)
		{
			System.out.println("Passed --> Webpage Confirm if the button is disabled is Disabled ");
		}

		System.out.println("Title of the submit button: "+driver.findElement(By.xpath("//span[text()='Submit']/preceding::h5[1]")).getLocation());
		String colour=driver.findElement(By.xpath("//h5[text()='Find the Save button color']//following::button")).getCssValue("color");
		System.out.println("Background colour of Save button color button: "+colour);
		
		System.out.println("Size fo the Button: "+driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following::button")).getSize());
		driver.close();
	}

}
