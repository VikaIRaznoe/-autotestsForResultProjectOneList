package general;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ScreenShotClass {
    protected final String PATH = "./target/screenshots/";

    public void captureScreenshot() {

        String file = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime()) + ".png";
        byte[] screenshot = DriverManager.getDriver().getScreenshotAs(OutputType.BYTES);

        try {
            FileUtils.writeByteArrayToFile(new File(PATH + file), saveScreenshot(screenshot));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private byte[] saveScreenshot(byte[] screenshot) {
        return screenshot;
    }
}
