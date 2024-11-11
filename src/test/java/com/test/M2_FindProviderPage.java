package com.test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.locators.FindProviderPageLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M2_FindProviderPage extends BaseClass_ResuableMethods{
	public static FindProviderPageLocators f;
	
	@BeforeClass
	private void browserLaunch() {
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	private void search() throws InterruptedException, AWTException {
        f=new FindProviderPageLocators();
        click(f.getBtnFindProvider());
        sendkeys(f.getSearchWhat_FindProvider(), "Heart Specialist");
		sendkeys(f.getSearchWhere_FindProvider(), "Namakkal");
		click(f.getBtnFindProvider_FindProvider());
	}
	
	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("FindProvider page tested successfully");

	}
	

}
