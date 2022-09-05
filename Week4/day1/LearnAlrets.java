package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlrets {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']//following::span[2]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		//driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[2]")).click();

	}

}
