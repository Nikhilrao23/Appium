import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class RaagaApp {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		
		DesiredCapabilities cb = new DesiredCapabilities();
	
		cb.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		cb.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cb.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.gaana.GaanaActivity");
		cb.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gaana");
		
		AndroidDriver driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),cb);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		

	}

}
