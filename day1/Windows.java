package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.Get;
import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click and Confirm new Window Opens

		WebElement openWindows = driver.findElement(By.xpath("//span[contains(text(),'Open')]"));
		openWindows.click();
		System.out.println(openWindows);

		String windowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> img = new ArrayList<String>(windowHandles);

		driver.switchTo().window(img.get(1));

		driver.switchTo().window(windowHandle);

		// Find the number of opened tabs

		driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();

		String windowHandle2 = driver.getWindowHandle();

		Set<String> set = driver.getWindowHandles();

		List<String> img1 = new ArrayList<String>(set);

		System.out.println("Print number page opened: " + img1.size());

		// Close all windows except Primary

		driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']//following::span[1]")).click();

		String windowHandle3 = driver.getWindowHandle();
		for (String windows : driver.getWindowHandles()) {

			if (!windows.equals(windowHandle3)) {
				driver.switchTo().window(windows);
				driver.close();
			}

		}

		System.out.println("Closed all windows!");
		driver.switchTo().window(windowHandle2);

		// Wait for 2 new tabs to open

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		driver.findElement(By.xpath("(//h5[text()='Click and Confirm new Window Opens']//following::span)[5]")).click();
		String windowHandle4 = driver.getWindowHandle();

		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles4);
		Thread.sleep(2000);
		System.out.println("There are " + list1.size() + "opened!");
		for (String handle : windowHandles4) {
			if (!handle.equals(windowHandles4)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}

	}

}
