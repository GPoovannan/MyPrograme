package Week4.day2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;
import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");

		Actions builder = new Actions(driver);

		// 2. Go to Mens Fashion
		WebElement men = driver.findElement(By.linkText("Men's Fashion"));

		builder.moveToElement(men).perform();

		// 3. Go to Sports Shoes

		driver.findElement(By.xpath("//span[contains(text(),'Sports Shoes')][1]")).click();

		// 4. Get the count of the sports shoes

		String string = driver.findElement(By.xpath("//span[contains(@class,'category-name')]")).getText();
		String replaceAll = string.replaceAll("//D", "");
		int count = Integer.parseInt(replaceAll);
		System.out.println("sports shoes: " + count);

		// 5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		// 6. Sort by Low to High

		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();

		WebElement low = driver.findElement(By.xpath("//li[contains(@data-index,'1'][2]"));

		builder.moveToElement(low).click().perform();

		Thread.sleep(3000);

		// 7. Check if the items displayed are sorted correctly

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']']"));

		List<String> sort = new ArrayList<String>();

		for (int i = 0; i < price.size(); i++) {

			String text2 = price.get(i).getText();
			System.out.println(text2);

			sort.add(text2);
			String replaceAl2 = text2.replaceAll("//D", "");
			int count1 = Integer.parseInt(replaceAl2);
			System.out.println(count1);
		}

		// 8.Select the price range (900-1200)
		WebElement frate = driver.findElement(By.xpath("//input[@name='fromVal']"));
		frate.clear();
		frate.sendKeys("900");
		// 9.Filter with color Navy
		WebElement trate = driver.findElement(By.xpath("//input[@name='toVal']"));
		trate.clear();
		trate.sendKeys("1200");

		driver.findElement(By.xpath("//input[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(5000);

		// view more

		driver.findElement(
				By.xpath("//button[@class='view-more-button btn btn-line btn-theme-secondary viewMoreFilter']"))
				.click();
		// filter color
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		Thread.sleep(5000);

		// 10 verify the all applied filters

		List<WebElement> elementVerifyFilters = driver.findElements(By.xpath("//div[@class='navFiltersPill']/a"));
		String text1 = elementVerifyFilters.get(0).getText();
		String text2 = elementVerifyFilters.get(1).getText();
		if (text1.equals("Rs. 469 - Rs. 1200") || text2.contains("Navy")) {
			System.out.println("Filters applied");
		} else
			System.out.println("Filters not applied");

		// 11. Mouse Hover on first resulting Training shoes
		Thread.sleep(3000);
		WebElement elementFirstPrt = driver
				.findElement(By.xpath("(//div[@class='sort-list hidden']/following-sibling::section/div)[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(elementFirstPrt).perform();
		// 12. click QuickView button
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")).click();
		// 13. Print the cost and the discount percentage
		Thread.sleep(3000);

		String textPrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		Thread.sleep(3000);
		String textPercent = driver.findElement(By.xpath("//span[@class='payBlkBig']/following-sibling::span"))
				.getText();
		System.out.println("The Price of Shoe:" + textPrice);
		System.out.println("The Discounted Percentage:" + textPercent);
		// 14. Take the snapshot of the shoes.
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snap/Shoe.png");
		
		FileUtils.copyFile(source, dest);

		// 15. Close the current window
		driver.close();
		// 16. Close the main window

	}

}
