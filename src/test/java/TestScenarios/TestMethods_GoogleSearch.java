//Page Object Model

package TestScenarios;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FaceBookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {

	WebDriver driver;
	
	GoogleSearchPage objectrepo;
	
	@BeforeTest
	public void beforetest() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
			
	}
	
	
	//Test case all
	
	@Test(priority=0)
	public void SearchOperation() throws InterruptedException 
	{
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchgoogle("facebook");
	}
	
	@Test(priority=1)
	public void VerifyandAccessFacebook() 
	{
		objectrepo = new GoogleSearchPage(driver);
		
	}
	
	@Test(priority=2)
	public void VerifyLogin() 
	{
		FaceBookPage page = new FaceBookPage(driver);
		page.EnterUsername();
		page.EnterPassword();
		page.VerifyLogin();
	}
		
		
	@AfterTest
	public void aftertest() throws InterruptedException 
	{
		Thread.sleep(3000);
		//driver.quit();
	}
	
	
	
	
	
	
}
