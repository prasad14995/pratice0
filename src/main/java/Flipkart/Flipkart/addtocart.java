package Flipkart.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart 
{
	@FindBy(xpath="_2KpZ6l _2U9uOA ihZ75k _3AWRsL") private WebElement AddToCart;
	
	public addtocart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Productaddtocard()
	{
		AddToCart.click();
	}

}
