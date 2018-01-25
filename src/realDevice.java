import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class realDevice {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File r = new File("src");
		
		// File app = new File(appDir, "com.android.calendar");
		
		DesiredCapabilities cb = new DesiredCapabilities();
		cb.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cb.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		// Mention the Device name as Android Device( Most Important)
		cb.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "");
		cb.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cb);
		
		System.out.println("Plug in your android device and work on the app");

	}

}
