package POM_DDF_TestNg_with_Baseand_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabloginPage {

	
	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PW;
	@FindBy(xpath="//input[@id='login-button']")private WebElement Login;
	
	public SwagLabloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputSwagLabloginPageUN(String username) 
	{
		UN.sendKeys(username);
	}
	
    public void inputSwagLabloginPagePW(String password) 
    {
		PW.sendKeys(password);
	}
    public void clickSwagLabloginPageLoginButton() 
    {
		Login.click();
	}



}
