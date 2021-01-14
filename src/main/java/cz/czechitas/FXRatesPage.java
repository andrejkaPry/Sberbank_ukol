package cz.czechitas;

import org.openqa.selenium.*;

public class FXRatesPage {

    private WebDriver driver;

    public FXRatesPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void GetBuyingPrice(String currency) {

        if (currency == "AUD") {

            WebElement buyingPriceAud = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[2]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceAud.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "CAD") {

            WebElement buyingPriceCad = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[3]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceCad.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "DKK") {

            WebElement buyingPriceDkk = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[4]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceDkk.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "EUR") {

            WebElement buyingPriceEur = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[5]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceEur.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "GBP") {

            WebElement buyingPriceGbp = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[6]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceGbp.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "HRK") {

            WebElement buyingPriceHrk = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[7]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceHrk.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "HUF") {

            WebElement buyingPriceHuf = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[8]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceHuf.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault / 100 + " CZK.");

        } else if (currency == "CHF") {

            WebElement buyingPriceChf = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[9]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceChf.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "JPY") {

            WebElement buyingPriceJpy = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[10]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceJpy.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault / 100 + " CZK.");

        } else if (currency == "NOK") {

            WebElement buyingPriceNok = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[11]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceNok.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "PLN") {

            WebElement buyingPricePln = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[12]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPricePln.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "RON") {

            WebElement buyingPriceRon = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[13]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceRon.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "RUB") {

            WebElement buyingPriceRub = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[14]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceRub.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "SEK") {

            WebElement buyingPriceSek = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[15]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceSek.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "TRY") {

            WebElement buyingPriceTry = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[16]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceTry.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else if (currency == "USD") {

            WebElement buyingPriceUsd = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[17]/td[1]/span[1]"));

            double resault = Double.parseDouble(buyingPriceUsd.getText().replace(",", ".").replaceAll("[^0-9.]", ""));

            System.out.println("Actual buying price is " + resault + " CZK.");

        } else {

            System.out.println("You entered invalid currency");
        }

    }

}
