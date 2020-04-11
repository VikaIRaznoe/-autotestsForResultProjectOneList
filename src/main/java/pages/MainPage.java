package pages;

import general.DriverManager;
import general.GeneralMethods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static general.GeneralMethods.waitForElementPresentRefact;

public class MainPage {

    By elementTODO = By.xpath("//*[contains(@text,'TODO')]");
    By enjoyText = By.id("text");
    By itemEditText = By.id("addItemEditText");
    By elementTuto = By.xpath("//*[contains(@text,'Tuto')]");
    By elementUserList = By.xpath("//*[contains(@text,'List 1')]");
    By elementShareList = By.id("buttonShareList");
    By elementCopyToClipBoard = By.xpath("//*[contains(@text,'Copy to clipboard')]");
    By elementSettings = By.id("menu_arrow");
    By elementGoSettingsPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");

    public void openListTODO(){
        waitForElementPresentRefact(elementTODO,5).click();
    }

    public void openUserList(){
        waitForElementPresentRefact(elementUserList,5).click();
    }

    public void shareList(){
        waitForElementPresentRefact(elementShareList,5).click();
        waitForElementPresentRefact(elementCopyToClipBoard,5).click();
    }

    public void swipeEnjoyElement(){
        GeneralMethods.swipeElementLeft(enjoyText);
    }

    public void clickListAdd(){
        waitForElementPresentRefact(itemEditText,5).click();
    }

    public void editText(String text){
        waitForElementPresentRefact(itemEditText,5).sendKeys(text);
        waitForElementPresentRefact(By.id("validate"),5).click();
    }

    public void clickPlusButton(){
        waitForElementPresentRefact(By.id("buttonAddList"),5).click();
    }

    public void inputNameList(){
        waitForElementPresentRefact(By.id("listTitle"),5).sendKeys("List 1");
        waitForElementPresentRefact(By.id("validateEditList"),5).click();
    }

    public void markAsDoneReminder(String Reminder){
        By elementReminder = By.xpath("//*[contains(@text,\'Reminder\')]");
        waitForElementPresentRefact(elementReminder,5).click();
    }

    public void deleteListTuto(){
        WebElement elementWebTuto = waitForElementPresentRefact(elementTuto,5);
        GeneralMethods.longPress(elementWebTuto);
    }

    public void rotateScreenLandScape(){
        GeneralMethods.rotateScreenLandScape();
    }

    public void searchingElementInList(String Reminder){
        WebElement element = waitForElementPresentRefact(By.xpath("//*[contains(@text,\'Reminder\')]"),5);
        element.click();
    }

    public void clickButtonShare(){
        WebElement elementShare = waitForElementPresentRefact(elementShareList,5);
        elementShare.click();
    }

    public void findTextOfListRefact(String text){
        String textFromList = DriverManager.getDriver().getClipboardText();
        String[] parts = textFromList.split("\n");
        for (String str: parts){
            System.out.println(str.equals(text));
        }
    }

    public void findArrayTextOfList(String[] Reminder){
        String textFromList = DriverManager.getDriver().getClipboardText();
        for(String slovo: Reminder){
            Pattern pattern = Pattern.compile(slovo);
            Matcher matcher = pattern.matcher(textFromList);
            System.out.println(matcher.find());
        }
    }

    public void goToPageSettings(){
        waitForElementPresentRefact(elementSettings,5).click();
        waitForElementPresentRefact(elementGoSettingsPage,5).click();
    }
}