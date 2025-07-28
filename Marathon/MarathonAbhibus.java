package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarathonAbhibus {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		System.out.println("Name of the first resulting bus: "+ driver.findElement(By.xpath("//h5[@class='title']")).getText());
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();	
		System.out.println("The first resulting bus seat count: "+driver.findElement(By.xpath("//div[@class='text-grey']/small")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn bus-info-btn filled primary sm inactive button']")).click();	
		driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();	
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		System.out.println("Selected Seat: "+driver.findElement(By.xpath("//span[@class='text-primary']")).getText());
		System.out.println("Total Fare: "+driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText());
		System.out.println("Title of the page: "+driver.getTitle());	
		driver.close();
	
	}

}
