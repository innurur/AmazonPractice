Feature: User is using login page to open Amazon dashboard

  Background:
    Given User is on "www.amazon.com" page


  Scenario: User enter login and password
    When User navigate to sign in button and click
    And User enter "<username>" or "<phone number>" or "<email address>"
    And User click continue button
    And User enter the "<password>" in password box
    And User click Sign-in button
    Then User should able to see homepage with the "Hello,Inara" message

      | phone number | email address     | login  |
      | 12242178947  | ya-znayka@mail.ru | blabla |


  @search
  Scenario: Practicing dropdown
    When User click All button and select "Baby" and click
    And User type "bottle" and click search button
    Then User should see the "results" of "bottle"
