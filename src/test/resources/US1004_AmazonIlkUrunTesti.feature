Feature: US1004 amazonda listeden ilk urunun dogru oldugunu test eder
  @wip
  Scenario: TC08 ilk urun ismi arattirdigimiz kelimeyi icermeli

    Given kullanici "amazonUrl" ana sayfaya gider
    Then arama kutusuna "Nutella" yazip, ENTER tusuna basar
    When ilk urunu tiklar
    Then urun isminde "Nutella" oldugunu test eder
    And sayfayi kapatir

