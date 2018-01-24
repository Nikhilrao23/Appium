import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gaanaSearch extends GaanaBase {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementById("com.gaana:id/searchview_actionbar").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@index = '0']").click();
		driver.findElementByXPath("//android.widget.EditText[@index = '0']").click();
		driver.findElementByXPath("//android.widget.EditText[@index = '0']").sendKeys("Nimir");
		
	}
}