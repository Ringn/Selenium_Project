package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	
	@FindBy(xpath="//div[@class='app_logo']")private WebElement Logo;
	@FindBy(xpath="//div[@class='bm-burger-button']")private WebElement OpenMenu;
	
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifySwagLabHomePageLogo() 
	{
		String exceptedLogo="SWAG LABS";
		String presentlogo = Logo.getText();
		if(presentlogo.equals(exceptedLogo))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
	}
	
	public void clickSwagLabHomePageOpenMenu() 
	{
		OpenMenu.click();
	}

}
