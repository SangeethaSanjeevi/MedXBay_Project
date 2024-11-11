package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.locators.AboutPageLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M7_AboutPage extends BaseClass_ResuableMethods {

	public static AboutPageLocators a;

	@BeforeClass
	private void browserLaunch()  {
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	private void aboutUS() throws InterruptedException {
		a = new AboutPageLocators();
		click(a.getBtnAbout());
		click(a.getBtnAboutUS());
		softAssert("about", "Verify About us page");

		click(a.getBtn_PatientsLearnMore());
		softAssert("patients", "verify Patients learnmore");
		driver.navigate().back();
		Thread.sleep(5000);

		click(a.getBtn_HealthCareLearnMore());
		softAssert("physician", "verify HealthCare learnmore");
		driver.navigate().back();
		Thread.sleep(5000);

		click(a.getBtn_MedicalLearnMore());
		softAssert("medical", "verify Medical Suppliers learnmore");
		//			driver.navigate().back();
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	private void aboutUS_LinkedIn() throws InterruptedException {
		a = new AboutPageLocators();
		Thread.sleep(5000);

		nextWindow(a.getLinkedIn_YancheAcc(), "yunchewilson", "Verify Yunche LinkedIn Account");

		nextWindow(a.getLinkedIn_WilliamStenhouseAcc(), "william", "Verify william LinkedIn Account");
		Thread.sleep(5000);

	}

	@Test(priority = 3)
	private void NewsRoom_card1() throws InterruptedException {
		a = new AboutPageLocators();
		click(a.getBtnAbout());
		click(a.getBtnNewsRoom());
		softAssert("Spotlights", "Verify NewsRoom Page");
		nextWindow(a.getReadmorebtn_MedxBayVision(), "youtube", "Verify MedxBay Vision Card's readmore button");
		Thread.sleep(5000);
		nextWindow(a.getShareIcon_MedxbayVision(), "share", "Verify MedxBay Vision card's Shareicon");
		Thread.sleep(5000);
	}

	@Test(priority = 4)
	private void NewsRoom_card2() throws InterruptedException {
		a = new AboutPageLocators();
		click(a.getBtnAbout());
		click(a.getBtnNewsRoom());
		Thread.sleep(5000);
		nextWindow(a.getReadmorebtn_BreastCancer(), "cancer", "verify Breast Cancer card's readmore button");
		Thread.sleep(5000);
		nextWindow(a.getShareIcon_BreastCancer(), "share", "Verify Breast Cancer card's Shareicon");
		Thread.sleep(5000);
	}
	@Test(priority = 5)
	private void NewsRoom_card3() throws InterruptedException {
		a = new AboutPageLocators();
		click(a.getBtnAbout());
		click(a.getBtnNewsRoom());
		nextWindow(a.getReadmorebtn_TheFounders(), "youtube", "verify The Founder card's readmore button");
		Thread.sleep(5000);
		nextWindow(a.getShareIcon_TheFounders(), "share", "Verify The Founder card's Shareicon");
		Thread.sleep(5000);
	}

	@Test(priority = 6)
	private void NewsRoom_card4() throws InterruptedException {
		a = new AboutPageLocators();
		click(a.getBtnAbout());
		click(a.getBtnNewsRoom());
		nextWindow(a.getReadmorebtn_MedxBayLaunches(), "uaehealthnews",
				"verify MedxBay Launches card's readmore button");
		Thread.sleep(5000);
		nextWindow(a.getShareIcon_MedxBayLaunches(), "share", "Verify MedxBay Launches card's Shareicon");
		Thread.sleep(5000);
	}
	@Test(priority = 7)
	private void NewsRoom_card5() throws InterruptedException {
		a = new AboutPageLocators();
		click(a.getBtnAbout());
		click(a.getBtnNewsRoom());
		nextWindow(a.getReadmorebtn_ModernHealthcare(), "youtube", "verify HealthCare card's readmore button");
		Thread.sleep(5000);
		nextWindow(a.getShareIcon_ModernHealthcare(), "share", "Verify HealthCare card's Shareicon");
		Thread.sleep(5000);
	}
	@Test(priority = 8)
	private void NewsRoom_card6() throws InterruptedException {
		a = new AboutPageLocators();
		click(a.getBtnAbout());
		click(a.getBtnNewsRoom());
		nextWindow(a.getReadmorebtn_Vision2031(), "healthmagazine", "verify Vision 2031 card's readmore button");
		Thread.sleep(5000);
		nextWindow(a.getShareIcon_Vision2031(), "share", "Verify Vision 2031 card's Shareicon");

	}

	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("About page tested successfully");

	}

}
