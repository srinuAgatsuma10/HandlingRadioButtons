package tutorialsPoint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Handling_CheckBoxes {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void radioButtonYes() {
		// Question
		System.out.println("Question : " + driver.findElement(By.xpath("//p[@class='text-left']")).getText());

		driver.findElement(By.xpath("//input[@value='igottwo']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='check']")).getText());
	}

	@Test(priority = 2)
	public void radioButtonNo() {
		// Question
		System.out.println("Question : " + driver.findElement(By.xpath("//p[@class='text-left']")).getText());

		driver.findElement(By.xpath("//input[@value='igotthree']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='check1']")).getText());
	}

	@Test(priority = 3)
	public void radioButtonDisabled() {
		// Question
		System.out.println("Question : " + driver.findElement(By.xpath("//p[@class='text-left']")).getText());

		driver.findElement(By.xpath("//label[normalize-space()='No (Disable)']")).click();

		System.out.println("This Radio Button is Disabled");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
