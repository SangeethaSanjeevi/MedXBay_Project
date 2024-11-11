package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class HomePageLocators extends BaseClass_ResuableMethods {
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}

//-------------------------------search-----------------------------
	@FindBy(xpath = "(//img[@alt='Brand Logo'])[1]")
	private WebElement btnLogo;

	@FindBy(xpath = "(//h1[contains(text(),'Find the')])[1]")
	private WebElement getTheText_Home;

	@FindBy(xpath = "//select")
	private WebElement selectLocation_Home;

	@FindBy(id = "what")
	private WebElement selectDisease_Home;

	@FindBy(xpath = "//button[text()='Find My Provider']")
	private WebElement btnFindProvider_Home;
//	-----------------------------speciality--------------------------------------

	@FindBy(xpath = "(//img[@alt='Dentistry'])[1]")
	private WebElement img_Density;

	@FindBy(xpath = "(//div[@class='findby-card'])[2]")
	private WebElement img_PrimaryCare;

	@FindBy(xpath = "(//img[@alt='Cardiology'])[1]")
	private WebElement img_Cardiology;

	@FindBy(xpath = "(//img[@alt='MRI Resonance'])[1]")
	private WebElement img_MRI;

	@FindBy(xpath = "(//img[@alt='Blood Test'])[1]")
	private WebElement img_BloodTest;

	@FindBy(xpath = "(//img[@alt='Psychologist'])[1]")
	private WebElement img_Psychologist;

	@FindBy(xpath = "(//img[@alt='Laboratory'])[1]")
	private WebElement img_Laboratory;

	@FindBy(xpath = "(//img[@alt='X-Ray'])[1]")
	private WebElement img_XRay;
//	-------------------------------------Conditions--------------------------------------

	@FindBy(xpath = "(//div[@class='findby-toggle-switch'])[1]")
	private WebElement toggle_Condition;

	@FindBy(xpath = "(//img[@alt='Heart Disease'])[1]")
	private WebElement img_HeartDisease;

	@FindBy(xpath = "(//img[@alt='Skin Disease'])[1]")
	private WebElement img_SkinDisease;

	@FindBy(xpath = "(//img[@alt='Blood Conditions'])[1]")
	private WebElement img_BloodCondition;

	@FindBy(xpath = "(//img[@alt='Cancer'])[1]")
	private WebElement img_Cancer;

	@FindBy(xpath = "(//img[@alt='Chronic Pain'])[1]")
	private WebElement img_ChronicPain;

	@FindBy(xpath = "(//img[@alt='Diabetes'])[1]")
	private WebElement img_Diabetes;

	@FindBy(xpath = "(//img[@alt='Eye Health'])[1]")
	private WebElement img_EyeHealth;

	@FindBy(xpath = "(//img[@alt='HIV/AIDS'])[1]")
	private WebElement img_HIV;

	@FindBy(xpath = "(//button[normalize-space()='View all'])[1]")
	private WebElement btn_ViewAll;

//----------------------------------------Who we serve-------------------------------------

	@FindBy(xpath = "(//button[@class='learn-more-btn'][normalize-space()='Learn more'])[1]")
	private WebElement btn_PatientsLearnMore;

	@FindBy(xpath = "(//button[@class='learn-more-btn'][normalize-space()='Learn more'])[2]")
	private WebElement btn_HealthCareLearnMore;

	@FindBy(xpath = "(//button[normalize-space()='Coming Q4'])[1]")
	private WebElement btn_MedicalLearnMore;

//	---------------------------cancer---------------------------------------------
	@FindBy(xpath = "(//button[text()='Try it now'])[1]")
	private WebElement btn_TryItNowCancer;

//	------------------MentalHealth---------------------------------------------------
	@FindBy(xpath = "(//button[text()='Try it now'])[2]")
	private WebElement btn_TryItNowMentalHealth;

//	----------------------ExploreInsights---------------------------------------
	@FindBy(xpath = "(//a[contains(text(),'Read more...')])[1]")
	private WebElement btn_ViralInfectionReadMore;

	@FindBy(xpath = "(//a[contains(text(),'Read more...')])[2]")
	private WebElement btn_ThyroidReadMore;

//	-----------------------icons-------------------------------------------------
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[5]")
	private WebElement iconFacebook;

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[6]")
	private WebElement iconLinkedIn;

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[7]")
	private WebElement iconInstagram;

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[8]")
	private WebElement iconYoutube;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtEmaiAddress;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement btnSend_Home;

//	----------------FooterExplore------------------------------------
	@FindBy(xpath = "(//li[normalize-space()='Home'])[1]")
	private WebElement link_ExploreHome;

	@FindBy(xpath = "(//li[normalize-space()='About Us'])[1]")
	private WebElement link_ExploreAboutUs;

	@FindBy(xpath = "(//li[normalize-space()='FAQs'])[1]")
	private WebElement link_ExploreFAQs;

	@FindBy(xpath = "(//li[normalize-space()='Community'])[1]")
	private WebElement link_Community;

//	---------------FooterLegal-------------------------
	@FindBy(xpath = "(//li[normalize-space()='Privacy Policy'])[1]")
	private WebElement link_LegalPrivacyPolicy;

	@FindBy(xpath = "(//li[normalize-space()='Terms of Service'])[1]")
	private WebElement link_LegalTermsOfService;

	@FindBy(xpath = "(//li[normalize-space()='Contact'])[1]")
	private WebElement link_LegalContact;
//	-----------------MedxAi---------------------------------
	@FindBy(xpath = "(//button[text()='Learn more'])[3]")
	private WebElement btn_MedxAILearnMore;

//----------------------Subscribe------------------------------

	@FindBy(xpath = "//footer[@class='custom-footer']")
	private WebElement scrolldown;

	@FindBy(id = "navbarNav")
	private WebElement scrollup;

//---------------------------------------------

	public WebElement getBtnLogo() {
		return btnLogo;
	}

	public WebElement getTxtEmaiAddress() {
		return txtEmaiAddress;
	}

	public WebElement getBtnSend_Home() {
		return btnSend_Home;
	}

	public WebElement getIconFacebook() {
		return iconFacebook;
	}

	public WebElement getIconLinkedIn() {
		return iconLinkedIn;
	}

	public WebElement getIconInstagram() {
		return iconInstagram;
	}

	public WebElement getIconYoutube() {
		return iconYoutube;
	}

	public WebElement getGetTheText_Home() {
		return getTheText_Home;
	}

	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getScrollup() {
		return scrollup;
	}

	public WebElement getSelectLocation_Home() {
		return selectLocation_Home;
	}

	public WebElement getSelectDisease_Home() {
		return selectDisease_Home;
	}

	public WebElement getBtnFindProvider_Home() {
		return btnFindProvider_Home;
	}

	public WebElement getImg_Density() {
		return img_Density;
	}

	public WebElement getImg_PrimaryCare() {
		return img_PrimaryCare;
	}

	public WebElement getImg_Cardiology() {
		return img_Cardiology;
	}

	public WebElement getImg_MRI() {
		return img_MRI;
	}

	public WebElement getImg_BloodTest() {
		return img_BloodTest;
	}

	public WebElement getImg_Psychologist() {
		return img_Psychologist;
	}

	public WebElement getImg_Laboratory() {
		return img_Laboratory;
	}

	public WebElement getImg_XRay() {
		return img_XRay;
	}

	public WebElement getToggle_Condition() {
		return toggle_Condition;
	}

	public WebElement getImg_HeartDisease() {
		return img_HeartDisease;
	}

	public WebElement getImg_SkinDisease() {
		return img_SkinDisease;
	}

	public WebElement getImg_BloodCondition() {
		return img_BloodCondition;
	}

	public WebElement getImg_Cancer() {
		return img_Cancer;
	}

	public WebElement getImg_ChronicPain() {
		return img_ChronicPain;
	}

	public WebElement getImg_Diabetes() {
		return img_Diabetes;
	}

	public WebElement getImg_EyeHealth() {
		return img_EyeHealth;
	}

	public WebElement getImg_HIV() {
		return img_HIV;
	}

	public WebElement getBtn_ViewAll() {
		return btn_ViewAll;
	}

	public WebElement getBtn_PatientsLearnMore() {
		return btn_PatientsLearnMore;
	}

	public WebElement getBtn_HealthCareLearnMore() {
		return btn_HealthCareLearnMore;
	}

	public WebElement getBtn_MedicalLearnMore() {
		return btn_MedicalLearnMore;
	}

	public WebElement getBtn_TryItNowCancer() {
		return btn_TryItNowCancer;
	}

	public WebElement getBtn_TryItNowMentalHealth() {
		return btn_TryItNowMentalHealth;
	}

	public WebElement getBtn_ViralInfectionReadMore() {
		return btn_ViralInfectionReadMore;
	}

	public WebElement getBtn_ThyroidReadMore() {
		return btn_ThyroidReadMore;
	}

	public WebElement getLink_ExploreHome() {
		return link_ExploreHome;
	}

	public WebElement getLink_ExploreAboutUs() {
		return link_ExploreAboutUs;
	}

	public WebElement getLink_ExploreFAQs() {
		return link_ExploreFAQs;
	}

	public WebElement getLink_Community() {
		return link_Community;
	}

	public WebElement getLink_LegalPrivacyPolicy() {
		return link_LegalPrivacyPolicy;
	}

	public WebElement getLink_LegalTermsOfService() {
		return link_LegalTermsOfService;
	}

	public WebElement getBtn_MedxAILearnMore() {
		return btn_MedxAILearnMore;
	}

	public WebElement getLink_LegalContact() {
		return link_LegalContact;
	}

}
