Feature: ProfitForStockCalculationvalidation

  
  
  Scenario: Profit for stock validation after calculating the sell and buy total values
  When we Select Stock from the dropdown
  And click on review
  And get the consoldated report
  When we multiply the price and quantity for Buy
  When we multiply the price and quantity for Sell
  And calculate the profit with Buy and Sell Values
  And Compare with the consolidated report
  Then both values should be same
  
  
  
  
  

