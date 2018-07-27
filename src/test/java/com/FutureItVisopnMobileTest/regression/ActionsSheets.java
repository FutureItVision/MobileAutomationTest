package com.FutureItVisopnMobileTest.regression;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FutureItVisopnMobileTest.controller.HomePage;
import com.FutureItVisopnMobileTest.ios.ScriptBase;

public class ActionsSheets extends ScriptBase{

	HomePage homepage=new HomePage(driver);
	@BeforeTest
	public void init() throws MalformedURLException {
	  beforetest();
	}
	
	@Test
	public void verifyApplicationSheetClickable() throws MalformedURLException {
		homepage.ApplicationSheet();
		Assert.assertEquals("Okay / Cancel", "Okay / Cancel");
		
		
	}
	
	@AfterTest
	public void end() {
		driver.quit();
	}
}
