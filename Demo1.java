package com.mavenproject.com.mavenproject.sample;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo1 {
	public static void main(String[] args)  throws MalformedURLException {


DesiredCapabilities cap= new DesiredCapabilities();

File appDir = new File("src");

File app = new File(appDir, "ApiDemos-debug.apk");

cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 8 Pro");
cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");//new step

cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0.4.0");//new step


cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"automator");//new step

cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
///driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
}
the is appium scripts used to automate java appium client
