package Week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeanSnap {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// take only Image screen shot ( check img name web and file should same)
		WebElement img = driver.findElement(By.tagName("img"));
		File screenshotAs = img.getScreenshotAs(OutputType.FILE);

		// take full screen shot
		//File screenshotAs1 = driver.getScreenshotAs(OutputType.FILE);

		// creating an empty image to store my SS

		File dest = new File("./snap/Img001.png");
		
		//File dest = new File("./snap/Img002.png");

		// Merge the SS with image SS

		FileUtils.copyFile(screenshotAs, dest);

	}

}
