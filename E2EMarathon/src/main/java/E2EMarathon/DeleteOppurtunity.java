package E2EMarathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteOppurtunity {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle_container")).click();
		WebElement Click1=driver.findElement(By.xpath("//button[text()='View All']"));
		driver.executeScript("arguments[0].click();", Click1);
		WebElement clickSales = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", clickSales);
		WebElement clickOppurtunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", clickOppurtunity);

		driver.findElement(By.xpath("//*[@data-key='table']")).click();

		driver.findElement(By.xpath(("//span[text()='Kanban']"))).click();

		List<WebElement> clickDropDown = driver
				.findElements(By.xpath("//button[@class='slds-button slds-button_neutral showActionsButton']"));

		int size = clickDropDown.size();
		if (size > 0) {

			for (int i = 1; i <= size; i++) {

				WebElement element = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_neutral showActionsButton'])[" + i + "]"));
				wait.until(ExpectedConditions.elementToBeClickable(element));
				
				WebElement clickDelete = driver.findElement(By.xpath("//div[text()='Delete']"));
				driver.executeScript("arguments[0].click();", clickDelete);

				WebElement dell = driver.findElement(By.xpath("//button[@title='Delete']"));

				wait.until(ExpectedConditions.elementToBeClickable(dell));
				dell.click();

			}
		}
		
		else {
			System.out.println("All Oppurtunties are deleted");
		}

	}
}
