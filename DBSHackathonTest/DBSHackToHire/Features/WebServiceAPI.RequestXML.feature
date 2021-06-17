Feature: WebServiceAPI.RequestXML

  
  
  Scenario: validating Webservice Request XML file
  When we open Webservice Request XML
  When we Give the path for getting the node value
  And give the complete xml path
  Then tag value should be matched with the expected request xml file
  



