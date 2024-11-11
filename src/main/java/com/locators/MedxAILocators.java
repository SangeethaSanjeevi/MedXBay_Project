package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class MedxAILocators extends BaseClass_ResuableMethods {
	public MedxAILocators() {
		PageFactory.initElements(driver, this);
	}

//	--------------------------------------search--------------------------------------------------------------------
	@FindBy(xpath = "(//a[text()='Medx AI'])[2]")
	private WebElement btnMedxAI;

	@FindBy(xpath = "(//h2[contains(text(),'Ask how we can integrate AI into your healthcare s')])[1]")
	private WebElement pagedown;

	@FindBy(xpath = "(//h3[@class='zpheading zpheading-style-none zpheading-align-center '])[1]")
	private WebElement pageUp;

//----------------------------------------------------------------------------------------------
	public WebElement getBtnMedxAI() {
		return btnMedxAI;
	}

	public WebElement getPagedown() {
		return pagedown;
	}

	public WebElement getPageUp() {
		return pageUp;
	}

}
