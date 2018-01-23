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

public class RaagaBase {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f, "Raaga.apk");
		
		DesiredCapabilities cc = new DesiredCapabilities();
		
		
		cc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		cc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		// cc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.raaga.musichome.MusicHome");
		// cc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.raaga.android");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
