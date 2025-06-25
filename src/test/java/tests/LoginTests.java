package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTests extends BaseTest{

	
	@Test
		public void testvalidLogin() {
		LoginPage loginpageac = new LoginPage(driver);
		loginpageac.enterusername("admin@yourstore.com");
		loginpageac.enterpassword("admin");
		loginpageac.clickLoginBtn();
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		}
	
	
}
