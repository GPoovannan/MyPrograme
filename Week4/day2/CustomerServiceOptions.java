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

public class CustomerServiceOptions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");

		driver.findElement(By.id("password")).sendKeys("Password#123");

		// driver.findElement(By.id("Login")).click();

		driver.findElement(By.xpath("//input[@id='Login']")).click();

		driver.findElement(By.xpath("//span[text()='Learn More']//parent::button")).click();
		driver.getWindowHandle();
		Set<String> list = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(list);
		driver.switchTo().window(win.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		Shadow dom = new Shadow(driver);
		dom.findElementByXPath("//span[text()='Products']").click();

		WebElement nextSlide = dom.findElementByXPath("//span[text()='Service']");
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(nextSlide).perform();

		dom.findElementByXPath("//a[text()='Customer Service']").click();
		
		List<WebElement> serviceName = driver.findElements(By.xpath("//h2[@data-equalize='heading1']"));
		for (WebElement name : serviceName) {
			System.out.println(name.getText());
		}

		String title = driver.getTitle();
		if (title.contains("Customer Service")) {
			System.out.println("Success");
		} else {
			System.out.println("Not Success");
		}

	}

}
