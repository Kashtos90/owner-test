package config;

public class WebDriverConfig {

    public String getBaseUrl() {
        return "https://github.com";
    }

    public Browser getBrowser() {
        return Browser.CHROME;
    }

    public boolean isRemote() {
        return false;
    }

    public String getRemoteUrl() {
        return "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}
