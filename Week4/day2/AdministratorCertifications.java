package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertifications {

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
		// Enter the password
		driver.findElement(By.id("password")).sendKeys("Password#123");
		Thread.sleep(2000); // click on the login button
		driver.findElement(By.id("Login")).click();

		// 3. Click on Learn More link in Mobile Publisher

		driver.findElement(By.xpath("//span[text()='Learn More']//parent::button")).click();

		// 4. Click confirm on Confirm redirect

		// it is new window

		Set<String> windowHandles = driver.getWindowHandles();
		// order wise get windows
		List<String> win = new ArrayList<String>(windowHandles);
		// redirect to required window
		driver.switchTo().window(win.get(1));
		Thread.sleep(2000);

		// click on redirect confirm.

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		// 5. Click Resources and mouse hover on Learning On Trailhead
		// shadow method

		Shadow shad = new Shadow(driver);
		shad.findElementByXPath("//span[text()='Learning']").click();

		WebElement eleTraihead = shad.findElementByXPath("//span[text()='Learning on Trailhead']/parent::div");
		// Action class
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(eleTraihead).perform();

		// 6. Clilck on Salesforce Certifications

		WebElement element2 = shad.findElementByXPath("//a[text()='Salesforce Certification']"); // scroll to that and
																									// click
		builder.scrollToElement(element2).perform();
		element2.click();

		// 6. Click on Ceritification Administrator

		driver.findElement(By.xpath("//a[text()='Administrator']//parent::div")).click();

		// 7. Navigate to Certification - Administrator Overview window
		// 8. Verify the Certifications available for Administrator Certifications
		// should be displayed

		String text = driver.findElement(By.xpath("//div[contains(@class,'certification-banner_title')]")).getText();

		if (text.equals("Administrator")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not verified");
		}

	}

}
