package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config = new WebDriverConfig();
    @Override
    public WebDriver get() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        return driver;
    }
}
