package Flipkart.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FKHomePAge 
{
	@FindBy(xpath = "//input[@type='text']") private WebElement Search;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Submit;
	
	public FKHomePAge(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchproduct(String Prodname)
	{
		Search.sendKeys(Prodname);
		
	}
	
	public void clcikonsub()
	{
		Submit.click();
	}

}
