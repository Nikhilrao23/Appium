import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class playSong extends RaagaBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.Button[@text = 'LATER']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text]" ).click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'or Skip to Raaga']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'World Music']").click();
		
		driver.findElementById("com.raaga.android:id/toolbar_search").click();
		
		driver.findElementByXPath("//android.widget.EditText[@index = '1']").sendKeys("Kabali");
		
		TouchAction rt = new TouchAction(driver);
		
		rt.tap(996, 1698).perform();
		
		
		
		

	}

}
