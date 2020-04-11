package pages;

import org.openqa.selenium.By;
import static general.GeneralMethods.waitForElementPresentRefact;

public class SettingsPage {
    By elementDefaultStorageFolder = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]");
    By elementChooseFolderButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]\n");
    By elementAllowButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]");
    By elementAboutVersionApp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[2]");

    public void selectPrivateStorage(){
        waitForElementPresentRefact(elementDefaultStorageFolder,5);
    }

    public void chooseFolderStorageButton(){
        waitForElementPresentRefact(elementChooseFolderButton,5);
    }

    public void allowAccessToYourContent(){
        waitForElementPresentRefact(elementAllowButton,5);
    }

    public String versionAppСheck(){
        return waitForElementPresentRefact(elementAboutVersionApp,5).getText();
    }
}