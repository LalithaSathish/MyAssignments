package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		String check1="You pressed OK!";
		boolean result;
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		String check=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(check.equals(check1))
		{
			System.out.println("You pressed Ok!");
		}
		else
		{
			System.out.println("You pressed Cancel!");
		}
		driver.close();
	}
}
