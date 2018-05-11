package parallelClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class InternetExplorer {
	String workDir = System.getProperty("user.dir");
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();
		// clicking on Sign In link
		WebElement link_SignIn = driver.findElement(By.linkText("Sign in"));
		link_SignIn.click();
		Thread.sleep(1000);
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.ie.driver", workDir
				+ "//drivers//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
