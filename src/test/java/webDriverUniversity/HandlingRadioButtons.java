package webDriverUniversity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* Follow these test cases :-
 * 1) Select custom radio button.
 * 2) Select radio button which color starts with 'O'.
 * 3) Check all buttons are Enabled, if enable Click one by one.
 */

public class HandlingRadioButtons {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window();
	}
	
	@Test
	public void radioButtons() {
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
