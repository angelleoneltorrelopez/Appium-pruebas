package pom;

import auxiliar.MetodosGenerales;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Chrome extends MetodosGenerales {

    private  AppiumDriver<MobileElement> driver;
    private  Boolean isAndroid;

    @AndroidFindBy(id = "com.android.chrome:id/terms_accept")
    private AndroidElement botonAceptarYContinuar;

    @AndroidFindBy(id = "com.android.chrome:id/next_button")
    private AndroidElement botonSiguiente;

    @AndroidFindBy(id = "com.android.chrome:id/positive_button")
    private AndroidElement botonSiAcepto;

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    private MobileElement inputSearchGoogle;

    public Chrome(AppiumDriver driver) {
        isAndroid = isAndroid(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBotonAceptarYContinuar(){
        boolean click=click(driver, botonAceptarYContinuar,4);
        System.out.println(click);
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
        boolean sendText=sendText(driver, inputSearchGoogle, texto,4);
        System.out.println(sendText);
    }
}