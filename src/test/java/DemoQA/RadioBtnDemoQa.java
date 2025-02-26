package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioBtnDemoQa {
	public static void main(String[] args) throws Exception{
		
		// Initiate WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		clickYesBtn(driver);
		Thread.sleep(3000);
		clickImpressiveBtn(driver);
		Thread.sleep(3000);
		clickNoBtn(driver);
		
		Assert.assertTrue(clickYesBtn(driver) && clickImpressiveBtn(driver) && clickNoBtn(driver), "All Checks Boxes are validated");
		
		driver.quit();		
	}
	
	public static Boolean clickYesBtn(WebDriver driver) {
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		String text = driver.findElement(By.xpath("//span[@class='text-success']")).getText();
		if(text == "Yes") {
			return true;
		}
		return false;
	}
	
	public static Boolean clickImpressiveBtn(WebDriver driver) {
		driver.findElement(By.xpath("//label[normalize-space()='Impressive']")).click();
		String text = driver.findElement(By.xpath("//span[@class='text-success']")).getText();
		if(text == "Impressive") {
			return true;
		}
		return false;
	}
	
	public static boolean clickNoBtn(WebDriver driver) {
		WebElement noBtn = driver.findElement(By.xpath("//label[normalize-space()='No']"));
		if(noBtn.isEnabled()) {
			noBtn.click();
		}
		return false;
	}
}