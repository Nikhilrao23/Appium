import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class raagaSearch extends RaagaBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.Button[@text = 'LATER']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = 'Done']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = 'or Skip to Raaga']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'World Music']").click();
		
		driver.findElement(By.id("com.raaga.android:id/toolbar_search")).click();
		driver.findElement(By.id("com.raaga.android:id/mEtSearchbox")).sendKeys("Nimir");
		
		Thread.sleep(3000);
		
		TouchAction t = new TouchAction(driver);
		
		t.tap(996,1691).perform();
		
		
		
		
		
		
		

	}

}
