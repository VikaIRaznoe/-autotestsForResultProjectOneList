package tests;

import general.DriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","8.0");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("appPackage","com.lolo.io.onelist");
        caps.setCapability("appActivity","com.lolo.io.onelist.MainActivity");
        caps.setCapability("app","/Users/viktoria/IdeaProjects/Java/NextDeveloping/FinalProject/src/test/resources/Apps/com.lolo.io.onelist_12.apk");

        URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
        DriverManager.initializeDriver(appiumURL, caps);
    }
    @AfterClass
    public void  tearDown() {
        DriverManager.getDriver().quit();
    }

    @AfterMethod
    public void takeScreenshot(){

    }
}
