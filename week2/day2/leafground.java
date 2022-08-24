package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class leafground {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();

		driver.findElement(By.id("j_idt88:name")).sendKeys("Poorvitha");
		driver.findElement(By.id("j_idt88:j_idt91")).clear();
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Tirupathur");

		WebElement actualValue = driver.findElement(By.name("j_idt88:j_idt93"));
		boolean Value = actualValue.isEnabled();

		if (Value) {
			System.out.println("Button is Enabled");
		}

		else {
			System.out.println("Button is disabled");
		}

		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		WebElement elementText = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = elementText.getText();
		System.out.println(text);

		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("Vannan24@");

		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys(
				"I am a person who is positive about every aspect of life. There are many things I like to do, to see, and to experience. I like to read, I like to write.");

		// driver.findElement(By.xpath("<line class=\"ql-stroke\" x1=\"7\" x2=\"15\"
		// y1=\"9\" y2=\"9\"></line>")).sendKeys("ABC");

		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("j_idt106:float-input")).click();

		//driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_input\"]")).sendKeys("Poovannan");

		/*
		 * WebElement elementList =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/ul"));
		 * Select list =new Select(elementList); list.selectByVisibleText("Poovannan3");
		 */

		WebElement elementDateBox = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt116\"]/button"));
		elementDateBox.click();
		
		elementDateBox.sendKeys("05241985");

		
		/*
		 * 
		 * Select elementsSelectName = new Select(driver.findElement(By.
		 * xpath("<button class=\"ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only\" type=\"button\" aria-label=\"Show Options\" role=\"button\" aria-disabled=\"false\"><span class=\"ui-button-icon-primary ui-icon ui-icon-triangle-1-s\"></span><span class=\"ui-button-text\">&nbsp;</span></button>"
		 * ))); elementsSelectName.selectByVisibleText("3");
		 * 
		 * 
		 * WebElement elementDateBox =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt116\"]/button"));
		 * elementDateBox.sendKeys("05241985", Keys.TAB);
		 */

		/*
		 * WebElement elementValue =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt118\"]/a[1]"));
		 * elementValue.sendKeys("20", Keys.TAB);
		 */
		/*
		 * 
		 * driver.findElement(By.
		 * className("p-datepicker ui-calendar ui-trigger-calendar")).click();
		 * 
		 * 
		 * WebElement elementDate =
		 * driver.findElement(By.className("ui-datepicker-month")); Select dd = new
		 * Select(elementDate); dd.selectByVisibleText("31");
		 * 
		 * WebElement elementMonth =
		 * driver.findElement(By.className("ui-datepicker-month")); Select mm = new
		 * Select(elementMonth); mm.selectByVisibleText("May");
		 * 
		 * WebElement elementYear = driver.findElement(By.id("year")); Select yy = new
		 * Select(elementYear); yy.selectByVisibleText("1985");
		 * 
		 * 
		 * driver.findElement(By.name("j_idt88:name")).sendKeys("Poovannan G");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]")).sendKeys(
		 * "Poovannan");
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		 * driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",
		 * Keys.TAB);
		 * driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		 * driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("PDY",
		 * Keys.TAB);
		 * driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		 */

	}

}
