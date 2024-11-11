package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class PatientUserProfileLocators extends BaseClass_ResuableMethods {
	
	public PatientUserProfileLocators() {
		PageFactory.initElements(driver, this);
	}
	
//	-----------------SignIn-------------------------------------------------
	@FindBy(xpath = "(//button[text()='Sign In'])[2]")
	private WebElement btnSignIN;

	@FindBy(id = "formEmail")
	private WebElement txtEmail_signIN;

	@FindBy(id = "formPassword")
	private WebElement txtPass_signIN;

	@FindBy(xpath = "(//button[text()='Sign In'])[3]")
	private WebElement btnSignIn_signIN;
	
//	--------------------MyAppoinments-------------------------------------------

	@FindBy(xpath = "//span[text()='Manage Appointments']")
	private WebElement manageAppoinments_signIN;

//	--------------------MyProfile-------------------------------------------

	@FindBy(xpath = "//span[text()='My Profile']")
	private WebElement myProfile_signIN;
	
	@FindBy(xpath = "(//*[name()='svg'][@class='edit-icon'])[1]")
	private WebElement svgPatient_Name;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement txtPatientName_signIn;

	@FindBy(xpath = "(//*[name()='svg'][@class='edit-icon'])[2]")
	private WebElement svgPatient_MobileNum;

	@FindBy(xpath = "(//input[@id='mobileNumber'])[1]")
	private WebElement txtPatientMobile_signIn;

	@FindBy(xpath = "(//*[name()='svg'][@class='edit-icon'])[3]")
	private WebElement svgPatient_Location;

	@FindBy(xpath = "(//input[@id='address'])[1]")
	private WebElement txtPatientLocation_signIn;

	@FindBy(xpath = "(//*[name()='svg'][@class='edit-icon'])[4]")
	private WebElement svgPatient_dob;

	@FindBy(xpath = "(//input[@placeholder='Select date of birth'])[1]")
	private WebElement txtPatientDOB_signIn;

	@FindBy(xpath = "(//select[@id='gender'])[1]")
	private WebElement selectGender_signIn;

	@FindBy(xpath = "(//select[@id='bloodGroup'])[1]")
	private WebElement selectBloodGroup_signIn;

	@FindBy(xpath = "(//*[name()='svg'][@class='edit-icon'])[7]")
	private WebElement svgPatient_InsuranceProvider;

	@FindBy(xpath = "(//input[@id='insuranceProvider'])[1]")
	private WebElement txtPatientInsuranceProvider_signIn;

	@FindBy(xpath = "(//*[name()='svg'][@class='edit-icon'])[8]")
	private WebElement svgPatient_PolicyNumber;

	@FindBy(xpath = "(//input[@id='policyNumber'])[1]")
	private WebElement txtPatientPolicyNumber_signIn;

	@FindBy(xpath = "(//button[@class='savebutton'])[1]")
	private WebElement btnSave_signIn;

	
//	--------------------Inbox-------------------------------------------

	@FindBy(xpath = "//span[text()='Inbox']")
	private WebElement inbox_signIN;
	
//	--------------------Prescription-------------------------------------------

	@FindBy(xpath = "//span[text()='Prescriptions']")
	private WebElement Prescriptions_signIN;
	
//	--------------------Notification-------------------------------------------

	@FindBy(xpath = "//span[text()='Notification']")
	private WebElement notification_signIN;
	
//	--------------------AddReview-------------------------------------------

	@FindBy(xpath = "(//span[normalize-space()='Add Review'])[1]")
	private WebElement addReview_signIN;
	
//	--------------------LogOut-------------------------------------------

	@FindBy(xpath = "//span[text()='Log Out']")
	private WebElement logOut_signIN;

	@FindBy(xpath = "//button[@class='logout-button']")
	private WebElement btnLogOut_signIN;

//------------------------chatbox----------------------------------------------------------------------
	
	@FindBy(xpath = "(//span[@id='zs_fl_close'])[1]")
	private WebElement chatClose_signIN;
	
//---------------------------------------------------------------------------------------------------
	
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

	public WebElement getManageAppoinments_signIN() {
		return manageAppoinments_signIN;
	}

	public WebElement getMyProfile_signIN() {
		return myProfile_signIN;
	}

	public WebElement getSvgPatient_Name() {
		return svgPatient_Name;
	}

	public WebElement getTxtPatientName_signIn() {
		return txtPatientName_signIn;
	}

	public WebElement getSvgPatient_MobileNum() {
		return svgPatient_MobileNum;
	}

	public WebElement getTxtPatientMobile_signIn() {
		return txtPatientMobile_signIn;
	}

	public WebElement getSvgPatient_Location() {
		return svgPatient_Location;
	}

	public WebElement getTxtPatientLocation_signIn() {
		return txtPatientLocation_signIn;
	}

	public WebElement getSvgPatient_dob() {
		return svgPatient_dob;
	}

	public WebElement getTxtPatientDOB_signIn() {
		return txtPatientDOB_signIn;
	}

	public WebElement getSelectGender_signIn() {
		return selectGender_signIn;
	}

	public WebElement getSelectBloodGroup_signIn() {
		return selectBloodGroup_signIn;
	}

	public WebElement getSvgPatient_InsuranceProvider() {
		return svgPatient_InsuranceProvider;
	}

	public WebElement getTxtPatientInsuranceProvider_signIn() {
		return txtPatientInsuranceProvider_signIn;
	}

	public WebElement getSvgPatient_PolicyNumber() {
		return svgPatient_PolicyNumber;
	}

	public WebElement getTxtPatientPolicyNumber_signIn() {
		return txtPatientPolicyNumber_signIn;
	}

	public WebElement getBtnSave_signIn() {
		return btnSave_signIn;
	}

	public WebElement getInbox_signIN() {
		return inbox_signIN;
	}

	public WebElement getPrescriptions_signIN() {
		return Prescriptions_signIN;
	}

	public WebElement getNotification_signIN() {
		return notification_signIN;
	}

	public WebElement getAddReview_signIN() {
		return addReview_signIN;
	}

	public WebElement getLogOut_signIN() {
		return logOut_signIN;
	}

	public WebElement getBtnLogOut_signIN() {
		return btnLogOut_signIN;
	}

	public WebElement getChatClose_signIN() {
		return chatClose_signIN;
	}
	
	
	
	
	
	
	
	
	
	

}
