package Flipkart.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class flipkartlogin 
{
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']") private WebElement FlipMobile;
	@FindBy(xpath = "//button[text()='Request OTP']") private WebElement otp;
	
	
	public flipkartlogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterFlpimob(String num)
	{
		FlipMobile.sendKeys(num);
	}
	public void clickonotpline()
	{
		otp.click();
	}


}
