package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import capabilities.Load_capabilities;

import java.io.File;

public enum IOSDevicesCapabilities {

    IPHONE_8("resources/capabilities/iphone-8-dev.json"),
    IPHONE_FISICO("capabilities/iphone-fisico.json");

    private String path;

    IOSDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getIOSCapabilitiesFromPlataform() {
        DesiredCapabilities iosCapabilities =  Load_capabilities.pathToDesiredCapabilitites(this.path);
        iosCapabilities.setCapability("app", new File("resources/apps/TestApp.app").getAbsolutePath());
        return iosCapabilities;
    }

    public static void showAvaliableIphoneDevices() {
        System.out.println("======= IOS DEVICES ====== ");
        for (IOSDevicesCapabilities iosDevicesCapabilities : IOSDevicesCapabilities.values()) {
            System.out.println(iosDevicesCapabilities.name());
        }
    }
}
