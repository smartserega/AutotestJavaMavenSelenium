package ru.deliveryClab;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ПК\\Downloads\\chromedriver\\win32\\2.35\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.delivery-club.ru/" );

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("«Delivery Club» — круглосуточная доставка из любимых ресторанов города"));

        driver.quit();


    }




}
