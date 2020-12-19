package com.cyberteck.firstweb;

import com.cyberteck.utilities.BrowserType;
import com.cyberteck.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnumWebDriverTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver(BrowserType.CHROME);
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement webElement = driver.findElement(By.name("email"));
        webElement.sendKeys("yasinyakup@test.com");
        String firstPage = driver.getCurrentUrl();
        System.out.println("firstPage = " + firstPage);

        Thread.sleep(3000);

        WebElement webElement1 = driver.findElement(By.id("form_submit"));
        webElement1.click();

        String secondPage = driver.getCurrentUrl();
        System.out.println("secondPage = " + secondPage);
//        Thread.sleep(2000);
//        driver.close();

        assert (firstPage.equals(secondPage));
    }
}
