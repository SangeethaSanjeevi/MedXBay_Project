package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.locators.WhoWeServeLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M3_WhoWeServePage extends BaseClass_ResuableMethods {
	public static WhoWeServeLocators w;

	@BeforeClass
	private void browserLaunch(){
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	private void search_DrPhysician() throws InterruptedException {
		w = new WhoWeServeLocators();
		click(w.getBtnWhoWeServe());
		click(w.getBtnDrPhysician());
		softAssert("physician", "verify Dr/Physician page");
		sendkeys(w.getSearchWhat_FindProvider(), "Heart Specialist");
		sendkeys(w.getSearchWhere_FindProvider(), "Namakkal");
		click(w.getBtnFindProvider_FindProvider());
		Thread.sleep(5000);
		softAssert("Filters", "verify Dr/Physician's search");
		driver.navigate().back();
	}

	@Test(priority = 2)
	private void register_DrPhysician() throws InterruptedException {
		w = new WhoWeServeLocators();
		Thread.sleep(3000);
		click(w.getBtnRegister());
		Thread.sleep(5000);
		click(w.getBtnClose_Register());
		System.out.println("verified Dr/Physician's register page");
		driver.navigate().refresh();

	}

	@Test(priority = 3)
	private void search_Patient() throws InterruptedException {
		Thread.sleep(5000);
		w = new WhoWeServeLocators();
		click(w.getBtnWhoWeServe());
		click(w.getBtnPatients());
		softAssert("patients", "Verify patient page");
		sendkeys(w.getSearchWhat_FindProvider(), "Heart Specialist");
		sendkeys(w.getSearchWhere_FindProvider(), "Namakkal");
		click(w.getBtnFindProvider_FindProvider());
		Thread.sleep(3000);
		softAssert("Filters", "verify Patient's search");
		driver.navigate().back();

	}

	@Test(priority = 4)
	private void register_Patient() throws InterruptedException {
		w = new WhoWeServeLocators();
		Thread.sleep(3000);
		click(w.getBtnSignUp());
		Thread.sleep(10000);
		click(w.getBtnClose_Register());
		System.out.println("verified Patient's signup button");
		driver.navigate().refresh();

	}

	@Test(priority = 5)
	private void enterprise() throws InterruptedException {
		Thread.sleep(5000);
		w = new WhoWeServeLocators();
		click(w.getBtnWhoWeServe());
		click(w.getBtnEnterprise());
		softAssert("enterprise", "Verify Enterprise page");
		Thread.sleep(3000);

	}

	@Test(priority = 6)
	private void enterprise_Demo() throws InterruptedException {
		w = new WhoWeServeLocators();
		Thread.sleep(3000);
		click(w.getBtnScheduleDemo());
		Thread.sleep(3000);
		softAssert("contact", "Verify ScheduleDemo button");
	}

	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("Who We Serve page tested successfully");

	}

}
