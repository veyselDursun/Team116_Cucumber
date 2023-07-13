Feature: US1002 Kullanici Background kullanarak amazonda istedigi aramalari yapar
  # Scenario'lardaki ortak baslangic adimlari icin kullanilir
  Background:
    Given kullanici amazon ana sayfaya gider

  Scenario: TC01 Kullanici amazonda Nutella arayabilmeli
    Then arama kutusuna Nutella yazip, ENTER tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC02 Kullanici amazonda Samsung aratabilmeli
    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And arama sonuclarinin Samsung icerdigini test eder
    And sayfayi kapatir


  Scenario: TC03 kullanici amazonda Java aratabilmesi
    Then arama kutusuna Java yazip, ENTER tusuna basar
    And arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

