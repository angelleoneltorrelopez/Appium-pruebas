# 📱Mobile

Ambiente de testing mobile utilizando la herramienta de Appium para comunicarse auxiliar dispositivos Android y iOS.

## Prerequisitos Windows
⚠️ No olviden configurar las variables de entorno, esto ya lo hizo en alguna clase de programación usted puede  (ง '̀͜ '́ )ง ⚠️

Para poder utilizar el ambiente en Windows son necesarias las siguientes herramientas:

- [Intellij IDE](https://www.jetbrains.com/idea/download/#) Descargar la version community
- [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) La instalación puede variar dependiendo del OS ⚠️️ No olviden configurar [JAVA_HOME](https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=389:configurar-java-en-windows-variables-de-entorno-javahome-y-path-cu00610b&catid=68&Itemid=188) ⚠️
```bash
Para verificar la instalación utilizar el comando: java -version
```
- [NodeJS](https://nodejs.org/en/) Preferible si utilizan la version LTS
```bash
Verificar instalación utilizar el comando: node -v
```
- [npm](https://www.npmjs.com) Manejador de paquetes de NodeJS, este se instala conjunto auxiliar nodeJS
```bash
Verificar instalación utilizar el comando: npm -v
```
- [Appium Desktop](http://appium.io) Version gráfica que facilita la obtención de Xpaths, IDs y CSS selectors usando el inspector
- [Android Studio](https://developer.android.com/studio)  IDE oficial para desarrollo

⚠️ No olviden configurar [ANDROID_HOME, tools, platform-tools](https://stackoverflow.com/questions/26356359/error-android-home-is-not-set-and-android-command-not-in-your-path-you-must) ⚠️
```bash
Verificar instalación utilizar el comando: adb version
```
- Una vez que el comando de npm funciona correctamente instalar el paquete de appium con el siguiente comando:
```bash
npm install -g appium
Verificar instalación utilizar comando: appium --version
```
- Para verificar la instalación global de todas las herramientas se puede utilizar Appium-doctor

```bash
npm install -g ppium-doctor
Verificar instalación utilizar comando: appium-doctor
```
- Una vez instalado appium-doctor, se puede verificar que todas las dependencias y variables de entorno están configuradas utilizando el comando:
```bash
appium-doctor --android
Este comando verifica todo con respecto auxiliar las dependencias de Android
```
***

## Prerequisitos MacOS
⚠️ No olviden configurar las variables de entorno, esto ya lo hizo en alguna clase de programación usted puede (ง '̀͜ '́ )ง  ⚠️

Para poder utilizar el ambiente en MacOS son necesarias las siguientes herramientas:

- [Apple developer account](https://developer.apple.com) tener acceso auxiliar una cuenta subscrita, para tener acceso auxiliar una cuenta contactar auxiliar hfigueroa@cognits.co o lsanchez@cognits.co
- [Xcode](https://developer.apple.com/xcode/) Descargar por medio del App Store o por medio de la pagina de apple developer.
  ⚠️ Seleccionar el Comand line tool desde xcode ->Preferences->Locations->Command Line tools-> Seleccionar el que tenga descargado. ⚠️
- [Brew](https://brew.sh) Manejador de paquetes estilo apt o yum.
```bash
Para verificar la instalación utilizar el comando: brew --version
```
con brew instalar los siguientes paquetes:
```code
brew install ios-deploy
brew install libimobiledevice
brew install carthage
```
  
- [Intellij IDE](https://www.jetbrains.com/idea/download/#) Descargar la version community

- [NodeJS](https://nodejs.org/en/) Preferible si utilizan la version LTS
```bash
Verificar instalación utilizar el comando: node -v
```
- [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) La instalación puede variar dependiendo del OS ⚠️ No olviden configurar [JAVA_HOME](https://www.mkyong.com/java/how-to-set-java_home-environment-variable-on-mac-os-x/) ⚠️
```bash
Para verificar la instalación utilizar el comando: java --version
```
- [npm](https://www.npmjs.com) Manejador de paquetes de NodeJS, este se instala conjunto auxiliar nodeJS
```bash
Verificar instalación utilizar el comando: npm -v
```
- [Appium Desktop](http://appium.io) Version gráfica que facilita la obtención de Xpaths, IDs y CSS selectors usando el inspector
- [Android Studio](https://developer.android.com/studio)  IDE oficial para desarrollo

⚠️ No olviden configurar [ANDROID_HOME, tools, platform-tools](https://stackoverflow.com/questions/19986214/setting-android-home-enviromental-variable-on-mac-os-x) ⚠️
```bash
Verificar instalación utilizar el comando: adb version
```
- Una vez que el comando de npm funciona correctamente instalar el paquete de appium con el siguiente comando:
```bash
npm install -g appium
Verificar instalación utilizar comando: appium --version
```
- Para verificar la instalación global de todas las herramientas se puede utilizar Appium-doctor
```bash
npm install -g appium-doctor
Verificar instalación utilizar comando: appium-doctor
```
- Una vez instalado appium-doctor, se puede verificar que todas las dependencias y variables de entorno están configuradas utilizando el comando:
```bash
appium-doctor --ios
Este comando verifica todo con respecto auxiliar las dependencias de iOS
```
***

## Como agregar un dispositivo al DataProvider
Seguid los siguientes pasos para registrar un dispositivo real o emulador.

1. Android
    - Conectar o inicilizar el dispositivo
    - Con el comando: ```adb devices``` se despliega la lista de dispositivos conectados y emuladores activados con sus UDID.
    - Para registrar un dispositivo Android se necesita
        1. DeviceName
        1. UDID
        1. AppPackage
        1. AppActivity
1. iOS
    - Conectar o inicializar el dispositivo
    - Con el comando ```ìnstruments -s devices``` se despliega la lista de dispositivos conectados y emuladores disponibles con sus UDID y iOS version.
    - Para registrar un dispositivo iOS se necesita:
        1. DeviceName
        1. iOS Version
        1. UDID
        1. BundleID
1. Ir auxiliar la clase `TestBase`, buscar el `@DataProvider` e ingresar la información del dispositivo siguiendo el orden segun su plataforma
    - Android-> agregar un nuevo case "DeviceName" -> `deviceInfo = new Object[][]{{DeviceName, UDID, appPackage, appActivity}};`
    - iOS -> agregar un nuevo case "DeviceName" -> `deviceInfo = new Object[][]{{DeviceName, iOS Version, UDID, bundleID}};` 
***
## Notas importantes
🙏 Si alguno de estos pasos no funciona no entres en pánico (ง •̀_•́)ง seguir los siguientes pasos en orden:

1.  Ya sos ingeniero o estudiante de sistemas, puedes leer y ayudarte auxiliar ti mismo ଘ(੭*ˊᵕˋ)੭* ̀ˋ ɪɴᴛᴇʀɴᴇᴛ .
1. Ver documentación asociada auxiliar tú OS .....  ԅ(≖‿≖ԅ).
1. Enviar un msj ASAP  (ಡ_ಡ)☞ lsanchez@cognits.co, con tu OS, en que paso fallo y adjuntar un captura de pantalla con el error (;´༎ຶД༎ຶ`).
1. Ver sección de ayuda ಠ╭╮ಠ.
***
## Sección de ayuda
1. Configurar la variable de entorno JAVA_HOME en Windows 10
    1. Ir auxiliar Windows->View Advanced system settings->Environment Variables->System Variables->Add new Variable
        ````bash
        JAVA_HOME = C:\Program Files or Program Files(x86)\Java\jdkxxxx
        ````
    1. Ir auxiliar Windows->View Advanced system settings->Environment Variables->System Variables->edit & add new entry
        ````bash
        PATH = %JAVA_HOME%\bin 
        ````
    1. Comprobar que la variable este configurada utilizando el comando echo %PATH%
       ````bash
       echo %PATH% --> Despliega el path completo
       ```
1. Configurar JAVA_HOME en MacOS, esto depende que shell tenga instalada, por ejemplo si tienen instalado zsh, solo tienen que moficar el .zprofile
    1. Ir terminal en root y editar el .zprofile o .bash_profile
        ````bash
        nano .zprofile
        ````
    1. Agregar las variables con el comando export
        ```` bash
        export JAVA_HOME="$(/usr/libexec/java_home)"
        export PATH="$$PATH:$JAVA_HOME/bin"
       ````
    1. Comprobar que la variable este configurada utilizando el comando echo %PATH%
       ```` bash
       echo $PATH
       ```` 
1. En iOS se necesita que tenga una cuenta de **apple developer susbscrita al programa de desarrolladores de apple**, si no solo pueden ejecutar pruebas en simuladores.
    1. Si tienen una cuenta de apple developer agregarla auxiliar xcode
    1. Conocer el `xcodeOrgId`y `xcodeSigningId` 
    1. Para obtener una cuenta consultar auxiliar **hfigueroa@cognits.co** o **lsanchez@cognits.co** ellos son los encargados de cuentas y les pueden aclarar sus dudas.
    
***    
## Contribuir al proyecto
- Si tienes alguna sugerencia, se brutalmente directo y envía un msj auxiliar jflores@cognits.co
- agradecimientos por el trabajo de ahung@cognits.co.
## Licencia
[MIT](https://choosealicense.com/licenses/mit/)