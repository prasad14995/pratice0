package Flipkart.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seachproduct
{
	@FindBy(xpath="(//div[@class='_2kHMtA'])[1]") private WebElement Searchpro;
	 public seachproduct(WebDriver  driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public void seachproduct()
	 {
		 Searchpro.click();
	 }

}
