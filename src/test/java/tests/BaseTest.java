package tests;

import general.DriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {

    private File app = new File("src/test/resources/Apps/com.lolo.io.onelist_12.apk");

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","8.0");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("appPackage","com.lolo.io.onelist");
        caps.setCapability("appActivity","com.lolo.io.onelist.MainActivity");
        caps.setCapability("app",app.getAbsolutePath());

        URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
        DriverManager.initializeDriver(appiumURL, caps);
    }
    @AfterClass
    public void  tearDown() {
        DriverManager.getDriver().quit();
    }
}