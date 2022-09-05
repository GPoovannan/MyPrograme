package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		// Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		// Click on Widget of From Contact
		// driver.findElement(By.xpath("//input[@id='partyIdFrom']//following::a/img")).click();
		// Click on First Resulting Contact

		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']//following::a")).click();

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		List<String> list = new ArrayList<String>(windowHandles);

		System.out.println(driver.getTitle());

		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]//a")).click();
		driver.switchTo().window(windowHandle);

		// Click on Widget of To Contact

		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']//following::a")).click();

		// Click on Second Resulting Contact

		String windowHandle2 = driver.getWindowHandle();

		Set<String> windowHandles2 = driver.getWindowHandles();

		List<String> list2 = new ArrayList<String>(windowHandles2);

		driver.switchTo().window(list2.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//a")).click();
		
		driver.switchTo().window(windowHandle2);

		// Click on Merge button using Xpath Locator

		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// Accept the Alert

		driver.switchTo().alert().accept();

		// Verify the title of the page

		String title = driver.getTitle();

		System.out.println("Print Title:" + title);

		driver.close();

	}

}
