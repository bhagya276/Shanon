package Tests;

import org.apache.logging.log4j.util.PropertySource.Util;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import Poms.Homepage;
import Poms.Loginpage;
import Utility.UtiliP;

public class Results extends Baseclass {


	private static final String Utilip = null;
	Loginpage l;
	Homepage h;
	@BeforeClass
	public void openBrowser() {//non static method
		initializeBrowser();
		Loginpage l = new Loginpage(driver);
		Homepage h = new Homepage(driver);	
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		l.enterUN(UtiliP.getT(0, 0));//admin
		l.enterPWD(UtiliP.getT(0, 1));//manager
		l.clickLoginBtn();
	}
	@Test
	public void verifyTextofHomePage() throws Throwable {
		Reporter.log("Running verify",true);
		String actText = h.verifyText();
		String expText=UtiliP.getT(0, 2);
		Assert.assertEquals(actText, expText);
		
	}
	@AfterMethod
	public void logoutAPP() {
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closedBrowser() {
		Reporter.log("closed browser",true);
	}




}
