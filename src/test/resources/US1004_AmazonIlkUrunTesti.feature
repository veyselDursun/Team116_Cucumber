Feature: US1004 amazonda listeden ilk urunun dogru oldugunu test eder
  @smoke
  Scenario: TC08 ilk urun ismi arattirdigimiz kelimeyi icermeli

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "Nutella" yazip, ENTER tusuna basar
    When ilk urunu tiklar
    Then urun isminde "Nutella" oldugunu test eder
    And sayfayi kapatir

