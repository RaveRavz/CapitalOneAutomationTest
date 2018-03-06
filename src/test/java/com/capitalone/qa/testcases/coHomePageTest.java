package com.capitalone.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capitalone.qa.base.TestBase;
import com.capitalone.qa.pages.coCCPage;
import com.capitalone.qa.pages.coContactUsPage;
import com.capitalone.qa.pages.coFAQPage;
import com.capitalone.qa.pages.coHomePage;
import com.capitalone.qa.pages.coWhyCapitalOnePage;

public class coHomePageTest extends TestBase {
	
	coHomePage HomePage;
	coFAQPage FAQPage;
	coContactUsPage ContactUsPage;
	coCCPage CCPage;
	coWhyCapitalOnePage WhyCapitalOnePage;
	

	public coHomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		HomePage = new coHomePage();
	}

	@Test(priority = 1)
	public void HomePageTitleTest() {
		String title = HomePage.validateHomePageTitle();
		Assert.assertEquals(title, "Credit Cards - Compare Credit Cards Online | Capital One Canada");
	}

	@Test(priority = 2)
	public void FAQLinkLabelTest() {
		boolean isFAQLabel = HomePage.validateFAQLabel();
		Assert.assertTrue(isFAQLabel);
	}
	
	@Test(priority = 3)
	public void ContactUsLinkLabelTest() {
		boolean isContactUsLabel = HomePage.validateContactUsLabel();
		Assert.assertTrue(isContactUsLabel);
	}
	
	@Test(priority = 4)
	public void OurCreditCardsDDLinkTest() {
		boolean isOurCreditCardsDDLink = HomePage.validateOurCreditCardsDDLink();
		Assert.assertTrue(isOurCreditCardsDDLink);
	}
	
	@Test(priority = 5)
	public void WhyCapitalOneLinkTest() {
		boolean WhyCapitalOneLink = HomePage.validateWhyCapitalOneLink();
		Assert.assertTrue(WhyCapitalOneLink);
	}

	@Test(priority = 6)
	public void CapitalOneLogoTest() {
		boolean isCapitalOneLogo = HomePage.validateCapitalOneHomeLogo();
		Assert.assertTrue(isCapitalOneLogo);
	}
	
	@Test(priority = 7)
	public void FAQLinkClickTest() {
		FAQPage = HomePage.clickOnFAQLink();

	}
	
	@Test(priority = 8)
	public void ContactUsLinkClickTest() {
		ContactUsPage = HomePage.clickOnContactUsLink();

	}
	
	@Test(priority = 9)
	public void OurCreditCardDDLinkClickTest() {
		CCPage = HomePage.clickOnOurCreditCardsLink();

	}
	
	@Test(priority = 10)
	public void ViewAllCreditCardClickTest() {
		CCPage = HomePage.clickOnViewAllCreditCardsLink();

	}
	
	@Test(priority = 11)
	public void WhyCapitalOneClickTest() {
		WhyCapitalOnePage = HomePage.clickOnWhyCapitalOneLink();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}

