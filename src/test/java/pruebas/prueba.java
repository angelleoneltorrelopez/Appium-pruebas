package pruebas;



import auxiliar.MetodosGenerales;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class prueba extends MetodosGenerales {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    //Elements
    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    MobileElement inputSearchGoogle;

    @AndroidBy(id = "com.android.chrome:id/terms_accept")
    MobileElement botonAceptarYContinuar;

    @AndroidBy(id = "com.android.chrome:id/next_button")
    MobileElement botonSiguiente;

    @AndroidBy(id = "com.android.chrome:id/positive_button")
    MobileElement botonSiAcepto;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "angel");
        caps.setCapability("udid", "RF8MC22QGXB"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity","com.google.android.apps.chrome.Main");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
    }


    @Test
    public void basicTest () {
        System.out.println("hola");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.chrome:id/terms_accept"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.chrome:id/next_button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.chrome:id/positive_button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.chrome:id/search_box_text"))).sendKeys("www.ingenieriazeros.com");
        driver.pressKeyCode(AndroidKeyCode.ENTER);
        System.out.println("hola");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}