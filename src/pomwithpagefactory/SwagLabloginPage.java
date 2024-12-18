package pomwithpagefactory;

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
	
	public void inputSwagLabloginPageUN() 
	{
		UN.sendKeys("standard_user");
	}
	
    public void inputSwagLabloginPagePW() 
    {
		PW.sendKeys("secret_sauce");
	}
    public void clickSwagLabloginPageLoginButton() 
    {
		Login.click();
	}



}
