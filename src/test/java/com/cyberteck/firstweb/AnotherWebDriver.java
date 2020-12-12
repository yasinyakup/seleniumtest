package com.cyberteck.firstweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();

        System.out.println("title = " + title);
        System.out.println("currentUrl = " + currentUrl);

        driver.navigate().to("https://google.com");

        String title1 = driver.getTitle();
        String currentUrl1 = driver.getCurrentUrl();
        driver.get("http://facebook.com");

        System.out.println("title1 = " + title1);
        System.out.println("currentUrl1 = " + currentUrl1);

        Thread.sleep(3000);

        driver.close();
        driver = new ChromeDriver();
        driver.get("https://google.com");

    }
}
