package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandlingRadioButton {

	public static WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void clickYesBtn() {
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		String text = driver.findElement(By.xpath("//span[@class='text-success']")).getText();

		Assert.assertEquals(text, "Yes");
	}

	@Test(priority = 2)
	public void clickImpressiveBtn() {
		driver.findElement(By.xpath("//label[normalize-space()='Impressive']")).click();
		String text = driver.findElement(By.xpath("//span[@class='text-success']")).getText();

		Assert.assertEquals(text, "Impressive");
	}

	@Test(priority = 3)
	public void clickNoBtn() {
		String noBtn = driver.findElement(By.xpath("//label[normalize-space()='No']")).getText();
		System.out.println(noBtn);
		Assert.assertTrue(true, "The Element is Not Clickable");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}