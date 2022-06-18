package com.mavenproject.com.mavenproject.sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends Base{
	
	public static void main(String[] args) throws MalformedURLException {
		//io.appium.android.apis:id/drag_dot_2
		//drop io.appium.android.apis:id/drag_dot_1
		//driver.findElementByXPath("//android.widget.TextView[@index=‘4’]").click();
	
		AndroidDriver<AndroidElement> driver=Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
    
    driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
    
    driver.findElementById("io.appium.android.apis:id/drag_dot_2").click();
  
    driver.findElementById("io.appium.android.apis:id/drag_dot_1").click();
    
    driver.findElementById("io.appium.android.apis:id/drag_result_text").click();

   	System.out.println("Drag ele from one side And Drop in another side operation sucessfully done...");
	}
}