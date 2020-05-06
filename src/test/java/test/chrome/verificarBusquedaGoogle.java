package test.chrome;

import auxiliar.TestBase;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import pom.Chrome;


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
