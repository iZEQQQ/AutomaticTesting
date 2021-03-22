package edu.pjatk.jgorny;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class StrawPoolTest {
    WebDriver driver;

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void creatingPool() {
        driver.get("https://www.strawpoll.me/");
        driver.manage().window().setSize(new Dimension(960, 1053));
        driver.findElement(By.cssSelector("#form-field-content-editable > div")).click();
        driver.findElement(By.id("field-options-1-option")).click();
        driver.findElement(By.id("field-options-1-option")).sendKeys("tak");
        driver.findElement(By.name("options-option-2")).click();
        driver.findElement(By.name("options-option-2")).sendKeys("nie");
        {
            WebElement dropdown = driver.findElement(By.id("field-duplication-setting"));
            dropdown.findElement(By.xpath("//option[. = 'Browser Cookie Duplication Checking']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("field-duplication-setting"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("field-duplication-setting"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("field-duplication-setting"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("field-duplication-setting")).click();
        driver.findElement(By.id("create-button")).click();
        driver.findElement(By.id("field-options-tak")).click();
        driver.findElement(By.cssSelector("footer > button:nth-child(1)")).click();
    }
}
