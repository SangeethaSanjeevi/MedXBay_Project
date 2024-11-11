package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.locators.RegisterPageLocators;
import com.reusable.BaseClass_ResuableMethods;

public class M10_RegisterPage extends BaseClass_ResuableMethods {
	public static RegisterPageLocators r;

	@BeforeClass
	private void browserLaunch() {
		chromeBrowser();
		driver.navigate().to("https://medxbay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	private void closewindow() {
		quit();
		System.out.println("Register page tested successfully");

	}

	@Test(dataProvider = "name" , priority = 1)
	private void NameValidation(String name, String email, String mobilenum, String password)
			throws InterruptedException {
		r = new RegisterPageLocators();
		Thread.sleep(3000);
		click(r.getBtnregister());
		sendkeys(r.getTxtName_register(), name);
		sendkeys(r.getTxtEmail_register(), email);
		sendkeys(r.getTxtMobile_register(), mobilenum);
		sendkeys(r.getTxtPassword_register(), password);
		click(r.getBtnSignUp_register());
		pageValidation("Name is required", "Name should only contain alphabets", "Verify the InvalidName in register page");
		driver.navigate().refresh();

	}
	
	@Test(dataProvider = "email" , priority = 2)
	private void EmailValidation(String name, String email, String mobilenum, String password)
			throws InterruptedException {
		r = new RegisterPageLocators();
		Thread.sleep(3000);
		click(r.getBtnregister());
		sendkeys(r.getTxtName_register(), name);
		sendkeys(r.getTxtEmail_register(), email);
		sendkeys(r.getTxtMobile_register(), mobilenum);
		sendkeys(r.getTxtPassword_register(), password);
		click(r.getBtnSignUp_register());
		pageValidation("Email is required", "Please enter a valid email address", "Verify the InvalidEmail in register page");
		driver.navigate().refresh();

	}
	
	@Test(dataProvider = "mobilenum" , priority = 3)
	private void mobileNumberValidation(String name, String email, String mobilenum, String password)
			throws InterruptedException {
		r = new RegisterPageLocators();
		Thread.sleep(3000);
		click(r.getBtnregister());
		sendkeys(r.getTxtName_register(), name);
		sendkeys(r.getTxtEmail_register(), email);
		sendkeys(r.getTxtMobile_register(), mobilenum);
		sendkeys(r.getTxtPassword_register(), password);
		click(r.getBtnSignUp_register());
		pageValidation("Mobile Number is required", "Mobile number is req", "Verify the InvalidMobileNumber in register page");
		driver.navigate().refresh();

	}
	
	@Test(dataProvider = "password" , priority = 4)
	private void PasswordValidation(String name, String email, String mobilenum, String password)
			throws InterruptedException {
		r = new RegisterPageLocators();
		Thread.sleep(3000);
		click(r.getBtnregister());
		sendkeys(r.getTxtName_register(), name);
		sendkeys(r.getTxtEmail_register(), email);
		sendkeys(r.getTxtMobile_register(), mobilenum);
		sendkeys(r.getTxtPassword_register(), password);
		click(r.getBtnSignUp_register());
		pageValidation("Password is required", "Password should be at least 6 characters", "Verify the Invalid password in register page");
		driver.navigate().refresh();

	}
	
	@Test(dataProvider = "valid" , priority = 5)
	private void ValidInformation(String name, String email, String mobilenum, String password)
			throws InterruptedException {
		r = new RegisterPageLocators();
		Thread.sleep(3000);
		click(r.getBtnregister());
		sendkeys(r.getTxtName_register(), name);
		sendkeys(r.getTxtEmail_register(), email);
		sendkeys(r.getTxtMobile_register(), mobilenum);
		sendkeys(r.getTxtPassword_register(), password);
		click(r.getBtnSignUp_register());
		Thread.sleep(2000);
		pageValidation("Registration successful", "User already exists", "Verify the Valid credentials in register page");
		driver.navigate().refresh();

	}

	// --------------------------------------------DataProvider-----------------------
	@DataProvider(name = "name")
	private Object[][] data() {
		Object[][] a = new Object[][] { { "v!t", "Vulture@gmail.com", "5646865150", "12ThRee" },
				{ "VLT123", "vlt1@gmail.in", "1235647890", "123Four" }, { "", "vlt1@gmail.in", "1235647890", "123Four" }

		};
		return a;
	}

	@DataProvider(name = "email")
	private Object[][] data1() {
		Object[][] a = new Object[][] { { "vlt", "Vulture", "5646865150", "12ThRee" },
				{ "VLT", "", "1235647890", "123Four" } };
		return a;
	}

	@DataProvider(name = "mobile")
	private Object[][] data2() {
		Object[][] a = new Object[][] { { "VLT123", "Vulture@gmail.com", "5646865150abc", "12ThRee" },
				{ "VLT123", "vlt1@gmail.in", "", "123Four" } };
		return a;
	}

	@DataProvider(name = "password")
	private Object[][] data3() {
		Object[][] a = new Object[][] { { "vlt", "Vulture@vlt.in", "5646865150", "" },
			{ "vlt", "Vulture@v.vlt", "5646865150", "12ab" }};
		return a;
	}

	@DataProvider(name = "valid")
	private Object[][] data4() {
		Object[][] a = new Object[][] { { "sangeetha", "sangeesanjeevbe@gmail.com", "5646865150", "$12345678" },
				{ "vulture", "VultureLines@v.in", "5646865150", "123abcd" },
				{ "test", "qualityanalystvlt@gmail.com", "5646865150", "$12345678" } };
		return a;
	}
}
