Feature: US1001 Nutella arama testi

  Scenario: TC01 Kullanici amazonda Nutella arayabilmeli
    Given kullanici amazon ana sayfaya gider
    Then arama kutusuna Nutella yazip, ENTER tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC02 Kullanici amazonda Samsung aratabilmeli
    Given kullanici amazon ana sayfaya gider
    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And arama sonuclarinin Samsung icerdigini test eder
    And sayfayi kapatir


  Scenario: TC03 kullanici amazonda Java aratabilmesi
    Given kullanici amazon ana sayfaya gider
    Then arama kutusuna Java yazip, ENTER tusuna basar
    And arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

