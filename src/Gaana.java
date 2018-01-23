import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gaana extends GaanaBase {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc = 'Search']").click();
		
		
}
}

