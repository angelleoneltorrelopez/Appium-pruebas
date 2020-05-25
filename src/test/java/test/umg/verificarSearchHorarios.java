package test.umg;

import auxiliar.TestBase;
import org.testng.annotations.Test;
import pom.Umg.Horario;
import pom.Umg.Menu;
import procesos.umg.ProcesoLogin;

import static org.testng.Assert.assertTrue;

/**
 * @author Angel Torre
 * History:
 */
public class verificarSearchHorarios extends TestBase {
    ProcesoLogin procesoLogin;
    Menu menu;
    Horario horario;
    @Test(description = "verify login app UMG", dataProvider = "Devices")
    public void verificarSearchHorarios(String parameterA, String parameterB, String parameterC, String parameterD){
        inicializarVariables();
        procesoLogin.login();
        menu.clickBotonHorarios();

        assertTrue(horario.ingresarSemestre("1"), "No ingreso semestre");
        assertTrue(horario.ingresarano("2013"), "No ingreso año");
        assertTrue(horario.clickBotonVer(), "Falla boton verr");
        if (horario.existeListView()){
            notificarRegresion(obtenerClase(), obtenerMetodo(), "si se muestra el ListView");
        }

        horario.ingresarSemestre("1");
        horario.ingresarano("2014");
        horario.clickBotonVer();
        if (!horario.existeListView()){
            notificarRegresion(obtenerClase(), obtenerMetodo(), "no se muestra el ListView");
        }
        System.out.println("");
    }

    private void inicializarVariables(){
        procesoLogin = new ProcesoLogin(driver);
        menu = new Menu(driver);
        horario = new Horario(driver);
    }
}
