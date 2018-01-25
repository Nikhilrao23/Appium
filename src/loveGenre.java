import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class loveGenre extends RaagaBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.Button[@text = 'LATER']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text]" ).click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'or Skip to Raaga']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'World Music']").click();
		
		// TouchAction lee = new TouchAction(driver);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector)).scrollIntoView(text(\"See All\"))").click();
		

	}

}
