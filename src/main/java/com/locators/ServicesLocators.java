package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class ServicesLocators extends BaseClass_ResuableMethods{
	public ServicesLocators() {
		PageFactory.initElements(driver, this);
	}
//	--------------------------------------search--------------------------------------------------------------------
	@FindBy(xpath = "(//a[text()='Services'])[2]")
	private WebElement btnServices;
	
//	-------------------------------------Hospitals/clinics----------------------------------------------------------
	
//	----------------------------------------Labs---------------------------------------------------------------------
	
//	----------------------------------------Surgery-----------------------------------------------------------------
	
//	----------------------------------------------Aesthetic--------------------------------------------------------
	
//	---------------------------------------------Med Store-------------------------------------------------------
	
	
	
//	--------------------------------------------------------------------------------------------------------
	
	public WebElement getBtnServices() {
		return btnServices;
	}
	
	

}
