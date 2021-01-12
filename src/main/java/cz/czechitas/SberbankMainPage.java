package cz.czechitas;

import org.openqa.selenium.*;

public class SberbankMainPage {

    private WebDriver driver;

    public SberbankMainPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void ClickOnFxRatesButton() throws InterruptedException {

        WebElement fxRates = driver.findElement(By.xpath("//a[contains(text(),'Kurzovní lístek')]"));

        Thread.sleep(2000);

        fxRates.click();

        Thread.sleep(2000);

    }



}
