package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.locators.ServicesLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M4_ServicesPage extends BaseClass_ResuableMethods {
      public static ServicesLocators s;
	@BeforeClass
	private void browserLaunch()  {
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	private void Services() throws InterruptedException {
        s=new ServicesLocators();
        click(s.getBtnServices());
        
      
	}
	
	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("Services page tested successfully");

	}
}
