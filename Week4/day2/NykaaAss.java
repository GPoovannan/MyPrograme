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

public class NykaaAss {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
		Thread.sleep(5000);
		Actions brand = new Actions(driver);
		brand.moveToElement(findElement).perform();
		
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
	
		String title = driver.getTitle();
		
		if (title.contains("L'Oreal Paris")) {
			
			System.out.println("Success");
			
		} else {
			
			System.out.println("Not Success");
		}
		
		//6) Click Category and click Hair->Click haircare->Shampoo

		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Hair')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();
		
		Thread.sleep(5000);
		
		//7) Click->Concern->Color Protection

		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();
		
		//8)check whether the Filter is applied with Shampoo

		String text = driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).getText();
		
		if (text.contains("Shampoo")) {
			
			System.out.println("yes its contains Shampoo");
			
		} else {
			
			System.out.println("No its contains Shampoo");
		}
		
		//9) Click on L'Oreal Paris Colour Protect Shampoo

		driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect')]")).click();
		
		//10) GO to the new window and select size as 175ml

		Set<String> winSet = driver.getWindowHandles();
		List<String> Lists = new ArrayList<String>(winSet);
		driver.switchTo().window(Lists.get(1));	
		//11) Print the MRP of the product
		
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'MRP:')]")).getText();
		
		System.out.println("The amout is : " + text2);

		//12) Click on ADD to BAG
		driver.findElement(By.xpath("//span[contains(text(),'Add to Bag')]")).click();
		
		//13) Go to Shopping Bag 
		driver.findElement(By.xpath("//span[contains(text(),'Account')]/following::span")).click();
		
		//14) Print the Grand Total amount
		
		String text3 = driver.findElement(By.xpath("//span[contains(text(),'Grand Total')]//parent::div")).getText();
		
		String replaceAll = text3.replaceAll("//D","");
		
		int grantTotal=Integer.parseInt(replaceAll);
		
		System.out.println("Total amout: " + grantTotal);
		
		//15) Click Proceed
		
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		//16) Click on Continue as Guest
		
		driver.findElement(By.xpath("//button[contains(@class,'btn full big')]")).click();
		

		//17) Check if this grand total is the same in step 14
		
		String text4 = driver.findElement(By.xpath("//div[contains(text(),'Grand Total')]//following::div[1]")).getText();
		
		String replaceAll1 = text4.replaceAll("//D","");
		
		int grantTotals=Integer.parseInt(replaceAll1);
		
		System.out.println("G Total amout: " + grantTotals);

		if (grantTotal==grantTotals) {
			
			System.out.println("Both are same");
			
		}
		else {
			System.out.println("Both are not same");
		}
		
		//18) Close all windows

		driver.quit();
	}

}
