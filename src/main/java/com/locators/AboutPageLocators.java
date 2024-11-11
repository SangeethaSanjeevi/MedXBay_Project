package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class AboutPageLocators extends BaseClass_ResuableMethods {
	public AboutPageLocators() {
		PageFactory.initElements(driver, this);
	}

//	------------------------About---------------------------------------------
	@FindBy(xpath = "(//a[text()='About'])[2]")
	private WebElement btnAbout;

//	-----------------------About US-------------------------------------------
	@FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='About us'])[2]")
	private WebElement btnAboutUS;

	@FindBy(xpath = "(//button[@class='learn-more-btn'][normalize-space()='Learn more'])[1]")
	private WebElement btn_PatientsLearnMore;

	@FindBy(xpath = "(//button[@class='learn-more-btn'][normalize-space()='Learn more'])[2]")
	private WebElement btn_HealthCareLearnMore;

	@FindBy(xpath = "(//button[normalize-space()='Coming Q4'])[1]")
	private WebElement btn_MedicalLearnMore;

	@FindBy(xpath = "(//*[name()='svg'][contains(@role,'img')])[7]")
	private WebElement linkedIn_YancheAcc;

	@FindBy(xpath = "(//*[name()='svg'][contains(@role,'img')])[8]")
	private WebElement linkedIn_WilliamStenhouseAcc;

//	-----------------------------NewsRoom-------------------------------------------

	@FindBy(xpath = "(//a[contains(@class,'dropdown-item')][normalize-space()='NewsRoom'])[2]")
	private WebElement btnNewsRoom;

	@FindBy(xpath = "(//button[contains(text(),'Read more')])[1]")
	private WebElement readmorebtn_MedxBayVision;

	@FindBy(xpath = "(//*[name()='svg'][@class='new-rooms-share-icons'])[1]")
	private WebElement shareIcon_MedxbayVision;

	@FindBy(xpath = "(//button[contains(text(),'Read more')])[2]")
	private WebElement readmorebtn_BreastCancer;

	@FindBy(xpath = "(//*[name()='svg'][@class='new-rooms-share-icons'])[2]")
	private WebElement shareIcon_BreastCancer;

	@FindBy(xpath = "(//button[contains(text(),'Read more')])[3]")
	private WebElement readmorebtn_TheFounders;

	@FindBy(xpath = "(//*[name()='svg'][@class='new-rooms-share-icons'])[3]")
	private WebElement shareIcon_TheFounders;

	@FindBy(xpath = "(//button[contains(text(),'Read more')])[4]")
	private WebElement readmorebtn_MedxBayLaunches;

	@FindBy(xpath = "(//*[name()='svg'][@class='new-rooms-share-icons'])[4]")
	private WebElement shareIcon_MedxBayLaunches;

	@FindBy(xpath = "(//button[contains(text(),'Read more')])[5]")
	private WebElement readmorebtn_ModernHealthcare;

	@FindBy(xpath = "(//*[name()='svg'][contains(@class,'new-rooms-share-icons')])[5]")
	private WebElement shareIcon_ModernHealthcare;

	@FindBy(xpath = "(//button[contains(text(),'Read more')])[6]")
	private WebElement readmorebtn_Vision2031;

	@FindBy(xpath = "(//*[name()='svg'][contains(@class,'new-rooms-share-icons')])[6]")
	private WebElement shareIcon_Vision2031;

//	------------------------------------------------------------------------------

	public WebElement getBtnAbout() {
		return btnAbout;
	}

	public WebElement getBtnAboutUS() {
		return btnAboutUS;
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

	public WebElement getLinkedIn_YancheAcc() {
		return linkedIn_YancheAcc;
	}

	public WebElement getLinkedIn_WilliamStenhouseAcc() {
		return linkedIn_WilliamStenhouseAcc;
	}

	public WebElement getBtnNewsRoom() {
		return btnNewsRoom;
	}

	public WebElement getReadmorebtn_MedxBayVision() {
		return readmorebtn_MedxBayVision;
	}

	public WebElement getShareIcon_MedxbayVision() {
		return shareIcon_MedxbayVision;
	}

	public WebElement getReadmorebtn_BreastCancer() {
		return readmorebtn_BreastCancer;
	}

	public WebElement getShareIcon_BreastCancer() {
		return shareIcon_BreastCancer;
	}

	public WebElement getReadmorebtn_TheFounders() {
		return readmorebtn_TheFounders;
	}

	public WebElement getShareIcon_TheFounders() {
		return shareIcon_TheFounders;
	}

	public WebElement getReadmorebtn_MedxBayLaunches() {
		return readmorebtn_MedxBayLaunches;
	}

	public WebElement getShareIcon_MedxBayLaunches() {
		return shareIcon_MedxBayLaunches;
	}

	public WebElement getReadmorebtn_ModernHealthcare() {
		return readmorebtn_ModernHealthcare;
	}

	public WebElement getShareIcon_ModernHealthcare() {
		return shareIcon_ModernHealthcare;
	}

	public WebElement getReadmorebtn_Vision2031() {
		return readmorebtn_Vision2031;
	}

	public WebElement getShareIcon_Vision2031() {
		return shareIcon_Vision2031;
	}

	
}
