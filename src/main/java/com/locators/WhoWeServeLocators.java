package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class WhoWeServeLocators extends BaseClass_ResuableMethods {
	public WhoWeServeLocators() {
		PageFactory.initElements(driver, this);
	}

//-------------------------------whoweserve--------------------------------------------
	
	@FindBy(xpath = "(//a[contains(@role,'button')][normalize-space()='Who We Serve'])[2]")
	private WebElement btnWhoWeServe;
	
//  --------------------Dr/physician--------------------------------------------------------	
	
	@FindBy(xpath = "(//a[contains(@class,'dropdown-item')])[11]")
	private WebElement btnDrPhysician;
	
	@FindBy(id = "what")
	private WebElement searchWhat_FindProvider;

	@FindBy(id = "where")
	private WebElement searchWhere_FindProvider;

	@FindBy(xpath = "//button[text()='Find My Provider']")
	private WebElement btnFindProvider_FindProvider;
		
	@FindBy(xpath = "(//button[normalize-space()='Register now'])[1]")
	private WebElement btnRegister;
	
	@FindBy(xpath = "(//div[@class='modal-content'])[1]")
	private WebElement btnClose_Register;
//	-----------------------Patients-------------------------------------------------------------
	@FindBy(xpath = "(//a[contains(@class,'dropdown-item')][normalize-space()='Patients'])[2]")
	private WebElement btnPatients;
	
	@FindBy(xpath = "//button[@class='patients-fourth-signup-button']")
	private WebElement btnSignUp;
//	---------------------------Enterprise----------------------------------------------------------------
	@FindBy(xpath = "(//a[contains(@class,'dropdown-item')][normalize-space()='Enterprise'])[2]")
	private WebElement btnEnterprise;
	
	@FindBy(xpath = "(//button[normalize-space()='Schedule demo'])[1]")
	private WebElement btnScheduleDemo;
	
//	-----------------------------------------------------------------------------------------------------------------
	public WebElement getBtnWhoWeServe() {
		return btnWhoWeServe;
	}
	public WebElement getBtnDrPhysician() {
		return btnDrPhysician;
	}
	public WebElement getSearchWhat_FindProvider() {
		return searchWhat_FindProvider;
	}
	public WebElement getSearchWhere_FindProvider() {
		return searchWhere_FindProvider;
	}
	public WebElement getBtnFindProvider_FindProvider() {
		return btnFindProvider_FindProvider;
	}
	public WebElement getBtnRegister() {
		return btnRegister;
	}
	public WebElement getBtnPatients() {
		return btnPatients;
	}
	public WebElement getBtnEnterprise() {
		return btnEnterprise;
	}
	public WebElement getBtnClose_Register() {
		return btnClose_Register;
	}
	public WebElement getBtnScheduleDemo() {
		return btnScheduleDemo;
	}
	public WebElement getBtnSignUp() {
		return btnSignUp;
	}
	
	

}
