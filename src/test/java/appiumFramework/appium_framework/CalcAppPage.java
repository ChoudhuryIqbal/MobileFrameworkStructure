package appiumFramework.appium_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalcAppPage {
	
	@AndroidBy(id="editNo1")
	public WebElement txtNUm1;
	
	@AndroidBy(id="editNo2")
	public WebElement txtNUm2;
	
	
	@AndroidBy(id="txtResult")
	public WebElement txtResult;


	public CalcAppPage(AndroidDriver <WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	

}
