Feature: WebServiceAPI.ResponseXML

  
  
  Scenario: validating Webservice Response XML file
  When we open Webservice Response XML
  When we Give the path for getting the node value
  And give the complete xml path
  Then tag value should be matched with the expected response xml file
  



