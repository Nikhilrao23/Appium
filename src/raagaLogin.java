import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class raagaLogin extends RaagaBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementById("android:id/button2").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Done']").click();
		
		driver.findElementByXPath("//android.widget.Button[@text = 'SIGN UP']").click();
		
		driver.findElementById("com.raaga.android:id/signup_name").sendKeys("Binny");
		
		driver.findElementById("com.raaga.android:id/signup_user_name").sendKeys("Mahi");
		
		driver.findElementById("com.raaga.android:id/signup_email").sendKeys("Dhoni@gmail.com");
		
		driver.findElementById("com.raaga.android:id/signup_password").sendKeys("Ohhoonana23");
		
		System.out.println(driver.findElementById("com.raaga.android:id/signup_need_btn").getText());
		
		driver.findElementById("com.raaga.android:id/signup_year").click();
		driver.findElementById("com.raaga.android:id/signup_year").click();
		
		driver.findElement(By.id("com.raaga.android:id/date_display")).clear();
		driver.findElement(By.id("com.raaga.android:id/date_display")).sendKeys("23");
		driver.findElement(By.id("com.raaga.android:id/year_display")).clear();
		driver.findElement(By.id("com.raaga.android:id/year_display")).sendKeys("1992");
		
		driver.findElement(By.id("com.raaga.android:id/month_plus")).click();
		driver.findElement(By.id("com.raaga.android:id/month_plus")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@text = 'SET']")).click();
		driver.hideKeyboard();
		
		driver.findElementById("com.raaga.android:id/signup_gender").click();
		driver.findElementById("com.raaga.android:id/signup_gender").click();
		
		driver.findElementById("com.raaga.android:id/custom_alert_male").click();
		
		//driver.findElement(By.xpath("//android.widget.RelativeLayout[@index = '0']")).click();
		
		// driver.findElement(By.xpath("//android.widget.Button[@index = '0']"));
		
		TouchAction click = new TouchAction(driver);
		
		click.tap(553, 1384).perform();
		driver.findElementByXPath("//android.widget.TextView[@text = 'World Music']").click();
		
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
		
		System.out.println(driver.findElement(By.id("com.raaga.android:id/menu_username_tv")).getText());
		
		System.out.println("Successfully Tried login on Raaga Music app");


		

	}

}
