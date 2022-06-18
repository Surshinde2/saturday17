package com.mavenproject.com.mavenproject.sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Open_Calculator_Tc extends Utility {
public static void main(String[] args) throws MalformedURLException {
 
AndroidDriver<AndroidElement> driver= Capabilities();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
	 
driver.findElementById("com.miui.calculator:id/btn_7_s").click();
driver.findElementById("//com.miui.calculator:id/btn_plus_s").click();
driver.findElementById("com.miui.calculator:id/btn_3_s").click();
driver.findElementById("com.miui.calculator:id/btn_equal_s").click();

	
}
} 
   