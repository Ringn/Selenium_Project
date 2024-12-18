package POM_DDF_TestNg_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwagLabsHomePage {
	
	
	@FindBy(xpath="//div[text()='Swag Labs']")private WebElement Logo;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement PopUp;

	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getHomePageLogo() 
	{
		String actText = Logo.getText();
		
		
		return actText;
	}
	
	public void clickHomePagePopUp() 
	{
		PopUp.click();
		
	}
	
}
