package com.test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.locators.HomePageLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M1_HomePage extends BaseClass_ResuableMethods {
	public static HomePageLocators home;

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
		System.out.println("Home page tested successfully");

	}

	@Test(priority = 1)
	private void Search() throws InterruptedException, AWTException {
		home = new HomePageLocators();
		click(home.getBtnLogo());
		String text = home.getGetTheText_Home().getText();
		System.out.println(text);

		click(home.getSelectLocation_Home());
		sendkeys(home.getSelectLocation_Home(), "India");
		enter();
		Thread.sleep(2000);
		sendkeys(home.getSelectDisease_Home(), "Heart Specialist");
		click(home.getBtnFindProvider_Home());
		Thread.sleep(5000);
		softAssert("Filters", "Verify search");
		driver.navigate().back();
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	private void LookingFor() {

	}

	@Test(priority = 3)
	private void Speciality() throws InterruptedException {
		Thread.sleep(5000);
		home = new HomePageLocators();
		click(home.getImg_Density());
		softAssert("Filters", "verify densitry");
		driver.navigate().back();

		Thread.sleep(5000);
		click(home.getImg_PrimaryCare());
		softAssert("Filters", "verify Primary care");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getImg_Cardiology());
		softAssert("Filters", "verify Cardiology");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getImg_MRI());
		softAssert("Filters", "verify MRI");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getImg_BloodTest());
		softAssert("Filters", "verify Blood Test");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getImg_Psychologist());
		softAssert("Filters", "verify Psychologist");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getImg_Laboratory());
		softAssert("Filters", "verify Laboratory");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getImg_XRay());
		softAssert("Filters", "verify XRay");
		driver.navigate().back();
		Thread.sleep(5000);

	}

	@Test(priority = 4)
	private void Conditions() throws InterruptedException {
		Thread.sleep(10000);
		home = new HomePageLocators();
		click(home.getToggle_Condition());
		Thread.sleep(5000);

		click(home.getImg_HeartDisease());
		softAssert("Filters", "verify HeartDisease");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getToggle_Condition());
		click(home.getImg_SkinDisease());
		softAssert("Filters", "verify SkinDisease");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getToggle_Condition());
		click(home.getImg_BloodCondition());
		softAssert("Filters", "verify BloodConditions");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getToggle_Condition());
		click(home.getImg_Cancer());
		softAssert("Filters", "verify Cancer");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getToggle_Condition());
		click(home.getImg_ChronicPain());
		softAssert("Filters", "verify ChronicPain");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getToggle_Condition());
		click(home.getImg_Diabetes());
		softAssert("Filters", "verify Diabetes");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getToggle_Condition());
		click(home.getImg_EyeHealth());
		softAssert("Filters", "verify EyeHealth");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getToggle_Condition());
		click(home.getImg_HIV());
		softAssert("Filters", "verify HIV/AIDS");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getBtn_ViewAll());
		softAssert("Filters", "verify ViewAll button");
		driver.navigate().back();
		Thread.sleep(5000);
	}

	@Test(priority = 5)
	private void WhoWeServe() throws InterruptedException {
		home = new HomePageLocators();
		click(home.getBtn_PatientsLearnMore());
		softAssert("patients", "verify Patients learnmore");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getBtn_HealthCareLearnMore());
		softAssert("physician", "verify HealthCare learnmore");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getBtn_MedicalLearnMore());
		softAssert("medical", "verify Medical Suppliers learnmore");
//		Thread.sleep(5000);
//		driver.navigate().back();
		Thread.sleep(5000);

	}

	@Test(priority = 6)
	private void MedxAI() throws InterruptedException {
		home = new HomePageLocators();
		Thread.sleep(10000);
		nextWindow(home.getBtn_MedxAILearnMore(), "medxai", "verify MedxAI");
		Thread.sleep(5000);
	}

//	@Test(priority = 7)
//	private void Cancer() throws InterruptedException {
//		home = new HomePageLocators();
//		Thread.sleep(5000);
//		nextWindow(home.getBtn_TryItNowCancer(), "cancer", "Verify Breast Cancer");
//		Thread.sleep(5000);
//
//	}
//
//	@Test(priority = 8)
//	private void MentalHealth() throws InterruptedException {
//
//		home = new HomePageLocators();
//		nextWindow(home.getBtn_TryItNowMentalHealth(), "brainzdemoevi", "Verify MentalHealth");
//		Thread.sleep(5000);
//	}

	@Test(priority = 9)
	private void ExploreInsights() throws InterruptedException {
		home = new HomePageLocators();
		Thread.sleep(5000);
		click(home.getBtn_ViralInfectionReadMore());
		softAssert("blogPost", "verify viralInfection readmore");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getBtn_ThyroidReadMore());
		softAssert("blogPost", "verify Thyroid readmore");
		driver.navigate().back();
		Thread.sleep(5000);
	}

	@Test(priority = 10)
	private void FooterIcon() throws InterruptedException {
		home = new HomePageLocators();
		Thread.sleep(10000);
		nextWindow(home.getIconFacebook(), "facebook", "verify facebook icon");
		Thread.sleep(5000);
		nextWindow(home.getIconLinkedIn(), "linkedin", "verify linkedin icon");
		Thread.sleep(5000);

		nextWindow(home.getIconInstagram(), "instagram", "verify Instagram icon");
		Thread.sleep(5000);

		nextWindow(home.getIconYoutube(), "youtube", "verify youtube icon");
		Thread.sleep(5000);

	}

	@Test(priority = 11)
	private void FooterExplore() throws InterruptedException {

		home = new HomePageLocators();
		Thread.sleep(5000);
		click(home.getLink_ExploreHome());
		softAssert("medxbay", "verify Home_Footer");
		Thread.sleep(5000);

		click(home.getLink_ExploreAboutUs());
		softAssert("about", "verify About_footer");
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getLink_ExploreFAQs());
		softAssert("faq", "verify FAQ_Footer");
		driver.navigate().back();
		Thread.sleep(5000);

		nextWindow(home.getLink_Community(), "community", "Verify Community_Footer");
		Thread.sleep(5000);
	}

	@Test(priority = 12)
	private void Footerlegal() throws InterruptedException {
		home = new HomePageLocators();
		click(home.getLink_LegalPrivacyPolicy());
		softAssert("privacy", "verify Privacy_Footer");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getLink_LegalTermsOfService());
		softAssert("terms", "verify TermsOfServices_Footer");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		click(home.getLink_LegalContact());
		softAssert("contact", "verify ContactUs_Footer");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
	}

	@Test(priority = 13)
	private void FooterSubscribe() throws InterruptedException {
		home = new HomePageLocators();
		Thread.sleep(5000);
		sendkeys(home.getTxtEmaiAddress(), "vlt@vlt.in");
		click(home.getBtnSend_Home());
		Thread.sleep(5000);
	}

}
