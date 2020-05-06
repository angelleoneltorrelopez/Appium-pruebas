package pom.Calculator;

import auxiliar.MetodosGenerales;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Principal extends MetodosGenerales {
    AppiumDriver<MobileElement> driver;
    Boolean isAndroid;

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_00")
    AndroidElement botonCero;

    @AndroidFindBy(accessibility = "1")
    AndroidElement botonUno;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='2']")
    AndroidElement botonDos;

    @AndroidFindBy(accessibility = "3")
    AndroidElement botonTres;

    @AndroidFindBy(accessibility = "4")
    AndroidElement botonCuatro;

    @AndroidFindBy(accessibility = "5")
    AndroidElement botonCinco;

    @AndroidFindBy(accessibility = "6")
    AndroidElement botonSeis;

    @AndroidFindBy(accessibility = "7")
    AndroidElement botonSiete;

    @AndroidFindBy(accessibility = "8")
    AndroidElement botonOcho;

    @AndroidFindBy(accessibility = "9")
    AndroidElement botonNueve;

    @AndroidFindBy(accessibility = "Igual")
    AndroidElement botonIgual;

    @AndroidFindBy(accessibility = "Más")
    AndroidElement botonMas;

    @AndroidFindBy(accessibility = "Menos")
    AndroidElement botonMenos;

    @AndroidFindBy(accessibility = "Multiplicación")
    AndroidElement botonMultiplicacion;

    @AndroidFindBy(accessibility = "División")
    AndroidElement botonDivision;

    @AndroidFindBy(accessibility = "Separador decimal")
    AndroidElement botonPunto;

    @AndroidFindBy(accessibility = "Porcentaje")
    AndroidElement botonPorcentaje;

    @AndroidFindBy(accessibility = "Paréntesis")
    AndroidElement botonParentesis;

    @AndroidFindBy(accessibility = "Borrar")
    AndroidElement botonBorrar;

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/calc_edt_formula")
    AndroidElement resultado;


    public Principal(AppiumDriver driver) {
        isAndroid = isAndroid(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBotonCero(){
        if (isAndroid) {
            boolean click  = click(driver, botonCero, 10);
            System.out.println(click);
        }
    }

    public void clickBotonUno(){
        if (isAndroid) {
            boolean click  = click(driver, botonUno, 10);
            System.out.println(click);
        }
    }

    public void clickBotonDos(){
        if (isAndroid) {
            boolean click  = click(driver, botonDos, 10);
            System.out.println(click);
        }
    }

    public void clickBotonTres(){
        if (isAndroid) {
            boolean click  = click(driver, botonTres, 10);
            System.out.println(click);
        }
    }

    public void clickBotonCuatro(){
        if (isAndroid) {
            boolean click  = click(driver, botonCuatro, 10);
            System.out.println(click);
        }
    }

    public void clickBotonCinco(){
        if (isAndroid) {
            boolean click  = click(driver, botonCinco, 10);
            System.out.println(click);
        }
    }

    public void clickBotonSeis(){
        if (isAndroid) {
            boolean click  = click(driver, botonSeis, 10);
            System.out.println(click);
        }
    }

    public void clickBotonSiete(){
        if (isAndroid) {
            boolean click  = click(driver, botonSiete, 10);
            System.out.println(click);
        }
    }

    public void clickBotonOcho(){
        if (isAndroid) {
            boolean click  = click(driver, botonOcho, 10);
            System.out.println(click);
        }
    }

    public void clickBotonNueve(){
        if (isAndroid) {
            boolean click  = click(driver, botonNueve, 10);
            System.out.println(click);
        }
    }

    public void clickBotonPunto(){
        if (isAndroid) {
            boolean click  = click(driver, botonPunto, 10);
            System.out.println(click);
        }
    }

    public void clickBotonIgual(){
        if (isAndroid) {
            boolean click  = click(driver, botonIgual, 10);
            System.out.println(click);
        }
    }

    public void clickBotonMas(){
        if (isAndroid) {
            boolean click  = click(driver, botonMas, 10);
            System.out.println(click);
        }
    }

    public void clickBotonMenos(){
        if (isAndroid) {
            boolean click  = click(driver, botonMenos, 10);
            System.out.println(click);
        }
    }

    public void clickBotonMultiplicacion(){
        if (isAndroid) {
            boolean click  = click(driver, botonMultiplicacion, 10);
            System.out.println(click);
        }
    }

    public void clickBotonDivision(){
        if (isAndroid) {
            boolean click  = click(driver, botonDivision, 10);
            System.out.println(click);
        }
    }

    public void clickBotonPorcentaje(){
        if (isAndroid) {
            boolean click  = click(driver, botonPorcentaje, 10);
            System.out.println(click);
        }
    }

    public void clickBotonBorrar(){
        if (isAndroid) {
            boolean click  = click(driver, botonBorrar, 10);
            System.out.println(click);
        }
    }

    public void clickBotonParentesis(){
        if (isAndroid) {
            boolean click  = click(driver, botonParentesis, 10);
            System.out.println(click);
        }
    }

    public String obtenerResultado(){
        return getText(driver, resultado, 10);
    }
}
