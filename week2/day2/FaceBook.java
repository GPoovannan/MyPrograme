package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		driver.findElement(By.name("firstname")).sendKeys("eniya");

		driver.findElement(By.name("lastname")).sendKeys("vannan");

		// WebElement elementNumber = driver.findElement(By.id("u_2_g_TV"));
		// elementNumber.sendKeys("9894481885");

		driver.findElement(By.name("reg_email__")).sendKeys("vannan24@g");

		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@1");

		// Timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Three drop downs
		WebElement elementDate = driver.findElement(By.id("day"));
		Select dd = new Select(elementDate);
		dd.selectByVisibleText("31");

		WebElement elementMonth = driver.findElement(By.id("month"));
		Select mm = new Select(elementMonth);
		mm.selectByVisibleText("May");

		WebElement elementYear = driver.findElement(By.id("year"));
		Select yy = new Select(elementYear);
		yy.selectByVisibleText("1985");

		driver.findElement(By.name("sex")).click();

		System.out.println("Your facebook account is created  ");

	}

}