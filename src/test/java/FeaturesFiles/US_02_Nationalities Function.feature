Feature: Nationalities Page Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click Login Button
    Then  User should login successfully

  Scenario: Create, Edit and Delete new Nationality

    Given Navigate to Nationalities Page
      | setupOne        |
      | parameters      |
      | nationalities   |

    Then Create a Nationality
      | inputName       | japanes   |

    And Check the succesfully message



    Given Edit the same Nationality

      | inputSearchName | japanes   |
      | inputName       | aborijins |

    And Check the succesfully message



    When Delete the edited Nationality
      | inputSearchName | aborijins |

    And Check the succesfully message

    Given Create Nationality that exist
      | inputName       | Eskimos1  |

    And Check the not succesfully message