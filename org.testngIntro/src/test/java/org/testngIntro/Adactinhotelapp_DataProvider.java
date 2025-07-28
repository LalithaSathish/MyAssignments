package org.testngIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Adactinhotelapp_DataProvider {
	
	@DataProvider(name="Datas")
	private String[][] datas() {
		String[][] data=new String[5][5];
		
		data[0][0]="Lalitha";
		data[0][1]="Sathish";
		data[0][2]="Medavakkam";
		data[0][3]="1234567890123456";
		
		data[0][4]="111";
		
		data[1][0]="Dhiyazhini";
		data[1][1]="Sathish";
		data[1][2]="Medavakkam";
		data[1][3]="1234567890123456";
		data[1][4]="111";
		
		data[2][0]="Karnan";
		data[2][1]="Sathish";
		data[2][2]="Medavakkam";
		data[2][3]="1234567890123456";
		data[2][4]="111";
		
		data[3][0]="Sathish";
		data[3][1]="Kumar";
		data[3][2]="Medavakkam";
		
		data[3][3]="1234567890123456";
		data[3][4]="111";
		
		data[4][0]="Loki";
		data[4][1]="Sathish";
		data[4][2]="Medavakkam";
		data[4][3]="1234567890123456";
		data[4][4]="111";
		
		return data;
				
	}
	@Test(dataProvider="Datas")
	private void login(String FName,String LName,String Address,String CreditCardNumber,String Cvv) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");	
		driver.manage().window().maximize();

		//Enter UserName
		driver.findElement(By.id("username")).sendKeys("xyz1UserName");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("xyz_passwrod");
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
		
		driver.findElement(By.id("first_name")).sendKeys(FName);
		driver.findElement(By.id("last_name")).sendKeys(LName);
		driver.findElement(By.id("address")).sendKeys(Address);
		driver.findElement(By.id("cc_num")).sendKeys(CreditCardNumber);

		WebElement cctype=driver.findElement(By.id("cc_type"));
		Select cc_type=new Select(cctype);
		cc_type.selectByValue("AMEX");

		WebElement cc_expmonth=driver.findElement(By.id("cc_exp_month"));
		Select cc_exp_month=new Select(cc_expmonth);
		cc_exp_month.selectByValue("3");

		WebElement cc_expyear=driver.findElement(By.id("cc_exp_year"));
		Select cc_exp_year=new Select(cc_expyear);
		cc_exp_year.selectByValue("2030");

		driver.findElement(By.id("cc_cvv")).sendKeys(Cvv);
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(6000);
		WebElement output=driver.findElement(By.id("order_no"));
		String OrderNumber = output.getAttribute("value");
		System.out.println("OrderNumber is : " + OrderNumber);
		
	}
}
