package com.capitalone.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capitalone.qa.base.TestBase;
import com.capitalone.qa.pages.coFAQPage;
import com.capitalone.qa.pages.coFAQSecuredCreditCardPage;
import com.capitalone.qa.pages.coHomePage;

public class coFAQPageTest extends TestBase{
	
	coHomePage HomePage;
	coFAQPage FAQPage;
	coFAQSecuredCreditCardPage FAQSecuredCreditCardPage;

	

	public coFAQPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		HomePage = new coHomePage();
		FAQPage = new coFAQPage();
		FAQSecuredCreditCardPage = new coFAQSecuredCreditCardPage();
		FAQPage = HomePage.clickOnFAQLink();
		
	}

	@Test(priority = 1)
	public void FAQPageTitleTest() {
		String title = FAQPage.validateFAQPageTitle();
		Assert.assertEquals(title, "Find it Fast - Popular Links | Capital One Canada");
	}

	@Test(priority = 2)
	public void NeedHelpLabelTest() {
		boolean isNeedHelpLabel = FAQPage.validateNeedHelpLabel();
		Assert.assertTrue(isNeedHelpLabel);
	}
	
	@Test(priority = 3)
	public void SecuredCreditCardHelpLinkTest() {
		boolean isSecuredCreditCardHelpLink = FAQPage.validateSecuredCreditCardHelpLink();
		Assert.assertTrue(isSecuredCreditCardHelpLink);
	}
	
	
	@Test(priority = 4)
	public void SecuredCreditCardHelpLinkClickTest() {
		FAQSecuredCreditCardPage = FAQPage.clickOnSecuredCreditCardHelpLink();
	}
	
	@Test(priority = 5)
	public void CapitalOneHomeLogoClickTest() {
		HomePage = FAQPage.clickOnCapitalOneHomeLogo();

	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
