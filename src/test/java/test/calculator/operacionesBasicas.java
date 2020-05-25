package test.calculator;

import auxiliar.TestBase;
import org.testng.annotations.Test;
import pom.Calculator.Principal;

import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertTrue;

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

        segundaCantidad = 4; //getRandomFloat(100,3);
        primerCantidad = 8; //getRandomFloat(100,3);

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
                case '0': assertTrue(principal.clickBotonCero(), "Fallo el boton cero"); break;
                case '1': assertTrue(principal.clickBotonUno(), "Fallo el boton uno"); break;
                case '2': assertTrue(principal.clickBotonDos(), "Fallo el boton dos"); break;
                case '3': assertTrue(principal.clickBotonTres(), "Fallo el boton tres"); break;
                case '4': assertTrue(principal.clickBotonCuatro(), "Fallo el boton cuatro"); break;
                case '5': assertTrue(principal.clickBotonCinco(), "Fallo el boton cinco"); break;
                case '6': assertTrue(principal.clickBotonSeis(), "Fallo el boton seis"); break;
                case '7': assertTrue(principal.clickBotonSiete(), "Fallo el boton siete"); break;
                case '8': assertTrue(principal.clickBotonOcho(), "Fallo el boton ocho"); break;
                case '9': assertTrue(principal.clickBotonNueve(), "Fallo el boton nueve"); break;
                case '.': assertTrue(principal.clickBotonPunto(), "Fallo el boton punto"); break;
                case '=': assertTrue(principal.clickBotonIgual(), "Fallo el boton igual"); break;
                case '+': assertTrue(principal.clickBotonMas(), "Fallo el boton mas"); break;
                case '-': assertTrue(principal.clickBotonMenos(), "Fallo el boton menos"); break;
                case '*': assertTrue(principal.clickBotonMultiplicacion(), "Fallo el boton multiplicacion"); break;
                case '/': assertTrue(principal.clickBotonDivision(), "Fallo el boton division"); break;
                case '%': assertTrue(principal.clickBotonPorcentaje(), "Fallo el boton porcentaje"); break;
                case '(': assertTrue(principal.clickBotonParentesis(), "Fallo el boton parentesis"); break;
                case ')': assertTrue(principal.clickBotonParentesis(), "Fallo el boton perentesis"); break;
                case 'C': assertTrue(principal.clickBotonBorrar(), "Fallo el boton borrar"); break;
            }
        }
    }
}
