package tutorialsPoint;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Handling_CheckBoxes {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver() ;
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void radioButtons() {
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
