package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumLogin {
	public static void main(String[] args) {
		
		/*EdgeDriver driver2=new EdgeDriver();
		driver2.get("https://www.youtube.com/");
		System.out.println(driver2.getTitle());
		driver2.close();*/
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		driver.close();
		
		
 		
		} 
	}


