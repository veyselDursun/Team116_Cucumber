package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }

    @Then("arama kutusuna Samsung yazip, ENTER tusuna basar")
    public void aramaKutusunaSamsungYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Samsung" + Keys.ENTER);
    }

    @And("arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String expectedIcerik = "Samsung";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

    @Then("arama kutusuna Java yazip, ENTER tusuna basar")
    public void aramaKutusunaJavaYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);

    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedIcerik = "Java";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

    @Then("arama kutusuna {string} yazip, ENTER tusuna basar")
    public void aramaKutusunaYazipENTERTusunaBasar(String aranacakUrun) {
        amazonPage.aramaKutusu.sendKeys(aranacakUrun + Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String aranacakIcerik) {
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(aranacakIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklemeSuresi) {

        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
    }

    @Given("kullanici {string} ana sayfaya gider")
    public void kullaniciAnaSayfayaGider(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty("istenenUrl"));
    }
}
