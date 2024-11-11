package com.test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.locators.PatientUserProfileLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M9_PatientUserProfilePage extends BaseClass_ResuableMethods {

	public static PatientUserProfileLocators p;

	@BeforeClass
	private void browserLaunch() {
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("UserEdit page tested successfully");

	}

	@BeforeMethod
	private void login() throws InterruptedException {
		p = new PatientUserProfileLocators();
		click(p.getBtnSignIN());
		Thread.sleep(1000);
		sendkeys(p.getTxtEmail_signIN(), "sangeesanjeevbe@gmail.com");
		sendkeys(p.getTxtPass_signIN(), "$12345678");
		click(p.getBtnSignIn_signIN());
		softAssert("userprofile", "Verify Signin with valid credential");
		Thread.sleep(3000);

	}

	@AfterMethod
	private void logout() throws InterruptedException {
		p = new PatientUserProfileLocators();
		Thread.sleep(10000);
		click(p.getLogOut_signIN());
		Thread.sleep(10000);
	}

	@Test(priority = 2)
	private void UserProfile_MyAppoinments() throws InterruptedException {
		p = new PatientUserProfileLocators();
		click(p.getManageAppoinments_signIN());
		softAssert("appointments", "Verify MyAppoinments");
		
		p = new PatientUserProfileLocators();
		click(p.getInbox_signIN());
		softAssert("inbox", "Verify Inbox");
		
		p = new PatientUserProfileLocators();
		click(p.getPrescriptions_signIN());
		softAssert("prescription", "Verify Prescription");
		
		p = new PatientUserProfileLocators();
		click(p.getAddReview_signIN());
		softAssert("review", "Verify Review");
		
		
		p = new PatientUserProfileLocators();
		click(p.getNotification_signIN());
		softAssert("notification", "Verify Notification");
	}

	@Test(priority = 3)
	private void UserProfile_Inbox() throws InterruptedException {
//		p = new PatientUserProfileLocators();
//		click(p.getInbox_signIN());
//		softAssert("inbox", "Verify Inbox");
	}

	@Test(priority = 4)
	private void UserProfile_Prescription() throws InterruptedException {
//		p = new PatientUserProfileLocators();
//		click(p.getPrescriptions_signIN());
//		softAssert("prescription", "Verify Prescription");
	}

	@Test(priority = 5)
	private void UserProfile_Review() throws InterruptedException {
//		p = new PatientUserProfileLocators();
//		click(p.getAddReview_signIN());
//		softAssert("review", "Verify Review");
	}

	@Test(priority = 6)
	private void UserProfile_Notification() throws InterruptedException {
//		p = new PatientUserProfileLocators();
//		click(p.getNotification_signIN());
//		softAssert("notification", "Verify Notification");
	}

	@Test(priority = 7)
	private void UserProfile_MyProfile_Name_WithoutName() throws InterruptedException, AWTException {
		p = new PatientUserProfileLocators();
		click(p.getMyProfile_signIN());
		softAssert("profile", "Verify MyProfile");
		action_doubleClick(p.getSvgPatient_Name());
		action_doubleClick(p.getTxtPatientName_signIn());
		Thread.sleep(8000);
		delete();
		Thread.sleep(5000);
		tab();
		click(p.getBtnSave_signIn());
		pageValidation("Error updating profile", "Name is required", "Verify Name Field Without Name showing error");
		Thread.sleep(10000);
		 driver.navigate().refresh();
		 
		 p = new PatientUserProfileLocators();
			action_doubleClick(p.getSvgPatient_Name());
			action_doubleClick(p.getTxtPatientName_signIn());
			Thread.sleep(5000);
			sendkeys(p.getTxtPatientName_signIn(), "ab");
			Thread.sleep(3000);
			tab();
			click(p.getBtnSave_signIn());
			pageValidation("Error updating profile", "Name must be between 3 and 50 characters long",
					"Verify Name Field with two letter - showing error");
			Thread.sleep(10000);
			driver.navigate().refresh();
			
			p = new PatientUserProfileLocators();
			action_doubleClick(p.getSvgPatient_Name());
			action_doubleClick(p.getTxtPatientName_signIn());
			delete();
			Thread.sleep(3000);
			sendkeys(p.getTxtPatientName_signIn(), "ab*");
			tab();
			Thread.sleep(3000);
			click(p.getBtnSave_signIn());
			pageValidation("Error updating profile", "Error updating profile",
					"Verify Name Field with Special Character - showing error");
			Thread.sleep(10000);
			driver.navigate().refresh();
			
			p = new PatientUserProfileLocators();
			action_doubleClick(p.getSvgPatient_Name());
			action_doubleClick(p.getTxtPatientName_signIn());
			Thread.sleep(3000);
			delete();
			sendkeys(p.getTxtPatientName_signIn(), "ab12");
			tab();
			Thread.sleep(3000);
			click(p.getBtnSave_signIn());
			pageValidation("Error updating profile", "Error updating profile",
					"Verify Name Field with Numbers - showing error");
			driver.navigate().refresh();
	}

	@Test(priority = 8)
	private void UserProfile_MyProfile_Name_With2Letters() throws InterruptedException, AWTException {
//		p = new PatientUserProfileLocators();
//		action_doubleClick(p.getSvgPatient_Name());
//		action_doubleClick(p.getTxtPatientName_signIn());
//		Thread.sleep(5000);
//		sendkeys(p.getTxtPatientName_signIn(), "ab");
//		Thread.sleep(3000);
//		tab();
//		click(p.getBtnSave_signIn());
//		pageValidation("Error updating profile", "Name must be between 3 and 50 characters long",
//				"Verify Name Field with two letter - showing error");
//		Thread.sleep(10000);
//		driver.navigate().refresh();
	}

	@Test(priority = 9)
	private void UserProfile_MyProfile_Name_WithSpecialCharacter() throws InterruptedException, AWTException {
//		p = new PatientUserProfileLocators();
//		action_doubleClick(p.getSvgPatient_Name());
//		action_doubleClick(p.getTxtPatientName_signIn());
//		delete();
//		Thread.sleep(3000);
//		sendkeys(p.getTxtPatientName_signIn(), "ab*");
//		tab();
//		Thread.sleep(3000);
//		click(p.getBtnSave_signIn());
//		pageValidation("Error updating profile", "Error updating profile",
//				"Verify Name Field with Special Character - showing error");
//		Thread.sleep(10000);
////		driver.navigate().refresh();
	}

	@Test(priority = 10)
	private void UserProfile_MyProfile_Name_WithNumbers() throws InterruptedException, AWTException {
//		p = new PatientUserProfileLocators();
//		action_doubleClick(p.getSvgPatient_Name());
//		action_doubleClick(p.getTxtPatientName_signIn());
//		Thread.sleep(3000);
//		delete();
//		sendkeys(p.getTxtPatientName_signIn(), "ab12");
//		tab();
//		Thread.sleep(3000);
//		click(p.getBtnSave_signIn());
//		pageValidation("Error updating profile", "Error updating profile",
//				"Verify Name Field with Numbers - showing error");
////		driver.navigate().refresh();
	}

	@Test(priority = 11)
	private void UserProfile_MyProfile_Name_ValidName() throws InterruptedException, AWTException {
		p = new PatientUserProfileLocators();
		action_doubleClick(p.getSvgPatient_Name());
		action_doubleClick(p.getTxtPatientName_signIn());
		Thread.sleep(3000);
		delete();
		sendkeys(p.getTxtPatientName_signIn(), "test");
		tab();
		Thread.sleep(3000);
		p.getBtnSave_signIn().click();
		pageValidation("Profile updated", "test", "Verify Name Field with valid Name ");
		Thread.sleep(10000);
	}

	@Test(priority = 12)
	private void UserProfile_MyProfile_Location() throws InterruptedException, AWTException {
		p = new PatientUserProfileLocators();
		click(p.getMyProfile_signIN());
		action_doubleClick(p.getSvgPatient_Location());
		p.getTxtPatientLocation_signIn().click();
		delete();
		sendkeys(p.getTxtPatientLocation_signIn(), "ABCD@123");
		tab();
		Thread.sleep(3000);
		p.getBtnSave_signIn().click();
		pageValidation("Location should not contain numbers and special characters", "Error updating profile",
				"Verify Invalid Location");
		click(p.getChatClose_signIN());

	}

	@Test(priority = 13)
	private void UserProfile_MyProfile_Gender() throws InterruptedException, AWTException {
		p = new PatientUserProfileLocators();
		click(p.getMyProfile_signIN());
		p.getSelectGender_signIn().click();
		delete();
		sendkeys(p.getSelectGender_signIn(), "female");
		tab();
		Thread.sleep(3000);
		p.getBtnSave_signIn().click();
		pageValidation("female", "Profile updated", "Verify Gender");
	}

	@Test(priority = 14)
	private void UserProfile_MyProfile_BloodGroup() throws InterruptedException, AWTException {
		p = new PatientUserProfileLocators();
		click(p.getMyProfile_signIN());
		p.getSelectBloodGroup_signIn().click();
		delete();
		sendkeys(p.getSelectBloodGroup_signIn(), "O+");
		tab();
		Thread.sleep(3000);
		p.getBtnSave_signIn().click();
		pageValidation("O+", "Profile updated", "Verify BloodGroup");
	}

	@Test(priority = 15)
	private void UserProfile_MyProfile_InsuranceProvider() throws InterruptedException, AWTException {
//		p = new PatientUserProfileLocators();
//		click(p.getMyProfile_signIN());
//		Thread.sleep(2000);
//		action_doubleClick(p.getSvgPatient_InsuranceProvider());
//		p.getTxtPatientInsuranceProvider_signIn().click();
//		delete();
//		sendkeys(p.getTxtPatientInsuranceProvider_signIn(), "ABCDEF0123");
//		tab();
//		Thread.sleep(3000);
//		click(p.getChatClose_signIN());
//		click(p.getBtnSave_signIn());
//		pageValidation("InsuranceProvider should not contain numbers and special characters", "Error updating profile",
//				"Verify Invalid InsuranceProvider");
//		
	}

	@Test(priority = 16)
	private void UserProfile_MyProfile_PolicyNumber() throws InterruptedException, AWTException {
		p = new PatientUserProfileLocators();
		click(p.getMyProfile_signIN());
		action_doubleClick(p.getSvgPatient_PolicyNumber());
		p.getTxtPatientPolicyNumber_signIn().click();
		delete();
		sendkeys(p.getTxtPatientPolicyNumber_signIn(), "@B123");
		Thread.sleep(10000);
		click(p.getBtnSave_signIn());
		click(p.getChatClose_signIN());
		pageValidation("Profile updated", "Profile updated", "Verify Invalid PolicyNumber");
		Thread.sleep(10000);
	}

	@Test(priority = 17)
	private void UserProfile_MyProfile_DateOfBirth() throws InterruptedException, AWTException {
		p = new PatientUserProfileLocators();
		click(p.getSvgPatient_dob());
//		click(p.getTxtPatientDOB_signIn());
//		delete();
		sendkeys(p.getTxtPatientDOB_signIn(), "30/12/2030");
		tab();
		tab();
		click(p.getBtnSave_signIn());
		pageValidation("Future date not accepted","Error updating profile" , "Verify Future date of birth");

	}

//	@Test(priority = 18)
//	private void UserProfile_LogOut() throws InterruptedException, AWTException {
//		p = new PatientUserProfileLocators();
//		click(p.getBtnLogOut_signIN());
//		softAssert("medxbay.com", "Verify Logout_User");
//	}

}
