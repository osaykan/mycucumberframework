@googlesearch @first
Feature: Google search
  #Before özelligi icin ayni adimi yukari almis olduk.Her ikisindede calisacak
  Background: User is on the google page
    Given user is in the google page

  @iphone
  Scenario: user searches iphone in google
    #Given user is in the google page
    And user searches iphone
    Then verify the result has iphone

    @nokia
  Scenario: user searches nokia in google
    #Given user is in the google page
    And user searches nokia
    Then verify the result has nokia



    #Scenario: kullanici google'da iphone arar
  #Given kullanici google sayfasinda
  #And  kullanici iphone arar
  #Then sonucta iphone oldugunu dogrula