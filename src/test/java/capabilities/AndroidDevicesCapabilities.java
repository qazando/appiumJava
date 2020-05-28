package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import capabilities.Load_capabilities;

import java.io.File;

public enum AndroidDevicesCapabilities {


    ANDROID_OREO("resources/capabilities/android-oreo.json"),
    ANDROID_FISICO("resources/capabilities/android-fisico.json");


    private String path;

    AndroidDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getAndroidCapabilitiesFromPlataform() {
        DesiredCapabilities androidCapabilities = Load_capabilities.pathToDesiredCapabilitites(this.path);
        androidCapabilities.setCapability("app", new File("resources/apps/app-debug.apk").getAbsolutePath());
        return androidCapabilities;
    }

    public static void showAvaliableAndroidDevices() {
        System.out.println("======= ANDROID DEVICES ====== ");
        for (AndroidDevicesCapabilities androidDevicesCapabilities : AndroidDevicesCapabilities.values()) {
            System.out.println(androidDevicesCapabilities.name());
        }
    }
}
