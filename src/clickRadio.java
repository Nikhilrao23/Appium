import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class clickRadio extends RaagaBase {

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
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"))");
		
		driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
		
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Settings']").click();
		
		driver.findElementById("com.raaga.android:id/app_push").click();
		
		driver.findElementById("com.raaga.android:id/toggle_notifyrecommend");
		
		TouchAction t = new TouchAction(driver);
		
		t.tap(944, 419).perform();
		Thread.sleep(3000);
		
		t.tap(944, 419).perform();
		
		/* Point point = driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
		TouchAction action = new TouchAction(driver);
		
		action.tap(point.x+20, point.y+30).perform();
		Thread.sleep(2000);
		
		action.tap(point.x+50, point.y+30).perform();
		*/
	
		
		
		
	}
	
}
