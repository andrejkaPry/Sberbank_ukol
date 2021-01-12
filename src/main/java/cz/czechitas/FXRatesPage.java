package cz.czechitas;

import org.openqa.selenium.*;

public class FXRatesPage {

    private WebDriver driver;

    public FXRatesPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void GetBuyingPriceOfuro() {

        WebElement buyingPriceEuro = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[5]/td[1]/span[1]"));

        double resault = Double.parseDouble(buyingPriceEuro.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

        System.out.println("Cena nakupky je " + resault + " CZK.");

    }

}
