package week2.day2;

import java.awt.Dimension;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.EqualsMethod;

public class ButtonAsses {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]")).click();
		driver.navigate().back();

		// driver.findElement(By.xpath("(//ul)[2]/li[3]/ul/li[2]/a"));

		WebElement actualValue = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]"));

		boolean Value = actualValue.isEnabled();

		if (Value) {
			System.out.println("Button is Enabled");
		}

		else {
			System.out.println("Button is disabled");
		}
		// position

		System.out.println(
				driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following::button"))
						.getLocation());

		// color

		System.out
				.println(driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following::button[1]"))
						.getCssValue("color"));

		/*
		 * WebElement elementColor = driver.findElement(By.tagName("(//h5)[8]")); String
		 * t = elementColor.getCssValue("color"); String c =
		 * Color.fromString(t).asHex(); System.out.println("Color is :" + t);
		 * System.out.println("Hex code for color:" + c);
		 */

		// size

		org.openqa.selenium.Dimension Size = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]")).getSize();

		System.out.println(Size);

		// mouse over
		WebElement elementMouseover = driver.findElement(By.xpath("(//span[text()='Success'])[1]"));
		String color = elementMouseover.getCssValue("background-color");
		// use action class over
		Actions action = new Actions(driver);
		action.moveToElement(elementMouseover).perform();
		// check color changing
		String color1 = elementMouseover.getCssValue("background-color");
		if (color.equals(color1)) {
			System.out.println("color changed");
		} else {
			System.out.println("color not changed");
		}

		// Click Image button
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt102:imageBtn\"][1]")).click();
		// hidden button
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt102:j_idt104\"]")).click();

		// Rounded buttons

		List<WebElement> elementsButtons = driver
				.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::button"));
		int size2 = elementsButtons.size();
		System.out.println("button count:" + ("size2  "));

	}
}
