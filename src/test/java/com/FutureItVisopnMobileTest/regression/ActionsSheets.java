package com.FutureItVisopnMobileTest.regression;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.FutureItVisopnMobileTest.ios.ScriptBase;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ActionsSheets extends ScriptBase{
	
	@Test
	public void verifyApplicationSheetClickable() throws MalformedURLException {
		IOSDriver<IOSElement>driver=beforetest();
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Toolbars\"]")).click();
		driver.findElementByClassName("XCUIElementTypeStaticText").getText();
		Assert.assertEquals("Okay / Cancel", "Okay / Cancel");
		
		
	}

}
