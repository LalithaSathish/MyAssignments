package org.adactinhotel;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RoomBooking {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");	
		driver.manage().window().maximize();
		
		String Uname="xyz1UserName";
		String pass="xyz_passwrod";
		
//		//Click for register
//		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
//		//Username	
//		driver.findElement(By.id("username")).sendKeys(Uname);
//		//Password
//		driver.findElement(By.id("password")).sendKeys(pass);
//		//Confirm Password
//		driver.findElement(By.id("re_password")).sendKeys(pass);
//		//FullName
//		driver.findElement(By.id("full_name")).sendKeys("xyz_name");
//		//Email_Address
//		driver.findElement(By.id("email_add")).sendKeys("tvlallu1994@gmail.com");
//		//Manual Captcha entering
//		System.out.println("Enter the captcha then press yes...");
//		Scanner scan1=new Scanner(System.in);
//		scan1.next();
//		//Condition check
//		driver.findElement(By.id("tnc_box")).click();
//		//Click register
//		driver.findElement(By.id("Submit")).click();
//		//Wait for the page to load
//		System.out.println("Do Email Verification...");
//		Scanner scan2=new Scanner(System.in);
//		scan2.next();
//		//Click here to login
//		driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
//		//Wait for the page to load
//		Thread.sleep(3000);
		//Enter UserName
		driver.findElement(By.id("username")).sendKeys(Uname);
		//Enter Password
		driver.findElement(By.id("password")).sendKeys(pass);
		//Login
		driver.findElement(By.id("login")).click();
		
		WebElement loc=driver.findElement(By.id("location"));
		Select location=new Select(loc);
		location.selectByValue("Los Angeles");
		
		WebElement hot=driver.findElement(By.id("hotels"));
		Select hotels=new Select(hot);
		hotels.selectByIndex(2);
		
		WebElement room=driver.findElement(By.id("room_type"));
		Select roomtype=new Select(room);
		roomtype.selectByVisibleText("Super Deluxe");
		
		WebElement NoRoom=driver.findElement(By.id("room_nos"));
		Select NoofRoom=new Select(NoRoom);
		NoofRoom.selectByValue("7");
		
		driver.findElement(By.id("datepick_in")).sendKeys("30/04/2025");
		driver.findElement(By.id("datepick_out")).sendKeys("08/05/2025");
		
		WebElement adultRoom=driver.findElement(By.id("adult_room"));
		Select adult_room=new Select(adultRoom);
		adult_room.selectByVisibleText("4 - Four");
		
		WebElement childroom=driver.findElement(By.id("child_room"));
		Select child_room=new Select(childroom);
		child_room.selectByVisibleText("4 - Four");
		
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("xyz");
		driver.findElement(By.id("last_name")).sendKeys("abc");
		driver.findElement(By.id("address")).sendKeys("Medavakkam");
		driver.findElement(By.id("cc_num")).sendKeys("0987654321098765");
		
		WebElement cctype=driver.findElement(By.id("cc_type"));
		Select cc_type=new Select(cctype);
		cc_type.selectByValue("AMEX");
		
		WebElement cc_expmonth=driver.findElement(By.id("cc_exp_month"));
		Select cc_exp_month=new Select(cc_expmonth);
		cc_exp_month.selectByValue("3");
		
		WebElement cc_expyear=driver.findElement(By.id("cc_exp_year"));
		Select cc_exp_year=new Select(cc_expyear);
		cc_exp_year.selectByValue("2030");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("743");
		
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(6000);
		
		WebElement output=driver.findElement(By.id("order_no"));
		
		String OrderNumber = output.getAttribute("value");
        System.out.println("OrderNumber is : " + OrderNumber);
		
		}

}
