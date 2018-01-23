import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class MusicOne extends RaagaBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementById("android:id/button2").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Done']").click();
		
		// driver.findElementByXPath("//android.widget.TextView[@text = 'Done']").click();
		
		// driver.findElementByXPath("//android.widget.TextView[@text = 'Done']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'or Skip to Raaga']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'World Music']").click();
		
		Thread.sleep(4000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(id(\"com.raaga.android:id/music_home_raaga_live\")");
	}
	
}
