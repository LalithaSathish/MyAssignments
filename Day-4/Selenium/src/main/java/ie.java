import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new InternetExplorerDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle()+" --> From InternetExplorer Browser");
		driver.close();
	}
}
