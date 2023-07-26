package Appium.Appium_Java;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * Unit test for simple App.
 */
public class appiumBasicTest 
{
   
    @Test
    public void AppiumTest() throws MalformedURLException
    {
    		
		
		  AppiumDriverLocalService service = new
		  AppiumServiceBuilder().withAppiumJS(new
		  File("C:\\Program Files\\nodejs\\node_modules\\npm\\node_modules\\qrcode-terminal\\lib"
		  )) .withIPAddress("192.168.32.1").usingPort(4723).build(); service.start();
		
		 
    
    	
    	UiAutomator2Options options= new UiAutomator2Options();
    		options.setDeviceName("MyMob");
    		options.setApp("G:\\API Automation Udemy Class\\Appium_Java\\src\\main\\java\\utils\\ApiDemos-debug.apk");
    	
    		@SuppressWarnings("deprecation")
			AndroidDriver driver = new AndroidDriver( new URL("http://192.168.32.1:4723/") , options);
    		driver.quit();
    	//
    		
    		//service.stop();
    
    }



}
