package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class RegisterPageLocators extends BaseClass_ResuableMethods{
	public RegisterPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[text()='Register'])[2]")
	private WebElement btnregister;

	@FindBy(xpath = "(//input[@class='form-control-custom form-control'])[1]")
	private WebElement txtName_register;

	@FindBy(id = "formEmail")
	private WebElement txtEmail_register;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement txtMobile_register;

	@FindBy(id = "formPassword")
	private WebElement txtPassword_register;

	@FindBy(xpath = "//button[@class='btn-custom btn btn-primary']")
	private WebElement btnSignUp_register;

	@FindBy(xpath = "//button[@class='google-button-sign-up']")
	private WebElement iconGoogle_register;

	@FindBy(xpath = "//button[@class='apple-button-sign-up']")
	private WebElement iconApple_register;

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement btnsignIn_register;

	@FindBy(xpath = "//button[text()='x']")
	private WebElement btncloseX_register;

	@FindBy(xpath = "//button[text()='Sign Up here']")
	private WebElement btnSignupHere_register;
	
	@FindBy(xpath = "(//div[@class='modal-body'])[1]")
	private WebElement body;
	
//	-----------------------------------------------------------------------------------------

	public WebElement getBtnSignupHere_register() {
		return btnSignupHere_register;
	}

	public WebElement getBtncloseX_register() {
		return btncloseX_register;
	}

	public WebElement getBtnsignIn_register() {
		return btnsignIn_register;
	}

	public WebElement getIconGoogle_register() {
		return iconGoogle_register;
	}

	public WebElement getIconApple_register() {
		return iconApple_register;
	}

	public WebElement getBtnregister() {
		return btnregister;
	}

	public WebElement getTxtName_register() {
		return txtName_register;
	}

	public WebElement getTxtEmail_register() {
		return txtEmail_register;
	}

	public WebElement getTxtMobile_register() {
		return txtMobile_register;
	}

	public WebElement getTxtPassword_register() {
		return txtPassword_register;
	}

	public WebElement getBtnSignUp_register() {
		return btnSignUp_register;
	}

	public WebElement getBody() {
		return body;
	}
	
	

}
