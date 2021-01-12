package cz.czechitas;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FXRatesTest {

    private WebDriver driver;

    @Before

    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", "C://Java-Training//Selenium//chromedriver_win32 (1)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.sberbank.cz/cs-cz/");
    }

    @Test

    public void BuyingPriceOfEuro() throws InterruptedException {

        SberbankMainPage sberbankMainPage = new SberbankMainPage(driver);
        sberbankMainPage.ClickOnFxRatesButton();
        Thread.sleep(2000);

        FXRatesPage fxRatesPage = new FXRatesPage(driver);
        fxRatesPage.GetBuyingPriceOfuro();
        Thread.sleep(2000);
    }

    @After

    public void CleanUp(){
        driver.quit();
    }

}
