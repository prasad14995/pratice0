package FlipkartTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Flipkart.Flipkart.FKHomePAge;
import Flipkart.Flipkart.addtocart;
import Flipkart.Flipkart.cnacelbuttonpage;
import Flipkart.Flipkart.flipkartlogin;
import Flipkart.Flipkart.seachproduct;
import liberayclass_flipkart.BAsrClassFlip;
import liberayclass_flipkart.utilityclass;

public class FlipkartAppTest_class extends BAsrClassFlip
{
	cnacelbuttonpage c0 ;
	flipkartlogin fplogin;
	FKHomePAge home ;
	seachproduct s0;
	addtocart a0;
	
	
	@BeforeClass
	public void openbrowser()
	{
		Openflipkart();
		c0= new cnacelbuttonpage(driver);
		fplogin = new flipkartlogin(driver);
		home = new FKHomePAge(driver);
		s0 = new seachproduct(driver);
		a0 = new addtocart(driver);
	
		
		
		
	}
	
	@BeforeMethod
	public void openapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		c0.clickoncancel();
		c0.clickonlogin();
		Thread.sleep(11000);
		home.searchproduct(utilityclass.TestData(0, 0));
		home.clcikonsub();
		Thread.sleep(5000);

		s0.seachproduct();
		a0.Productaddtocard();

//		fplogin.EnterFlpimob(utilityclass.TestData(0, 0));
//		fplogin.clickonotpline();
	}
	
	@Test
	public void verify()
	{
		
	}

}
