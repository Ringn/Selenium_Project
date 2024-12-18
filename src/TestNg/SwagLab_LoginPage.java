package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_LoginPage {
	//first identify the webelement and add private infront of it
	//then add @findby annotation
	
	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PW;
	@FindBy(xpath="//input[@id='login-button']")private WebElement LoginBtn;
	
	//take a constructer and pass Webdriver driver in it
	//in constucter PageFactory.initElements(driver,this) and pass driver
	//pass this to convert xpath in driver.findelement(by.xpath)
	
    public SwagLab_LoginPage(WebDriver driver)
	{
		
	PageFactory.initElements(driver,this);
	
	}
    
    public void inputSwagLab_LoginPageUN(String un) 
    {
    	UN.sendKeys(un);
		
	}
    
    public void inputSwagLab_LoginPagePW(String pw) 
    {
    	
		PW.sendKeys(pw);
	}

    public void clickSwagLab_LoginPageLogin() 
    {
    	LoginBtn.click();
		
	}
	
	

}
