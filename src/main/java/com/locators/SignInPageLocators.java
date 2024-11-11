package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class SignInPageLocators extends BaseClass_ResuableMethods {

	public SignInPageLocators() {
		PageFactory.initElements(driver, this);
	}

//	---------------------------------SignIn--------------------------------------------------
	@FindBy(xpath = "(//button[text()='Sign In'])[2]")
	private WebElement btnSignIN;

	@FindBy(id = "formEmail")
	private WebElement txtEmail_signIN;

	@FindBy(id = "formPassword")
	private WebElement txtPass_signIN;

	@FindBy(xpath = "(//button[text()='Sign In'])[3]")
	private WebElement btnSignIn_signIN;

//	----------------------------------------------------------------------------------------

	public WebElement getBtnSignIN() {
		return btnSignIN;
	}

	public WebElement getTxtEmail_signIN() {
		return txtEmail_signIN;
	}

	public WebElement getTxtPass_signIN() {
		return txtPass_signIN;
	}

	public WebElement getBtnSignIn_signIN() {
		return btnSignIn_signIN;
	}

}
