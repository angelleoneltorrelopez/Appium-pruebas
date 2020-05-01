package auxiliar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.ITestContext;

public class TestBase extends MetodosGenerales {
    private AppiumDriver driver;
    private AppiumDriverLocalService server;
    private String remoteDevice;
    private String platformName;
    private String deviceName;

    protected AppiumDriver getDriver(){
        return driver;
    }

    protected AppiumDriverLocalService getServer(){
        return server;
    }

    @BeforeMethod
    public void configDriver(Object[] parameters){
        server = Driver.getServer();
        server.start();
        switch (platformName){
            case "iOS":
                //logInfo("iOS device");
                String deviceNameIos = (String) parameters[0];
                String platformVersion = (String) parameters[1];
                String udidIos = (String) parameters[2];
                String bundleID = (String) parameters[3];
                driver = Driver.getLocalIosDriver(deviceNameIos,platformVersion,udidIos,bundleID);
            break;
            default:
                //logInfo("Android device");
                String deviceNameAndroid = (String) parameters[0];
                String udidAndroid = (String) parameters[1];
                String appPackage = (String) parameters[2];
                String appActivity = (String) parameters[3];
                driver = Driver.getLocalAndroidDriver(deviceName, udidAndroid, appPackage, appActivity);
            break;
        }
    }

    @AfterMethod
    public void closeDriverAndServer(){
        closeDriver(getDriver());
        closeServer(getServer());
    }

    @DataProvider(name = "Devices")
    public Object [][] availableDevices(ITestContext context){
        Object [][] deviceInfo;
        platformName = context.getCurrentXmlTest().getParameter("Platform");
        deviceName = context.getCurrentXmlTest().getParameter("Device");

        switch (platformName){
            case "iOS":
                switch (deviceName){
                    case "iPhone de linda":
                        deviceInfo = new Object[][]{{"iPhone de linda","12.4","ba1edba16afd1d7ce417dd0990ce407ba681496c","hung.TestApp"}};
                        break;
                    default:
                        deviceInfo = new Object[][]{{"iPhone 7 Simulator","12.4","38FAF5CF-A1A0-4BF0-B05A-656D74372065","me.ahung.TestApp"}};
                        break;
                }
            break;
            default:
                switch (deviceName){
                    case "angel":
                        deviceInfo = new Object[][]{{"angel","RF8MC22QGXB","com.android.chrome","com.google.android.apps.chrome.Main"}};
                    break;
                    default:
                        deviceInfo = new Object[][]{{"Pixel Simulator","xxxx","xxxx","xxxx"}};
                    break;
                }
            break;
        }
        return deviceInfo;
    }



}
