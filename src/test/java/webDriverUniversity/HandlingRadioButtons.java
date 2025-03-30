package webDriverUniversity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.manage().window().maximize();
	}

	@Test
	public void radioButtons() {
		// 1) Select custom radio button.
		driver.findElement(By.xpath("//input[@value='green']")).click();

		// 2) Select radio button which color starts with 'O'.
		List<WebElement> radioButtons = driver
				.findElements(By.xpath("//form[@id='radio-buttons']//input[@type='radio']"));
		for (WebElement rb : radioButtons) {
			String color = rb.getAttribute("value");
			if (color.startsWith("o")) {
				rb.click();
			}
		}

		// 3) Check all buttons are Enabled, if enable Click one by one.
		for (WebElement rb : radioButtons) {
			if (rb.isEnabled()) {
				rb.click();
			}
		}

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
