Feature:login


  @validenter
  Scenario: Only authorized users should be able to login to the application.
    Given the user is on the login page
    When the user enters valid credentials
    And click on sing in button
    Then the user shoul be login

  @notvalidenter
  Scenario: unauthorized user should not be login
    Given the user is on the login page
    When the user enter not valid credentials
    And click on sing in button
    Then "Login and/or password are wrong." must be appear

