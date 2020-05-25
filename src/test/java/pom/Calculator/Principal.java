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

    public boolean clickBotonCero(){
           return click(driver, botonCero, 10);
    }

    public boolean clickBotonUno(){
        return click(driver, botonUno, 10);
    }

    public boolean clickBotonDos(){
        return click(driver, botonDos, 10);
    }

    public boolean clickBotonTres(){
        return click(driver, botonTres, 10);
    }

    public boolean clickBotonCuatro(){
        return click(driver, botonCuatro, 10);
    }

    public boolean clickBotonCinco(){
        return click(driver, botonCinco, 10);
    }

    public boolean clickBotonSeis(){
        return click(driver, botonSeis, 10);
    }

    public boolean clickBotonSiete(){
        return click(driver, botonSiete, 10);
    }

    public boolean clickBotonOcho(){
        return click(driver, botonOcho, 10);
    }

    public boolean clickBotonNueve(){
        return click(driver, botonNueve, 10);
    }

    public boolean clickBotonPunto(){
        return click(driver, botonPunto, 10);
    }

    public boolean clickBotonIgual(){
        return click(driver, botonIgual, 10);
    }

    public boolean clickBotonMas(){
        return click(driver, botonMas, 10);
    }

    public boolean clickBotonMenos(){
        return click(driver, botonMenos, 10);
    }

    public boolean clickBotonMultiplicacion(){
        return click(driver, botonMultiplicacion, 10);
    }

    public boolean clickBotonDivision(){
        return click(driver, botonDivision, 10);
    }

    public boolean clickBotonPorcentaje(){
        return click(driver, botonPorcentaje, 10);
    }

    public boolean clickBotonBorrar(){
        return click(driver, botonBorrar, 10);
    }

    public boolean clickBotonParentesis(){
        return click(driver, botonParentesis, 10);
    }

    public String obtenerResultado(){
        return getText(driver, resultado, 10);
    }
}
