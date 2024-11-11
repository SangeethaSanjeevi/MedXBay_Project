package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.locators.SignInPageLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M11_ProviderPage extends BaseClass_ResuableMethods{
//	public static ProviderPageLocators p;
//
//	@BeforeClass
//	private void browserLaunch() {
//		chromeBrowser();
//		driver.navigate().to("https://medxbay.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//
//	@AfterClass
//	private void closewindow() {
//		quit();
//		System.out.println("SignIN page tested successfully");
//
//	}
//	
//	@Test(priority = 1)
//	private void InvalidInput() throws InterruptedException, IOException {
//		s = new SignInPageLocators();
//		click(s.getBtnSignIN());
//		sendkeys(s.getTxtEmail_signIN(), "vulture");
//		sendkeys(s.getTxtPass_signIN(), "1233");
//		click(s.getBtnSignIn_signIN());
//		softAssert("medxbay.com", "Verify signin with invalid credential");
//		Thread.sleep(3000);
////		screenshot("invalid_signin");
//		System.out.println("signin with invalid credential is tested successfully in signin page");
//		driver.navigate().refresh();
//		
//	}
	
}
