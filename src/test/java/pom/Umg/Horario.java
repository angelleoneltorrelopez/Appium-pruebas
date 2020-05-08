package pom.Umg;

import auxiliar.MetodosGenerales;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Angel Torre
 * History:
 */
public class Horario extends MetodosGenerales {
    AppiumDriver<MobileElement> driver;
    Boolean isAndroid;

    @AndroidFindBy(id = "umg.app.android:id/sem")
    AndroidElement inputHorarios;

    @AndroidFindBy(id = "umg.app.android:id/Sanio")
    AndroidElement inputano;

    @AndroidFindBy(id = "umg.app.android:id/ver")
    AndroidElement botonVer;

    @AndroidFindBy(id = "umg.app.android:id/ExpHor")
    AndroidElement ListView;

    public Horario(AppiumDriver driver) {
        isAndroid = isAndroid(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean ingresarSemestre(String semestre){
        return sendText(driver, inputHorarios, semestre, 10);
    }

    public boolean ingresarano(String ano){
        return sendText(driver, inputano, ano, 10);
    }

    public boolean clickBotonVer(){
        return click(driver, botonVer, 10);
    }

    public boolean existeListView(){
        return isDisplayed(driver, ListView, 3);
    }
}
