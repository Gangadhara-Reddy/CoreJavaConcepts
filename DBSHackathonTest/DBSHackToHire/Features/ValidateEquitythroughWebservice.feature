Feature: Validate equity through webservice

  
  
  Scenario: validating Webservice Response XML file with equity
  When we give the Get Request URL
  When we Give the equity as ds and date as 12/12/2019
  And send the request to the service
  Then Response xml file should have the ds value passed for the xml file
  



