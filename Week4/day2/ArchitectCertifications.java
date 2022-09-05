package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

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

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleContains("Home | Salesforce"));
		Thread.sleep(2000);

		// 3. Click on Learn More link in Mobile Publisher

		driver.findElement(By.xpath("//span[text()='Learn More']//parent::button")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		Thread.sleep(2000);

		// Click On Confirm

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		Thread.sleep(2000);

		// Select SalesForce Certification Under Learnings

		Shadow shad = new Shadow(driver);

		shad.findElementByXPath("//span[text()='Learning']").click();

		WebElement element = shad.findElementByXPath("//span[text()='Learning on Trailhead']/parent::div");

		// Action class
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(element).perform();

		// 6. Clilck on Salesforce Certifications

		WebElement element2 = shad.findElementByXPath("//a[text()='Salesforce Certification']"); // scroll to that and
																									// click
		builder1.scrollToElement(element2).perform();
		element2.click();

		// Choose Your Role as Salesforce Architect

		driver.findElement(By.xpath("//div[text()='Architect']")).click();

		// Get the Text(Summary) of Salesforce Architect

		String summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text')]")).getText();

		System.out.println("Salesforce summay is:" + summary);

		// Get the List of Salesforce Architect Certifications Available

		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'credentials-card_title')]/a"));

		System.out.println("Title of Architect");
		for (WebElement title : list) {
			System.out.println(title.getText());
		}

		// Click on Application Architect

		list.get(0).click();

		// Get the List of Certifications available

		List<WebElement> certificate = driver
				.findElements(By.xpath("//div[contains(@class,'credentials-card_title')]/a"));
		System.out.println("Certifications of architect");

		for (WebElement List1 : certificate) {
			System.out.println(List1.getText());
		}

	}
}
