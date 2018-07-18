package com.FutureItVisopnMobileTest.ios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstIOStest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities  desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 6");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS" );
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/admin/Documents/Worksapce/FutureItVisopnMobileTest/UICatalogFile/UICatalog.app" );
	    IOSDriver<IOSElement>driver=new IOSDriver<IOSElement>(new URL("http://127.0.01:4723/wd/hub"),desiredCapabilities);
	}

}
