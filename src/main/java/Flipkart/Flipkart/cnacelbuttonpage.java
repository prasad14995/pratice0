package Flipkart.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class cnacelbuttonpage 
{
	@FindBy(xpath="//span[@role='button']") private WebElement ClickOnCancelButton;
	@FindBy(xpath="(//a[@class='_1TOQfO'])[1]") private WebElement clickonlogin;
	
	public cnacelbuttonpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickoncancel()
	{
		ClickOnCancelButton.click();
	}
	
	public void clickonlogin()
	{
		clickonlogin.click();
	}
}
