Feature: US1003 Amazonda Parametre olarak urun arama

  Scenario: TC07 Parametre olarak girilen urun arama

    Given kullanici "amazonUrl" ana sayfaya gider
    Then arama kutusuna "Banana" yazip, ENTER tusuna basar
    And arama sonuclarinin "Banana" icerdigini test eder
    And 5 saniye bekler
    And sayfayi kapatir