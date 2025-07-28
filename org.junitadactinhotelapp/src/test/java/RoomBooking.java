import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoomBooking {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		WebDriverManager.chromedriver().setup();
	}

	@Before
	public void LanuchBroswer(){

		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");	
		driver.manage().window().maximize();
	}

	@Test
	public void RoomBook() throws InterruptedException{

		String Uname="xyz1UserName";
		String pass="xyz_passwrod";
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

	}
	@After
	public void Result() throws InterruptedException{

		Thread.sleep(6000);
		WebElement output=driver.findElement(By.id("order_no"));
		String OrderNumber = output.getAttribute("value");
		System.out.println("OrderNumber is : " + OrderNumber);
	}
	
	@AfterClass
	public static void CloseBrowser(){
		try {
			driver.close();
		} catch (org.openqa.selenium.WebDriverException e) {
			System.out.println("Browser already closed or not reachable: " + e.getMessage());
		}
	}
	
}

