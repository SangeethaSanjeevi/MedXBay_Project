package com.test;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.locators.ConditionLibraryLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M6_ConditionLibraryPage extends BaseClass_ResuableMethods {

	public static ConditionLibraryLocators c;

	@BeforeClass
	private void browserLaunch() {
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	private void ConditionLibrary_search() throws InterruptedException {
		c = new ConditionLibraryLocators();
		click(c.getBtnConditionLibrary());
		Thread.sleep(20000);

		softAssert("condition", "Verify ConditionLibrary page");
		Thread.sleep(2000);
		sendkeys(c.getSearchWhat_FindProvider(), "Heart Specialist");
		sendkeys(c.getSearchWhere_FindProvider(), "Namakkal");
		click(c.getBtnFindProvider_FindProvider());
		Thread.sleep(10000);
		softAssert("Filters", "verify ConditionLibrary's search");
		driver.navigate().back();
	}

	@Test(priority = 2)
	private void ConditionLibrary_PopularConditions() throws InterruptedException {
		c = new ConditionLibraryLocators();
		Thread.sleep(5000);
		click(c.getImgAsthma());
		softAssert("Asthma", "Verify Asthma_PopularConditions");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getImgDiabetes());
		softAssert("Diabetes", "Verify Diabetes_PopularConditions");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getImgViralInfection());
		softAssert("Infections", "Verify ViralInfection_PopularConditions");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getImgHypothyroidism());
		softAssert("Hypothyroidism", "Verify Hypothyroidism_PopularConditions");
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@Test(priority = 3)
	private void PopularImg_WomensHealth() throws InterruptedException {
		Thread.sleep(5000);
		click(c.getImgWomensHealth());
		softAssert("Health", "Verify WomensHealth_PopularConditions");
		Thread.sleep(5000);
		driver.navigate().back();

	}

	@Test(priority = 4)
	private void PopularImg_Anemia() throws InterruptedException {

		Thread.sleep(5000);
		click(c.getImgAnemia());
		softAssert("Anemia", "Verify Anemia_PopularConditions");
		Thread.sleep(5000);
		driver.navigate().back();

	}

	@Test(priority = 5)
	private void ConditionLibrary_SeeAll() throws InterruptedException {

		c = new ConditionLibraryLocators();
		Thread.sleep(5000);
		click(c.getLinkAsthma());
		softAssert("Asthma", "Verify Asthma_SeeAll");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getLinkDiabetes());
		softAssert("Diabetes", "Verify Diabetes_SeeAll");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getLinkViralInfection());
		softAssert("Infections", "Verify ViralInfection_SeeAll");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getLinkWomensHealth());
		softAssert("Health", "Verify WomensHealth_SeeAll");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getLinkHypothyroidism());
		softAssert("Hypothyroidism", "Verify Hypothyroidism_SeeAll");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getLinkMenopause());
		softAssert("Menopause", "Verify Menopause_SeeAll");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		click(c.getLinkThyroidDisorder());
		softAssert("Disorders", "Verify ThyroidDisorder_SeeAll");
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("ConditionLibrary page tested successfully");

	}

}
