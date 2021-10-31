package ru.koleson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

//        driver.get("https://www.avito.ru/rostov-na-donu/transport?cd=1");

//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("input[@area-label='Найти в Google']"))));

//        element = driver.findElement(By.xpath("//a[@title=\"BMW\"][1]"));
//        element.click();
//        WebElement element1 = driver.findElement(By.xpath("//div[@class='page-title-root-RSzXm js-page-title']"));
//        WebElement element2 = driver.findElement(By.cssSelector(".popular-rubricator-count-mgXDM"));
//        System.out.println(element1.getText());
//        System.out.println(element2.getText());
//        driver.get("https://dev.by/");
//        WebElement element3 = driver.findElement(By.xpath("//a[text()='Вход']"));
//        String par3 = element3.getCssValue("transition-property");
//        System.out.println(par3);
//        driver.get("https://www.google.com/");
//
//        WebElement element4 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//
//        element4.sendKeys("Selenium", Keys.INSERT);
//        element4.sendKeys(" 4", Keys.INSERT);
//        element4.sendKeys(" Java Developer");





        try {
            driver.get("http://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element5 = driver.findElement(By.id("draggable"));
            WebElement element6 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.moveToElement(element5)
                    .clickAndHold()
                    .moveToElement(element6)
                    .release()
                    .build()
                    .perform();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }


//        WebElement input = driver.findElement(By.id("js-download-hero"));
//        WebElement inputs = driver.findElements(By.xpath("input[@area-label='Мне повезёт!']"));

//        input.click();


        //Convenient
//        driver.get("https://selenium.dev");

        //Longer way
//        driver.navigate().to("https://selenium.dev");
    }
}
