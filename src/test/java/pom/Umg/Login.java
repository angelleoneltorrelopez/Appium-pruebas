package pom.Umg;

import auxiliar.MetodosGenerales;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Login extends MetodosGenerales {

    AppiumDriver<MobileElement> driver;
    Boolean isAndroid;

    @AndroidFindBy(className = "android.widget.Button")
    AndroidElement botonLoginGoogle;

    @AndroidFindBy(xpath = "//*[contains(@text, 'atorrel@miumg.edu.gt')]")
    AndroidElement textUser;

    public Login(AppiumDriver driver) {
        isAndroid = isAndroid(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBotonLoginGoogle(){
        click(driver, botonLoginGoogle, 10);
        System.out.println("click boton google");
    }

    public void clickUser(){
        click(driver, textUser, 10);
        System.out.println("click usuario");
    }
}
