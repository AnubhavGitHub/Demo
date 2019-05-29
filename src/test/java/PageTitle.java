import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Anubhav
 *
 */
public class PageTitle {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\UdemyNotes\\Selenium_RahulArora\\Grid\\grid\\grid\\geckodriver.exe");
		driver=new RemoteWebDriver(new URL("http://192.168.43.68:4444/wd/hub"),cap);
		//driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void getTitle()
	{
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
