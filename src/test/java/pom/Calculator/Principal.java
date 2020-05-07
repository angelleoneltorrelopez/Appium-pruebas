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
            click(driver, botonCero, 10);
        }
    }

    public void clickBotonUno(){
        if (isAndroid) {
            click(driver, botonUno, 10);
        }
    }

    public void clickBotonDos(){
        if (isAndroid) {
            click(driver, botonDos, 10);
        }
    }

    public void clickBotonTres(){
        if (isAndroid) {
            click(driver, botonTres, 10);
        }
    }

    public void clickBotonCuatro(){
        if (isAndroid) {
            click(driver, botonCuatro, 10);
        }
    }

    public void clickBotonCinco(){
        if (isAndroid) {
            click(driver, botonCinco, 10);
        }
    }

    public void clickBotonSeis(){
        if (isAndroid) {
            click(driver, botonSeis, 10);
        }
    }

    public void clickBotonSiete(){
        if (isAndroid) {
            click(driver, botonSiete, 10);
        }
    }

    public void clickBotonOcho(){
        if (isAndroid) {
            click(driver, botonOcho, 10);
        }
    }

    public void clickBotonNueve(){
        if (isAndroid) {
            click(driver, botonNueve, 10);
        }
    }

    public void clickBotonPunto(){
        if (isAndroid) {
            click(driver, botonPunto, 10);
        }
    }

    public void clickBotonIgual(){
        if (isAndroid) {
            click(driver, botonIgual, 10);
        }
    }

    public void clickBotonMas(){
        if (isAndroid) {
            click(driver, botonMas, 10);
        }
    }

    public void clickBotonMenos(){
        if (isAndroid) {
            click(driver, botonMenos, 10);
        }
    }

    public void clickBotonMultiplicacion(){
        if (isAndroid) {
            click(driver, botonMultiplicacion, 10);
        }
    }

    public void clickBotonDivision(){
        if (isAndroid) {
            click(driver, botonDivision, 10);
        }
    }

    public void clickBotonPorcentaje(){
        if (isAndroid) {
            click(driver, botonPorcentaje, 10);
        }
    }

    public void clickBotonBorrar(){
        if (isAndroid) {
            click(driver, botonBorrar, 10);
        }
    }

    public void clickBotonParentesis(){
        if (isAndroid) {
            click(driver, botonParentesis, 10);
        }
    }

    public String obtenerResultado(){
        return getText(driver, resultado, 10);
    }
}
