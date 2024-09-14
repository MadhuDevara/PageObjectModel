//Page Object Model
package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookPage {
	

	WebDriver driver; 
	
	// this is precondition for page object model
	public FaceBookPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	By Username_editbox = By.id("email");
	By Password_editbox = By.id("pass");
	By Login_Btn = By.name("login");
	
	public void EnterUsername() 
	{
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("9000002121");
	}
	
	public void EnterPassword() 
	{
		driver.findElement(Password_editbox).clear();
		driver.findElement(Password_editbox).sendKeys("Karan@85");
	}
	
	public void VerifyLogin() 
	{
		driver.findElement(Login_Btn).click();
		String title=driver.getTitle();
		
	}
	
	
	
	
	
	
}
