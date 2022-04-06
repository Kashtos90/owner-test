package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${typeProperties}.properties")
public interface WebDriverConfig extends Config{

    @Config.Key("browserName")
    String browserName();

    @Config.Key("browserVersion")
    String browserVersion();

    @Config.Key("browserSize")
    String browserSize();

    @Config.Key("remoteUrl")
    String remoteUrl();

    @Config.Key("videoStorage")
    String videoStorage();

    @Config.Key("timeoutVideoAttach")
    int timeoutVideoAttach();

    @Config.Key("timeout")
    int timeout();
}
