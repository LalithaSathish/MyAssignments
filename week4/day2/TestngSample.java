package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngSample {
	public  ChromeDriver	driver;
	@Test
	 public void loginPage() {
		 
		 	 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 
			 
		  
	       }  
}

