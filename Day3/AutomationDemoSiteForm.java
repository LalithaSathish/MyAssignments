package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSiteForm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "D:\\Greens Technologies\\Selenium_Workspace\\Selenium_DailyTask\\Learn_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sathish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea")).sendKeys("Medavakkam");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

		driver.findElement(By.xpath("//div[@id='msdd']")).click();	
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ng-scope']"));

		for (WebElement option : options) {
			if (option.getText().equals("English")) {
				option.click();
				break;
			}
		}

		WebElement SelSkills=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select selskill=new Select(SelSkills);
		selskill.selectByValue("Java");

		driver.findElement(By.xpath("//span[@class='selection']/span")).click();
		
		List<WebElement> countryoptions=driver.findElements(By.xpath("//select[@id='country']"));

		for (WebElement countryoption : countryoptions) {
			if (countryoption.getText().equals("India")) {
				countryoption.click();
				break;
			}
		}

		WebElement SelYear=driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select Selyear=new Select(SelYear);
		Selyear.selectByValue("1994");

		WebElement SelMonth=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select Selmon=new Select(SelMonth);
		Selmon.selectByValue("March");

		WebElement SelDay=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select Selday=new Select(SelDay);
		Selday.selectByValue("16");

		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("LaliDhiya");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("LaliDhiya");
		
		System.out.println(driver.getTitle());
		driver.close();

	}
}
