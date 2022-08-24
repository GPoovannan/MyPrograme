package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
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

		// create tag name
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
		elementComplanyName.sendKeys("ABC");
		elementComplanyName.clear();
		elementComplanyName.sendKeys("Poova");

		// create First companyName

		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("id Locator");
		elementFirstName.clear();
		elementFirstName.sendKeys("Vannan");

		// create last companyName

		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("id Locator");

		// create DepartmentName

		WebElement elementDepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartmentName.sendKeys("Science");

		// create DescriptionField

		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Allow only 12th Pass");

		// Enter EMailID

		WebElement elementEMaileID = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEMaileID.sendKeys("vannan24@gmail.com");

		// select State/Province

		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select yy = new Select(elementState);
		yy.selectByVisibleText("New York");

		// Find the drop down element in select tag

		WebElement elementSourceDD = driver.findElement(By.name("submitButton"));

		// way 1 to handle drop down

		// elementSourceDD.sendKeys("Employee");

		//Select dd = new Select(elementSourceDD);

		// using index

		// dd.selectByIndex(2);

		// 2. using Visible TextS

		// dd.selectByVisibleText("Other");

		// 3. Using value attribute
		//dd.selectByValue("LEAD_EXISTCUST");

		// create Button

		driver.findElement(By.name("submitButton")).click();

		// getTitle
		String currenttitle = driver.getTitle();

		System.out.println(currenttitle);

		// WebElement elementClean =
		// driver.findElement(By.id("createLeadForm_companyName"));

		// driver.findElement(By.xpath("//label[@for = 'username']")

	}
}
