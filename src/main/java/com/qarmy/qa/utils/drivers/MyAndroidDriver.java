package com.qarmy.qa.utils.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION;

public class MyAndroidDriver {
    private static AppiumDriver<MobileElement> driver;

    public static MyAndroidDriver hisAndroidDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(PLATFORM_VERSION, "10");
        capabilities.setCapability("deviceName", "1f9bb0cb0408");
        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("app", "C:\\Repositorio\\estudios\\JavaSEBasicoAvanzado\\JavaSEBasicoAvanzado-31.MakeReportAllEntities\\JavaSEBasicoAvanzado-31.MakeReportAllEntities\\sauce_lab_mobile\\src\\test\\resources\\app\\sauceLab.apk");

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return new MyAndroidDriver();
    }

    public static MyAndroidDriver remoteFarmDriver() throws MalformedURLException {
        String kobitonServerUrl = "https://elvis.perez:747580bf-980a-4cf9-8499-5c4fb9b2fa32@api.kobiton.com/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
// The generated session will be visible to you only.
        capabilities.setCapability("sessionName", "Automation test session");
        capabilities.setCapability("sessionDescription", "");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("deviceGroup", "KOBITON");
// For deviceName, platformVersion Kobiton supports wildcard
// character *, with 3 formats: *text, text* and *text*
// If there is no *, Kobiton will match the exact text provided
        capabilities.setCapability("deviceName", "Galaxy S7");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("noReset", true);


        return new MyAndroidDriver();
    }

    public RemoteWebDriver enLaApp() {
        return driver;
    }

}
