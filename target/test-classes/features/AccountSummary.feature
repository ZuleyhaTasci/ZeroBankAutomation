Feature: Account summary


  @AccountSummary
  Scenario: Account summary page should have the title Zero – Account summary.
    Given the user is on the login page
    When the user enters valid credentials
    And click on sing in button
    Then the title supposed to be "Zero - Account Summary"
    Then following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then Account table must have
      | Account     |
      | Credit Card |
      | Balance     |
