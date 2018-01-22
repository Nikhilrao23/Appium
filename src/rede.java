import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class rede extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>  driver= Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Preference']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = '4. Default values']").click();
		
		driver.findElementByClassName("android.widget.CheckBox").click();
		
		driver.findElementsByXPath("//android.widget.TextView[@text = 'Edit text preference']").get(0).click();
		
		driver.findElementByClassName("android.widget.EditText").clear();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("Nikhil Rao");
		
		driver.findElementByXPath("//android.widget.Button[@index = '0']").click();
		
	}
}

/*
1. Go to Preference - Xpath
2. Click on Default Values - Xpath
3. Turn off the checkbox - Class name
4. Click on the Second Option - Xpath
5. Clear the text - Class name
6. Send in any text - Class name
7. Then Click Cancel - Xpath
*/