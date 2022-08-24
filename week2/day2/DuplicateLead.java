package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// To add driver to the code

		WebDriverManager.chromedriver().setup();
		// To open a browser

		ChromeDriver driver = new ChromeDriver();
		// To load on URL

		driver.get("http://leaftaps.com/opentaps/control/login");

		// To maximize for the browser
		driver.manage().window().maximize();

		// To close browser
		// driver.close();

		// create userID
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");

		// create Password
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");

		// click login button
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();

		// create tage name
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		// check if condition
		if (text.contains("Welcome")) {
			System.out.println("Login in success");
		} else {
			System.out.println("login is failed");
		}
		// open API

		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		// open leads elements
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		// click leads and inside open create leads elements

		WebElement elementCreatLead = driver.findElement(By.linkText("Create Lead"));
		elementCreatLead.click();

		// create companyName

		WebElement elementComplanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementComplanyName.sendKeys("id Locator");

		// create First companyName

		// create last companyName

		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("id Locator");

		// create DepartmentName

		WebElement elementDepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartmentName.sendKeys("Science");

		// create DescriptionFieldWebElement elementFirstName =
		// driver.findElement(By.id("createLeadForm_firstName"));
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Dell");

		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Allow me");

		// Enter EMailID

		WebElement elementEMaileID = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEMaileID.sendKeys("vannan24@gmail.com");

		// select State/Province

		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select yy = new Select(elementState);
		yy.selectByVisibleText("New York");

		WebElement elementSourceDD = driver.findElement(By.className("smallSubmit"));

		elementSourceDD.click();

		System.out.println("Tittle :" + driver.getTitle());

		// Duplicate Lead

		driver.findElement(By.linkText("Duplicate Lead")).click();

		WebElement elementComplanyRName = driver.findElement(By.id("createLeadForm_companyName"));
		elementComplanyRName.clear();
		elementComplanyRName.sendKeys("TestLeaf");

		WebElement elementRFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementRFirstName.clear();
		elementRFirstName.sendKeys("Avator");

		driver.findElement(By.className("smallSubmit")).click();

		System.out.println("Tittle :" + driver.getTitle());
	}
}
