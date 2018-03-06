package com.capitalone.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capitalone.qa.base.TestBase;

public class coContactUsPage extends TestBase {
	

	// Page Factory - OR


			@FindBy(xpath = "//li[contains(text(),'Contact Us')]")
			WebElement ContactUsLabel;
			

			
			@FindBy(xpath = "//img[@alt = 'Capital One']")
			WebElement CapitalOneHomeLogo1;
			

			// Initializing the Page Objects:
			public coContactUsPage() {
				PageFactory.initElements(driver, this);
			}

			// Actions - Methods

			public String validateFAQPageTitle() {
				return driver.getTitle();
			}

			public boolean validateContactUsLabel() {

				return ContactUsLabel.isDisplayed();
			}
			
			
			public boolean validateCapitalOneHomeLogo() {

				return CapitalOneHomeLogo1.isDisplayed();
			}

			
			public coHomePage clickOnCapitalOneHomeLogo() {
				CapitalOneHomeLogo1.click();
				return new coHomePage();
			}

}
