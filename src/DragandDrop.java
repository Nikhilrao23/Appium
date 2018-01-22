import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragandDrop extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Drag and Drop']").click();
		
		TouchAction action = new TouchAction(driver);
		
		action.longPress(driver.findElementById("com.example.android.apis:id/drag_dot_1")).moveTo(driver.findElementById("com.example.android.apis:id/drag_dot_3")).release().perform();
		
		System.out.println("Drag and Drop Fuctionality is done");
	}
}



/*
1. Go to Views - Xpath
2. Go to Drag and Drop = Xpath
3. Use Touch Actions for Drag and Drop
4. Use Touch Action to longPress -> Drag and Drog on another element. Use moveTo
*/