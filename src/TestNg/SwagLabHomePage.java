package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement OpenMenu;
	
	SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickSwagLabHomePageOpenMenu() 
	{
		OpenMenu.click();
		
	}

}
