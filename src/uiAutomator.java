import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomator extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().Clickable(true)").size());
		
	}
}

/*
1. Click on Views
2. 
*/