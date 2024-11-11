package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.BaseClass_ResuableMethods;

public class ConditionLibraryLocators extends BaseClass_ResuableMethods {
	public ConditionLibraryLocators() {
		PageFactory.initElements(driver, this);
	}
//  -----------------------Condition Library-----------------------------------------------------
	@FindBy(xpath = "(//a[text()='Condition Libraries'])[2]")
	private WebElement btnConditionLibrary;
//  ----------------------Search---------------------------------------------------------------
	@FindBy(id = "what")
	private WebElement searchWhat_FindProvider;

	@FindBy(id = "where")
	private WebElement searchWhere_FindProvider;

	@FindBy(xpath = "//button[text()='Find My Provider']")
	private WebElement btnFindProvider_FindProvider;
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement txtsearch;

//	------------------------------------------ConditionLibrary_PopularConditions--------------------------------------------
	
	@FindBy(xpath = "(//img[@alt='asthma'])[1]")
	private WebElement imgAsthma;

	@FindBy(xpath = "(//img[@alt='Diabetes'])[1]")
	private WebElement imgDiabetes;

	@FindBy(xpath = "(//img[@alt='Viral Infections'])[1]")
	private WebElement imgViralInfection;
	
	@FindBy(xpath = "(//img[@alt=\"Women's Health\"])[1]")
	private WebElement imgWomensHealth;
	
	@FindBy(xpath = "(//img[@alt='Hypothyroidism'])[1]")
	private WebElement imgHypothyroidism;
	
	@FindBy(xpath = "(//img[@alt='Anemia'])[1]")
	private WebElement imgAnemia;
	
	
//	------------------------------------------ConditionLibrary_SeeAll---------------------------------------------------
	
	@FindBy(xpath = "(//li[normalize-space()='Asthma'])[1]")
	private WebElement linkAsthma;

	@FindBy(xpath = "(//li[normalize-space()='Diabetes'])[1]")
	private WebElement linkDiabetes;

	@FindBy(xpath = "(//li[normalize-space()='Hypothyroidism'])[1]")
	private WebElement linkHypothyroidism;
	
	@FindBy(xpath = "(//li[normalize-space()='Menopause'])[1]")
	private WebElement linkMenopause;
	
	@FindBy(xpath = "(//li[normalize-space()='Thyroid Disorders'])[1]")
	private WebElement linkThyroidDisorder;
	
	@FindBy(xpath = "(//li[normalize-space()='Viral Infections'])[1]")
	private WebElement linkViralInfection;
	
	@FindBy(xpath = "(//li[contains(text(),'Women’s Health')])[1]")
	private WebElement linkWomensHealth;
	
	
//	----------------------------------------------------------------------------------------------------------------
	public WebElement getBtnConditionLibrary() {
		return btnConditionLibrary;
	}

	public WebElement getTxtsearch() {
		return txtsearch;
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

	public WebElement getImgAsthma() {
		return imgAsthma;
	}

	public WebElement getImgDiabetes() {
		return imgDiabetes;
	}

	public WebElement getImgViralInfection() {
		return imgViralInfection;
	}

	public WebElement getImgWomensHealth() {
		return imgWomensHealth;
	}

	public WebElement getImgHypothyroidism() {
		return imgHypothyroidism;
	}

	public WebElement getImgAnemia() {
		return imgAnemia;
	}

	public WebElement getLinkAsthma() {
		return linkAsthma;
	}

	public WebElement getLinkDiabetes() {
		return linkDiabetes;
	}

	public WebElement getLinkHypothyroidism() {
		return linkHypothyroidism;
	}

	public WebElement getLinkMenopause() {
		return linkMenopause;
	}

	public WebElement getLinkThyroidDisorder() {
		return linkThyroidDisorder;
	}

	public WebElement getLinkViralInfection() {
		return linkViralInfection;
	}

	public WebElement getLinkWomensHealth() {
		return linkWomensHealth;
	}

	
}
