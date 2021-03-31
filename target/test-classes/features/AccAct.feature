Feature: Account Activity


  @AccountActivity
  Scenario: Account Activity page should have the title Zero - Account activity

    Given the user is on the login page
    When the user enters valid credentials
    And click on sing in button
    Then click Account Activity button
    Then Account drop down should  "Savings"
    Then Account drop down should have following
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then Transactions table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |

