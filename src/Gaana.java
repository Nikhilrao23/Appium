import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gaana extends RaagaApp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc = 'Search']").click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).click();
	
		driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("Nimir");
		
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Toliprema']").click();

}
}

