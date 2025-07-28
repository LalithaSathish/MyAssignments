package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("//div[@class='grid formgrid']//div[2]")).click();

		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’
		WebElement Radiobutton=driver.findElement(By.xpath("//h5[text()='UnSelectable']//following::span"));
		for (int i = 1; i <= 2; i++) {
			Radiobutton.click();
			Thread.sleep(3000);
			System.out.println("UnSelectable ratio button isSelected: "+driver.findElement(By.xpath("//input[@value='Chennai']")).isSelected());
		}
		//Identify the radio button that is initially selected by default.
		System.out.println("Find the default of radio button isSelected: "+driver.findElement(By.xpath("//input[@value='Option3']")).isSelected());	
		
		//Check and select the age group (21-40 Years) if not already selected.
		boolean check=driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected();
		if(check==false)
		{
			System.out.println("Age group (21-40 Years) is not Selected");
			driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']//following::span[2]")).click();
		}
		else
		{
			System.out.println("Age group (21-40 Years) is already Selected");
		}
		driver.close();

	}

}
