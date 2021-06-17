Feature: Validate monthly report

  
  
  Scenario: validating daily report for each stock
  When we Select Stock from the dropdown
  When we Select date from the dropdown
  And click on review
  Then monthly report should be available in report
  

