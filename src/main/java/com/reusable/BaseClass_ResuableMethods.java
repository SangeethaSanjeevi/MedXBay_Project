package com.reusable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_ResuableMethods {

	public static WebDriver driver;

	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;

	}

	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void sendkeys(WebElement e, String a) throws InterruptedException {
		e.sendKeys(a);
		Thread.sleep(5000);
	}

	public static void click(WebElement e) throws InterruptedException {
		e.click();
		Thread.sleep(1000);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void scrollDown(WebElement webElement) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", webElement);
		Thread.sleep(5000);
	}

	public static void scrollUp(WebElement scrollUp) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollUp);
		Thread.sleep(5000);
	}
	
	public static void value(String value , WebElement webElement) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value, webElement);
		Thread.sleep(5000);
	}

	public static void nextWindow(WebElement click, String pagename, String message) throws InterruptedException {
		String parentId = driver.getWindowHandle();
		click(click);
		Thread.sleep(2000);
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			if (!parentId.equals(id)) {
				driver.switchTo().window(id);
			}

		}

		String currentUrl = driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertTrue(currentUrl.contains(pagename), message);

		Thread.sleep(5000);

		if (currentUrl.contains(pagename)) {
			driver.close();
			System.out.println("Successfully - " + message);
			// switch to parent id
			driver.switchTo().window(parentId);

		} else if (!currentUrl.contains("medxbay.com")) {
			driver.close();
			System.err.println("Failed - " + message);
			driver.switchTo().window(parentId);

		} else {
			System.err.println("Failed - " + message);

		}

		s.assertAll();
		Thread.sleep(5000);
	}

	public static void validationNavigateOrNot(WebElement submit_button, String NotNavigateIsCorrectOrNot,
			String NavigateIsCorrectOrNot) throws InterruptedException {
		String parentId = driver.getWindowHandle();
		click(submit_button);

		Thread.sleep(2000);
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			if (parentId.equals(id)) {
				System.out.println(NotNavigateIsCorrectOrNot);
			} else {
				System.out.println(NavigateIsCorrectOrNot);
			}
		}
		Thread.sleep(5000);

	}

	public static void enter() throws AWTException, InterruptedException {
		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

	}

	public static void screenshot(String screenshotFileName) throws IOException, InterruptedException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source_file = ts.getScreenshotAs(OutputType.FILE);

		File destination_file = new File(
				"C:\\Users\\91637\\eclipse-workspace\\VLT\\MedxBay_Project\\ScreenShot-Report\\" + screenshotFileName
						+ ".png");
		FileUtils.copyFile(source_file, destination_file);
		Thread.sleep(5000);

	}

	public static void action_doubleClick(WebElement fieldname) throws InterruptedException {
		Actions a = new Actions(driver);
		a.doubleClick(fieldname).perform();
		Thread.sleep(5000);

	}

	public static void softAssert(String pagename, String message) throws InterruptedException {
		Thread.sleep(5000);

		String currentUrl = driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertTrue(currentUrl.contains(pagename), message);
		if (currentUrl.contains(pagename)) {
			System.out.println("successfully - " + message);
		} else {
			System.err.println("Failed - " + message);
		}

		s.assertAll();
		Thread.sleep(5000);
	}

	public static void pageValidation(String validationmessage, String Anothervalidationmessage, String message)
			throws InterruptedException {
		Thread.sleep(5000);
		boolean contains = driver.getPageSource().contains(validationmessage);
		boolean contains1 = driver.getPageSource().contains(Anothervalidationmessage);

		SoftAssert s = new SoftAssert();
		if (contains || contains1  == true) {
			System.out.println("successfully - " + message);
		} else {
			System.err.println("Failed - " + message);
		}
		s.assertAll();
		Thread.sleep(5000);
	}
	
	public static void delete() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);		
	}
	
	
	public static void tab() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);	
		r.keyRelease(KeyEvent.VK_TAB);		
	}
	

}
