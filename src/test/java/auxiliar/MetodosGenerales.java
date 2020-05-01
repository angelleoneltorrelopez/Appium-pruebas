package auxiliar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosGenerales {
    private WebDriverWait wait;
    private TouchAction action;
    private Dimension screenSize;
    private int ScreenWidth;
    private int ScreenHeight;

    protected boolean isAndroid(AppiumDriver driver){
        return driver instanceof AndroidDriver;
    }

    protected WebDriverWait waiter(AppiumDriver driver, int timeOut){
        return new WebDriverWait(driver, timeOut);
    }

    protected Boolean isDisplayed(AppiumDriver driver, MobileElement element, int timeOut){
        try{
            wait = waiter(driver, timeOut);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }
        catch(Exception Error) {
            return false;
        }
    }
    protected Boolean isClickeable(AppiumDriver driver, MobileElement element, int timeOut){
        try{
            wait = waiter(driver, timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch(Exception Error) {
            return false;
        }
    }

    protected Boolean type(AppiumDriver driver, MobileElement element, String text, int timeOut){
        try{
            if (!isDisplayed(driver,element,timeOut)){ return false; }
            element.sendKeys(text);
            return true;
        }catch(Exception Error){
            return false;
        }
    }

    protected Boolean click(AppiumDriver driver, MobileElement element, int timeOut){
        try{
            if (!isDisplayed(driver,element,timeOut)){ return false; }
            wait = waiter(driver, timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
            return true;
        }catch(Exception Error){
            return false;
        }
    }

    protected Boolean clear(AppiumDriver driver, MobileElement element, int timeOut){
        try{
            if (!isDisplayed(driver, element, timeOut)){ return false; }
            element.clear();
            return true;
        }catch(Exception Error){
            return false;
        }
    }

    protected void getScreenSize(AppiumDriver driver){
        screenSize = driver.manage().window().getSize();
        ScreenHeight = screenSize.height;
        ScreenWidth = screenSize.width;
    }

    protected Boolean longPress(AppiumDriver driver, MobileElement element, int timeOut){
        try{
            if (!isDisplayed(driver, element, timeOut)){ return false; }
            action = new TouchAction(driver);
            action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)));
            action.perform();
            return true;
        }catch(Exception Error){
            return false;
        }
    }

    protected void closeDriver(AppiumDriver driver){
        driver.closeApp();
        driver.quit();
    }

    protected void closeServer(AppiumDriverLocalService server){
        server.stop();
    }

    protected Boolean sendText(AppiumDriver driver, MobileElement element, String texto, int timeOut){
        try{
            if (!isDisplayed(driver,element,timeOut)){ return false; }
            wait = waiter(driver, timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(texto);
            return true;
        }catch(Exception Error){
            return false;
        }
    }

}
