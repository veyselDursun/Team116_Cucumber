
Feature: US1003 Amazonda Parametre olarak urun arama

  Scenario: TC07 Parametre olarak girilen urun arama

    Given kullanici "amazonUrl" ana sayfaya gider
    Then arama kutusuna "Cokokrem" yazip, ENTER tusuna basar
    And arama sonuclarinin "Cokokrem" icerdigini test eder
    And 5 saniye bekler
    And sayfayi kapatir


    # step yazarken sayi kullanilirsa, otomatik olarak parametre kabul eder