package procesos.umg;

import auxiliar.MetodosGenerales;
import auxiliar.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pom.Umg.Login;
import pom.Umg.Menu;
/**
 * @author Angel Torre
 * History:
 */
public class ProcesoLogin extends MetodosGenerales {
    AppiumDriver<MobileElement> driver;
    Login login;
    Menu menu;

    public ProcesoLogin(AppiumDriver driver){
        this.driver = driver;
    }

    public void login(){
        inicializarVariables();
        login.clickBotonLoginGoogle();
    }

    private void inicializarVariables(){
        login = new Login(driver);
        menu = new Menu(driver);
    }
}
