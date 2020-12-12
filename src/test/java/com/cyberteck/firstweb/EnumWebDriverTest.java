package com.cyberteck.firstweb;

import com.cyberteck.utilities.BrowserType;
import com.cyberteck.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class EnumWebDriverTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver(BrowserType.IE);
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.close();
    }
}
