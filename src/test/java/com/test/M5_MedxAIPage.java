package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.locators.MedxAILocators;
import com.reusable.BaseClass_ResuableMethods;

public class M5_MedxAIPage extends BaseClass_ResuableMethods{
	public static MedxAILocators m;
	
	@BeforeClass
	private void browserLaunch()  {
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	private void MedxAi() throws InterruptedException {
        m=new MedxAILocators();
        Thread.sleep(5000);
        nextWindow(m.getBtnMedxAI(), "medxai", "verify medxai page");
        Thread.sleep(10000);

	}
	
	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("MedxAI page tested successfully");

	}

}
