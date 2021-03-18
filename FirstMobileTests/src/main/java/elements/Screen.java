package elements;

import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;

public class Screen {
    private AndroidDriver driver = InitialDriver.getDriver();

    public void scrollablePage(String text){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains("+"\""+text+"\""+").instance(0));");

    }
}
