package pom_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOpenMenu {
	
	@FindBy(xpath="//a[text()='Logout']")private WebElement LogOut;
	
	public SwagLabOpenMenu(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSwagLabOpenMenuLogOut() 
	{
		LogOut.click();
	}

}
