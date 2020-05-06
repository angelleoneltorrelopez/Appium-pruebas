package pruebas;

import auxiliar.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import pom.Chrome;

import java.net.URL;


public class verificarBusquedaGoogle extends TestBase {

    @Test(description = "Printing dataprovider selected information", dataProvider = "Devices")
    public void busquedaGoogleSearch(String parameterA, String parameterB, String parameterC, String parameterD){
        AppiumDriver driver = getDriver();
        Chrome chrome = new Chrome(driver);
     /* chrome.clickBotonAceptarYContinuar();
        chrome.clickBotonSiguiente();
        chrome.clickBotonSiAcepto();
       */
        chrome.ingresarTextoInputSearchGoogle("www.ingenieriazeros.com");
        System.out.println("");
    }
}
