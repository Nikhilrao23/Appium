import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Misc extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']");
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}
}
/*
1. Get Current Activity
2. Get context
3. Get Orientation
4. isLocked
5. Hide Keyboard
6. Go to Views and click Back button



getContext: Displays what kind of apps we are handling
Views - Native, Hybrid, webview
*/
