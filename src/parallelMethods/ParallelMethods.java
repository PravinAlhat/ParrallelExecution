package parallelMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class ParallelMethods {
	String workDir = System.getProperty("user.dir");

	@Test    
	public void executSessionOne() throws InterruptedException {
		// First session of WebDriver
		System.setProperty("webdriver.chrome.driver", workDir
				+ "//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Goto automation practice site
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();
		// clicking on Sign In link
		WebElement link_SignIn = driver.findElement(By.linkText("Sign in"));
		link_SignIn.click();
		Thread.sleep(1000);
		driver.close();
	}
        
    @Test    
        public void executeSessionTwo() throws InterruptedException{
		// First session of WebDriver
		System.setProperty("webdriver.gecko.driver", workDir
				+ "//drivers//geckodriver64.exe");
		WebDriver driver = new FirefoxDriver();
		// Goto automation practice site
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();
		// clicking on Sign In link
		WebElement link_SignIn = driver.findElement(By.linkText("Sign in"));
		link_SignIn.click();
		Thread.sleep(1000);
		driver.close();
	}
        
    @Test    
        public void executSessionThree() throws InterruptedException{
		// First session of WebDriver
		System.setProperty("webdriver.ie.driver", workDir
				+ "//drivers//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		// Goto automation practice site
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the browser
		driver.manage().window().maximize();
		// clicking on Sign In link
		WebElement link_SignIn = driver.findElement(By.linkText("Sign in"));
		link_SignIn.click();
		Thread.sleep(1000);
		driver.close();
	}    
    
}