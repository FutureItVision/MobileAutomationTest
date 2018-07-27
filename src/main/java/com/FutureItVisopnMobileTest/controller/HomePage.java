package com.FutureItVisopnMobileTest.controller;

import org.openqa.selenium.By;

import com.FutureItVisopnMobileTest.ios.ScriptBase;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class HomePage  extends ScriptBase{
	public HomePage(IOSDriver<IOSElement>driver) {
		this.driver=driver;
	}


public void  ApplicationSheet() {
	driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Toolbars\"]")).click();
	driver.findElementByClassName("XCUIElementTypeStaticText").getText();
	
}
}