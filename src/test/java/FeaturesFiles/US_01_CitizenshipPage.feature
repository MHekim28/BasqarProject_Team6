Feature: Citizenship page functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

    Scenario: A Citizenship create,edit and delete

    Given Navigate to Citizenhip Page
      |setupOne|
      |parameters|
      |citizenships|

    When  Create a Citizenship
      | inputName      | insanlik |
      | inputshortname | ins      |




      And Check  control whether succesfully message displayed

    And Edit the same Citizenship

      | inputSearchName    | insanlik    |
      | inputSearchShrtNam | ins         |
      | inputName          | Muslumanlik |
      | inputshortname     | Muslim      |




      And Check  control whether succesfully message displayed

    And Delete the edited Citizenship
      |inputSearchName|Muslumanlik|
      |inputSearchShrtNam|Muslim|




      And Check  control whether succesfully message displayed