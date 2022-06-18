package com.mavenproject.com.mavenproject.sample;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sample_Appium {
public static void main(String[] args) throws MalformedURLException {
	
	File fs = new File("ApiDemos-debug.apk");
	
	DesiredCapabilities cap= new DesiredCapabilities();

	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");//new step
	
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");//new step

	
//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"automator");//new step

	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	
	
	
	
	
	
	
	
	
	
	
}
}
