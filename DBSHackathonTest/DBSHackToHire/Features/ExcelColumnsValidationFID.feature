Feature: Excel Columns Validation for FID

  
  
  Scenario: Validate Excel Sheet Columns for each stock
    Given User gets the sheet of FID
    And User take the column names from the FID
    When the columns name compared with the expected values
    Then User should be able to have the column names as expected

