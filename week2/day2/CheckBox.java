package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Basic
		driver.findElement(By.className("ui-chkbox-label")).click();
		
		// Notifi
		
		driver.findElement(By.className("ui-chkbox-label")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("ui-chkbox-label")).is());
		Thread.sleep(2000);

		// Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='C-Sharp']")).getText());
		Thread.sleep(2000);

		// Tri State Checkbox
		
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c']")).click();
		Thread.sleep(2000);
		
		//Toggle Switch
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		// Verify if check box is disabled
		
		boolean enabled = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]")).isEnabled();
		
		if(enabled) {
			System.out.println("box is disablled");
		}else
		{
			System.out.println("box is enabled");
		}
		Thread.sleep(2000);
		
		// Select Multiple
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/div[2]/label[4]"))
		 * .click(); driver.findElement(By.xpath("//label[text()=\"Paris\"]")).click();
		 * Thread.sleep(2000);
		 */
		
		


		//driver.close();
	}
}