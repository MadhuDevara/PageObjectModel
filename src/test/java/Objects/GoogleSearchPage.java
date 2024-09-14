//Page Object model

package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GoogleSearchPage {

	//Create a constructor similar to method
	
	WebDriver driver; 
	
	// this is precondition for page object model
	public GoogleSearchPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By searchbox = By.cssSelector("#APjFqb");
	By Search_btn = By.xpath("(//input[@name='btnK'])[2]");
	By Facebook_link = By.xpath("//h3[normalize-space()='Facebook - log in or sign up']");
	
	
	//Try catch will help handle the expection or unhandily the exception
	public void searchgoogle(String Searchinput) 
	{
		try 
		{
			driver.findElement(searchbox).sendKeys(Searchinput);
			driver.findElement(Search_btn).click();
			driver.findElement(Facebook_link).click();
			
		} catch (Exception e) 
		
	{
		System.out.println("Exceptions Caught" + e.getMessage());
									
	}
		
	
	}
	
}
