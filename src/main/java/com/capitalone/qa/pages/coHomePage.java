package com.capitalone.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capitalone.qa.base.TestBase;

public class coHomePage extends TestBase {
	
	// Page Factory - OR


		@FindBy(xpath = "//a[contains(text(),'FAQ')]")
		WebElement FAQLink;
		
		@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
		WebElement ContactUsLink;

		@FindBy(id = "dropdown__link_en_our_credit_cards")
		WebElement OurCreditCardsLinkDD;

		@FindBy(id = "dropdown__link_en_why_capital_one")
		WebElement WhyCapitalOneLink;
		
		@FindBy(id = "dropdown__link_en_see_all_credit_cards")
		WebElement ViewAllCcLink;
		
		@FindBy(id = "header__link_en_logo")
		WebElement CapitalOneHomeLogo;
		

		// Initializing the Page Objects:
		public coHomePage() {
			PageFactory.initElements(driver, this);
		}

		// Actions - Methods

		public String validateHomePageTitle() {
			return driver.getTitle();
		}

		public boolean validateFAQLabel() {

			return FAQLink.isDisplayed();
		}
		
		public boolean validateContactUsLabel() {

			return ContactUsLink.isDisplayed();
		}
		
		public boolean validateOurCreditCardsDDLink() {

			return OurCreditCardsLinkDD.isDisplayed();
		}
		
		public boolean validateWhyCapitalOneLink() {

			return WhyCapitalOneLink.isDisplayed();
		}
		
		public boolean validateCapitalOneHomeLogo() {

			return CapitalOneHomeLogo.isDisplayed();
		}

		public coFAQPage clickOnFAQLink() {
			FAQLink.click();
			return new coFAQPage();
		}
		
		public coContactUsPage clickOnContactUsLink() {
			ContactUsLink.click();
			return new coContactUsPage();
		}
		
		public coCCPage clickOnOurCreditCardsLink() {
			OurCreditCardsLinkDD.click();
			return new coCCPage();
		}
		
		public coCCPage clickOnViewAllCreditCardsLink() {
			Actions action = new Actions(driver);
			action.moveToElement(OurCreditCardsLinkDD).build().perform();
			ViewAllCcLink.sendKeys("return");;
			return new coCCPage();
		}
		
		public coWhyCapitalOnePage clickOnWhyCapitalOneLink() {
			WhyCapitalOneLink.click();
			return new coWhyCapitalOnePage();
		}
		
		
		
		}

