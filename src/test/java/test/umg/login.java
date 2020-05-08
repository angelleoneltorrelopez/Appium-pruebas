package test.umg;

import auxiliar.TestBase;
import org.testng.annotations.Test;
import pom.Umg.Login;
import pom.Umg.Menu;
/**
 * @author Angel Torre
 * History:
 */
public class login extends TestBase {
    Login login;
    Menu menu;

    @Test(description = "verify login app UMG", dataProvider = "Devices")
    public void operationBasic(String parameterA, String parameterB, String parameterC, String parameterD){
        inicializarVariables();
        login.clickBotonLoginGoogle();
        login.clickUser();
        if (!menu.clickBotonHorarios()){
            notificarRegresion(obtenerClase(), obtenerMetodo(), "No se realizó el login");
        }
        System.out.println("");
    }

    private void inicializarVariables(){
        login = new Login(driver);
        menu = new Menu(driver);
    }
}
