package appiumFramework.appium_framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalcAppTest {
	AppiumDriver <WebElement>driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "donatello");
		cap.setCapability("appPackage", "APP_PACKAGE");
		cap.setCapability("appActivity", "appActivity");
		driver=new AndroidDriver <WebElement>(new URL(""),cap);
	}
	
	@Test
	//upload test
	public void SimpleTest() {
		
	}
}
