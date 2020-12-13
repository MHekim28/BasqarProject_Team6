Feature: Notifications Page functionality
  Background:
    Given Navigate to basqar

    When Enter username and password and click Login Button

    Then User should login successfully

    Scenario: User should be able to use Notifications Page functionality (Messaging)

      And Click on Elements
        | messagingButton     |
        | notificationsButton |
        | addButton           |

      When Create a new Notification

      Then Success message should be displayed

      And Click on Elements
        | messagingButton     |
        | notificationsButton |

      Then Search for the name you created and verify it matches the result.

      And Edit the Notification

      Then Success message should be displayed

      And Click on Elements
        | messagingButton     |
        | notificationsButton |

      And Delete the Notification

      Then Success message should be displayed