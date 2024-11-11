package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class FindProviderPageLocators extends BaseClass_ResuableMethods{
	public FindProviderPageLocators() {
		PageFactory.initElements(driver, this);
	}
//	--------------------------------------search--------------------------------------------------------------------
	@FindBy(xpath = "(//a[@class='find-doctor nav-link nav-link-style'][normalize-space()='Find Provider'])[2]")
	private WebElement btnFindProvider;
	
	@FindBy(id = "what")
	private WebElement searchWhat_FindProvider;

	@FindBy(id = "where")
	private WebElement searchWhere_FindProvider;

	@FindBy(xpath = "//button[text()='Find My Provider']")
	private WebElement btnFindProvider_FindProvider;

//  --------------------------------Filter field-----------------------------------------------------------------------
	@FindBy(id = "country")
	private WebElement selectCountry_FindProvider;

	@FindBy(id = "state")
	private WebElement selectProvince_FindProvider;

	@FindBy(id = "city")
	private WebElement selectCity_FindProvider;

	@FindBy(id = "speciality")
	private WebElement selectSpeciality_FindProvider;

	@FindBy(id = "gender")
	private WebElement selectGender_FindProvider;

	@FindBy(id = "hospital")
	private WebElement selectHospital_FindProvider;

	@FindBy(id = "availability")
	private WebElement selectAvailability_FindProvider;

	@FindBy(id = "dateAvailability")
	private WebElement selectDateAvailability_FindProvider;

	@FindBy(xpath = "(//button[text()=' Reset Filter'])[2]")
	private WebElement btnResetFilter_FindProvider;

	@FindBy(id = "sortOptions")
	private WebElement selectSortBy_FindProvider;

	@FindBy(xpath = "(//a[@href='/doctor/66a86e113aede3117aea33ec'])[2]")
	private WebElement clickProfile_FindProvider;

	@FindBy(name = "hospital")
	private WebElement selectHospitals_FindProvider;

	@FindBy(id = "inPersonCheck")
	private WebElement checkBoxInPerson_FindProvider;

	@FindBy(xpath = "(//label[text()='Video consultation'])[1]")
	private WebElement checkBoxVideoConsultant_FindProvider;

	@FindBy(xpath = "(//button[text()='Book Appointment'])[1]")
	private WebElement btnBookAppoinment_FindProvider;

	public WebElement getSelectCountry_FindProvider() {
		return selectCountry_FindProvider;
	}

	public WebElement getSelectProvince_FindProvider() {
		return selectProvince_FindProvider;
	}

	public WebElement getSelectCity_FindProvider() {
		return selectCity_FindProvider;
	}

	public WebElement getSelectSpeciality_FindProvider() {
		return selectSpeciality_FindProvider;
	}

	public WebElement getSelectGender_FindProvider() {
		return selectGender_FindProvider;
	}

	public WebElement getSelectHospital_FindProvider() {
		return selectHospital_FindProvider;
	}

	public WebElement getSelectAvailability_FindProvider() {
		return selectAvailability_FindProvider;
	}

	public WebElement getSelectDateAvailability_FindProvider() {
		return selectDateAvailability_FindProvider;
	}

	public WebElement getBtnResetFilter_FindProvider() {
		return btnResetFilter_FindProvider;
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

	public WebElement getSelectSortBy_FindProvider() {
		return selectSortBy_FindProvider;
	}

	public WebElement getClickProfile_FindProvider() {
		return clickProfile_FindProvider;
	}

	public WebElement getSelectHospitals_FindProvider() {
		return selectHospitals_FindProvider;
	}

	public WebElement getCheckBoxInPerson_FindProvider() {
		return checkBoxInPerson_FindProvider;
	}

	public WebElement getCheckBoxVideoConsultant_FindProvider() {
		return checkBoxVideoConsultant_FindProvider;
	}

	public WebElement getBtnBookAppoinment_FindProvider() {
		return btnBookAppoinment_FindProvider;
	}

	public WebElement getBtnFindProvider() {
		return btnFindProvider;
	}
	
	


}
