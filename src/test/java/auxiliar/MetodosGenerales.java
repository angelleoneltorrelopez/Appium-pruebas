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
import org.testng.Assert;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

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

    protected Boolean enter(AppiumDriver driver, MobileElement element, int timeOut){
        try{
            if (!isDisplayed(driver,element,timeOut)){ return false; }
            wait = waiter(driver, timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.sendKeys(Keys.ENTER);
            return true;
        }catch(Exception Error){
            return false;
        }
    }

    protected String getText(AppiumDriver driver, MobileElement element, int timeOut){
        try{
            if (!isDisplayed(driver,element,timeOut)){ return "false"; }
            wait = waiter(driver, timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText();
        }catch(Exception Error){
            return "false";
        }
    }

    public void notificarRegresion(String clase, String metodo, String mensajeRegresion) {
        String asuntoCorreo = "REGRESIÓN: [" + clase + "] --" + (new Date());
        String cuerpoCorreo = "<strong> Clase: </strong>[" + clase + "]" + "<br />" +
                "<strong>Método:</strong>. [" + metodo + "]" + "<br />" +
                "<strong>Motivo de fallo:</strong> " + mensajeRegresion;
        Assert.fail(mensajeRegresion);
    }

    public String obtenerClase() {
        return getClass().getSimpleName();
    }

    public String obtenerMetodo() {
        if (Thread.currentThread().getStackTrace().length > 2) {
            return Thread.currentThread().getStackTrace()[2].getMethodName();
        } else {
            return "undefined";
        }
    }

    public int obtenerEnteroAleatorio(int rango) {
        return ThreadLocalRandom.current().nextInt(rango);
    }

    public float getRandomFloat(int rango, int posicionesDecimales) {
        int potenciaDe10 = (int) Math.pow(10, posicionesDecimales);
        int numero = rango * potenciaDe10;
        numero = ThreadLocalRandom.current().nextInt(numero);
        return ((float) numero) / ((float) potenciaDe10);
    }

    public float redondearConDecimales(float numero, int cifrasDecimales) {
        float decimalRedondeo = (float) (0.5 * Math.pow(10, -1 * cifrasDecimales));
        int entero = (int) ((numero + decimalRedondeo) * Math.pow(10, cifrasDecimales));
        return ((float) entero) / ((float)(Math.pow(10, cifrasDecimales)));
    }
}
