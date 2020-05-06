package test.calculator;

import auxiliar.TestBase;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import pom.Calculator.Principal;

public class sumar extends TestBase {
    Principal principal;

    @Test(description = "Printing dataprovider selected information", dataProvider = "Devices")
    public void sumar(String parameterA, String parameterB, String parameterC, String parameterD){
        AppiumDriver driver = getDriver();
        inicializarVariables();
        ingresarCantidad("123 + 7 =");

        String resultado = principal.obtenerResultado();
        System.out.println(resultado);
        System.out.println("");
    }

    private void inicializarVariables(){
        principal = new Principal(driver);
    }

    private void ingresarCantidad(String cantidad){
        char[] arrayDigito = cantidad.toCharArray();
        for (char digito : arrayDigito){
            switch (digito){
                case '0': principal.clickBotonCero(); break;
                case '1': principal.clickBotonUno(); break;
                case '2': principal.clickBotonDos(); break;
                case '3': principal.clickBotonTres(); break;
                case '4': principal.clickBotonCuatro(); break;
                case '5': principal.clickBotonCinco(); break;
                case '6': principal.clickBotonSeis(); break;
                case '7': principal.clickBotonSiete(); break;
                case '8': principal.clickBotonOcho(); break;
                case '9': principal.clickBotonNueve(); break;
                case '.': principal.clickBotonPunto(); break;
                case '=': principal.clickBotonIgual(); break;
                case '+': principal.clickBotonMas(); break;
                case '-': principal.clickBotonMenos(); break;
                case '*': principal.clickBotonMultiplicacion(); break;
                case '/': principal.clickBotonDivision(); break;
                case '%': principal.clickBotonPorcentaje(); break;
                case '(': principal.clickBotonParentesis(); break;
                case ')': principal.clickBotonParentesis(); break;
                case 'C': principal.clickBotonBorrar(); break;
            }
        }
    }
}
