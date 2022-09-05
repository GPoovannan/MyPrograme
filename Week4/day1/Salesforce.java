package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch URL 
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Enter the username as
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		Thread.sleep(2000);
		// Enter the password as
		driver.findElement(By.id("password")).sendKeys("Password#123");
		Thread.sleep(2000);
		// click on the login button
		driver.findElement(By.id("Login")).click();
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleContains("Home | Salesforce"));
		Thread.sleep(2000);
		
		// .click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']/parent::button")).click();
		Thread.sleep(2000);
		// Switch to the next window using Windowhandles.
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list =new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		// click on the confirm button in the redirecting page
		
		driver.findElement(By.xpath("(//button[2])[text()='Confirm']")).click();
		
//		WebElement findElement = driver.findElement(By.className("//button[@class='slds-button slds-button_brand']"));
//		driver.switchTo().activeElement().Onclick();
		Thread.sleep(2000);
		// Get the title
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		// Get back to the parent window
		driver.switchTo().window(windowHandle);
		Thread.sleep(2000);
		// close the browser
		driver.close();

	}

}
