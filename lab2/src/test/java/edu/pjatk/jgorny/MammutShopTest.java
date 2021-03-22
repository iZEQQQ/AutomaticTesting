package edu.pjatk.jgorny;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class MammutShopTest {
    private WebDriver driver;


    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void addingToBasket() {
        driver.get("https://mmtsklep.pl/");
        driver.manage().window().setSize(new Dimension(960, 1053));
        driver.findElement(By.linkText("EIGER EXTREME")).click();
        driver.findElement(By.cssSelector(".product-small:nth-child(1) .attachment-woocommerce_thumbnail")).click();
        {
            WebElement dropdown = driver.findElement(By.id("pa_rozmiar-obuwia"));
            dropdown.findElement(By.xpath("//option[. = 'UK 8 ( EU 42 )']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("pa_rozmiar-obuwia"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("pa_rozmiar-obuwia"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("pa_rozmiar-obuwia"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("pa_rozmiar-obuwia")).click();
        driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
        driver.findElement(By.cssSelector(".wc-forward:nth-child(1)")).click();
    }
}
