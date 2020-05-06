package pom;

import auxiliar.MetodosGenerales;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Chrome extends MetodosGenerales {

    AppiumDriver<MobileElement> driver;
    Boolean isAndroid;

    @AndroidFindBy(id = "com.android.chrome:id/terms_accept")
    AndroidElement botonAceptarYContinuar;

    @AndroidFindBy(id = "com.android.chrome:id/next_button")
    AndroidElement botonSiguiente;

    @AndroidFindBy(id = "com.android.chrome:id/positive_button")
    AndroidElement botonSiAcepto;

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    MobileElement inputSearchGoogle;

    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    MobileElement inputBarSearchGoogle;

    public Chrome(AppiumDriver driver) {
        isAndroid = isAndroid(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBotonAceptarYContinuar(){
        if (isAndroid) {
            boolean click = click(driver, botonAceptarYContinuar, 4);
            System.out.println(click);
        }

    }

    public void clickBotonSiguiente(){
        boolean click=click(driver, botonSiguiente,4);
        System.out.println(click);
    }

    public void clickBotonSiAcepto(){
        boolean click=click(driver, botonSiAcepto,4);
        System.out.println(click);
    }

    public void ingresarTextoInputSearchGoogle(String texto){
        if (isAndroid) {
        boolean sendText=sendText(driver, inputSearchGoogle, texto,4);
        System.out.println(sendText);
        }
    }

}