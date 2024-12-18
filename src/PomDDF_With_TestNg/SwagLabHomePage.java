package PomDDF_With_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	
	@FindBy(xpath="//title[text()='Swag Labs']")private WebElement logo;
	@FindBy(xpath="//div[@class='bm-burger-button']")private WebElement OpenMenu;
	
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void VerifySwagLabHomePageLogo() 
	{
		String presentlogo =logo.getText();
		String exceptedLogo="Swag Labs";
		System.out.println(presentlogo+"@@@@@@@");
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
