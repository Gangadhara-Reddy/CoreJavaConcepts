Feature: ValidatingStockResults

  
  
  Scenario: ValidatingStockResults for each stock
  When we Select Stock from the dropdown
  When we Select date from the dropdown
  And click on review
  Then stock name in the report should be the name we selected from application
  

