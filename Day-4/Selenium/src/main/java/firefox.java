import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle()+" --> From FireFox Browser");
		driver.close();
	}
}
