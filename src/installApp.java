import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
// import io.appium.java_client.android.AndroidKeyCode;

public class installApp extends googlePlayBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementById("com.android.vending:id/search_box_idle_text").click();
		driver.findElementById("com.android.vending:id/search_box_text_input").sendKeys("Lingodeer");
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Learn Japanese, Learn Korean or Learn Chinese Free']").click();
		driver.findElementByXPath("//android.widget.Button[@text = 'INSTALL']").click();
		
		// driver.findElementByXPath("//android.widget.Button[@text = 'CONTINUE']").click();
		// driver.findElementByXPath("//android.widget.TextView[@text = 'SKIP']").click();
		
		Thread.sleep(10000);
		
		driver.findElementByXPath("//android.widget.Button[@text = 'OPEN']").click();
		
		// driver.pressKeyCode(AndroidKeyCode.HOME);
		
		driver.removeApp("com.lingodeer");
		// Uninstall the apps
		
		
	} 

}
