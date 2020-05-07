package test.calculator;

import auxiliar.TestBase;
import org.testng.annotations.Test;
import pom.Calculator.Principal;

import java.util.Arrays;
import java.util.List;

/**
 * @author Angel Torre
 * History:
 */
public class operacionesBasicas extends TestBase {
    Principal principal;
    float primerCantidad;
    float segundaCantidad;

    @Test(description = "verify operation basics is correct", dataProvider = "Devices")
    public void operationBasic(String parameterA, String parameterB, String parameterC, String parameterD){
        inicializarVariables();
        List<String> operadores = Arrays.asList("-", "+", "*", "/");

        segundaCantidad = getRandomFloat(100,3);
        primerCantidad = getRandomFloat(100,3);

        for (String operator: operadores) {

            precionarBotones("C" + primerCantidad + operator + segundaCantidad + "=");

            float resultadoPantalla = Float.parseFloat(principal.obtenerResultado());
            float resultadoOperacion = (float) operations(operator);

            System.out.println("Resultado operacion "+resultadoOperacion);
            System.out.println("Resultado pantalla "+resultadoPantalla);

            if ((resultadoOperacion - resultadoPantalla) < 0.0) {
                notificarRegresion(obtenerClase(), obtenerMetodo(), "La operacion no se realizó correctamente entre " +
                        "" + primerCantidad + " + " + segundaCantidad + " el resultado deberia ser: " + resultadoOperacion + " pero dio " + resultadoPantalla);
            }

        }
    }

    private void inicializarVariables(){
        principal = new Principal(driver);
    }

    private double operations(String operator){
        switch (operator){
            case "-": System.out.println("Resta"); return primerCantidad - segundaCantidad;
            case "+": System.out.println("Suma"); return primerCantidad + segundaCantidad;
            case "*": System.out.println("Multiplicación"); return primerCantidad * segundaCantidad;
            case "/": System.out.println("División"); return primerCantidad / segundaCantidad;
            case "%": System.out.println("Porcentaje"); return primerCantidad % segundaCantidad;
            default: System.out.println("Null"); return 0.00;
        }
    }

    private void precionarBotones(String cantidad){
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
