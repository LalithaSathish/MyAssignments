import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle()+" --> From Edge Browser");
		driver.close();
	}

}
