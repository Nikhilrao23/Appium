import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']");
		
		TouchAction action = new TouchAction(driver);
		
		action.tap(driver.findElementByXPath("//android.widget.TextView[@text = 'Expandable Lists']")).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text = '1. Custom Adapter']");
		
		new TouchAction((PerformsTouchActions) driver).press(driver.findElement(By.xpath("//android.widget.TextView[@text = 'People Names'"))).waitAction(3000).release().perform();
		
		System.out.println(driver.findElementsByXPath("//android.widget.TextView[@index = '0']").get(0).getText());
	}
}
/*
1. Click on Views - Xpath
2. We are going to implement Tap - So create TouchActions
3. Tap on Expandable lists using tap - Xpath
4. Click on Custom Adapter - Xpath
5. Create a new Touch Action and perform them to Press -> Hold -> Release it
6. Extract the text and print them out
*/