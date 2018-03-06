package com.capitalone.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capitalone.qa.base.TestBase;

public class coFAQPage extends TestBase {
	
	
	// Page Factory - OR


			@FindBy(xpath = "//li[contains(text(),'Need Help?')]")
			WebElement NeedHelpLabel;
			
			@FindBy(xpath = "//a[contains(text(),'Secured Credit Card')]")
			WebElement SecuredCreditCardHelpLink;

			
			@FindBy(xpath = "//img[@alt = 'Capital One']")
			WebElement CapitalOneHomeLogo1;
			

			// Initializing the Page Objects:
			public coFAQPage() {
				PageFactory.initElements(driver, this);
			}

			// Actions - Methods

			public String validateFAQPageTitle() {
				return driver.getTitle();
			}

			public boolean validateNeedHelpLabel() {

				return NeedHelpLabel.isDisplayed();
			}
			
			public boolean validateSecuredCreditCardHelpLink() {

				return SecuredCreditCardHelpLink.isDisplayed();
			}
			
			
			public boolean validateCapitalOneHomeLogo() {

				return CapitalOneHomeLogo1.isDisplayed();
			}

			public coFAQSecuredCreditCardPage clickOnSecuredCreditCardHelpLink() {
				SecuredCreditCardHelpLink.click();
				return new coFAQSecuredCreditCardPage();
			}
			
			public coHomePage clickOnCapitalOneHomeLogo() {
				CapitalOneHomeLogo1.click();
				return new coHomePage();
			}
			

}
