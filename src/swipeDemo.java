import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipeDemo extends base{
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Date Widgets']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = '2. Inline']").click();
		
		driver.findElementByXPath("//*[@content-desc = '9']").click();
		
		TouchAction action = new TouchAction(driver);
		
		action.press(driver.findElementByXPath("//*[@content-desc = '15']")).waitAction(2000).moveTo(driver.findElementByXPath("//*[@content-desc = '45']")).perform();
		
	}
}
/*
1. Click on Views - Xpath
2. Click on Date Widgets - Xpath
3. Click on Incline - AndroidUIAutomator
4. Use Touch Action for Press
5. Click on 9 and then 45 - Xpath
*/