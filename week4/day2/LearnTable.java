package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		Thread.sleep(3000);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//System.out.println(driver.findElements(By.xpath("table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[2]/th")).get		
		
	}

}
