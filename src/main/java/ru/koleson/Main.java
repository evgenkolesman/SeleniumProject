package ru.koleson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.avito.ru/rostov-na-donu/transport?cd=1");

//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("input[@area-label='Найти в Google']"))));

        WebElement input = driver.findElement(By.xpath("//a[@href='/rostov-na-donu/avtomobili/audi-ASgBAgICAUTgtg3elyg?cd=1']"));
//        WebElement input = driver.findElement(By.id("js-download-hero"));
//        WebElement inputs = driver.findElements(By.xpath("input[@area-label='Мне повезёт!']"));

        input.click();


        //Convenient
//        driver.get("https://selenium.dev");

        //Longer way
//        driver.navigate().to("https://selenium.dev");
    }
}
