package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLogOut {
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement LogOut;

	
	SwagLabLogOut(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickSwagLabLogOutBTN() 
	{
		LogOut.click();
		
	}
}
