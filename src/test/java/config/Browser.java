package config;

import org.aeonbits.owner.ConfigFactory;

public class Browser {

    public static WebDriverConfig webConfig = (WebDriverConfig) ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !webConfig.remoteUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !webConfig.videoStorage().equals("");
    }

    public static String browserName() {
        return webConfig.browserName();
    }
}
