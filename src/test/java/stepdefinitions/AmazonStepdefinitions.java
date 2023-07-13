package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon ana sayfaya gider")
    public void kullanici_amazon_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("arama kutusuna Nutella yazip, ENTER tusuna basar")
    public void arama_kutusuna_nutella_yazip_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


    }

    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expected = "Nutella";
        String actualSonuc =

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }
}
