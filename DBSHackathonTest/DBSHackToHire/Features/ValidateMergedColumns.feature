Feature: Validate Merged Columns

  
  
  Scenario: Validate the merged columns for each stock after consolidation 
  When we Select Stock from the dropdown
  When we Select Date from the dropdown
  And click on review
  Then the columns should be the same columns which are there in each sheet.
  
  

