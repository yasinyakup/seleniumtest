package com.cyberteck.firstweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriver {

  public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    org.openqa.selenium.WebDriver driver = new ChromeDriver();
    driver.get("https://google.com");

    driver.navigate().to("https://cybertekschool.com");
    Thread.sleep(2000);
    driver.navigate().back();

    Thread.sleep(2000);
    driver.navigate().forward();
    driver.navigate().refresh();
    driver.quit();

  }


}
