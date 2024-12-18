package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
 
	@Findby(xpath="")private WebElement shoe;
	
	public Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void name() 
	{
		shoe.click();
		
	}
	
	
	
	
	
	
	  
	


}
