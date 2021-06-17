Feature: To Test Register for Online Banking functionality

Description: "Purpose of this feature file is to test the Register for online banking functionality with both valid and invalid details."

@smoke
Scenario Outline: Test register for banking functionality as new user with valid data
	Given Launch "<url>" on "<browserName>" browser 
	When I click on Register for Online Banking button on login page
	And select Hong Leong Credit Card option 
	And I click on Register Now button from first step
	When I select Verification ID on second step
	And I enter any "<pcNumber>" in principal card number field  
	And I enter any "<tempID>" in temporary id field
	And I select any "<idType>" 
	And I enter any "<idNumber>" in ID number field
	When I enter "<captcha>" and click on next button
	Then validate the user friendly message on the current step 
	
	Examples:
	|url|browserName|pcNumber|tempID|idType|idNumber|captcha|
	|https://s.hongleongconnect.my/rib/app/fo/login|chrome|1234567898765432|1234567892|New IC Number (Green)|123456789123|ebh3c|
	
@regression
Scenario Outline: Test register for banking functionality as new user with In-valid data provided for PCN,Temperory ID and Id number. 
	Given Launch "<url>" on "<browserName>" browser 
	When I click on Register for Online Banking button on login page
	And select Hong Leong Credit Card option 
	And I click on Register Now button from first step
	When I select Verification ID on second step
	And I enter any "<pcNumber>" in principal card number field  
	And I enter any "<tempID>" in temporary id field
	And I select any "<idType>" 
	And I enter any "<idNumber>" in ID number field
	When I enter "<captcha>" and click on next button
	Then I should be able to find the user friendly message 
	
	Examples:
	|url|browserName|pcNumber|tempID|idType|idNumber|captcha|
	|https://s.hongleongconnect.my/rib/app/fo/login|chrome|123456789432|1267892|New IC Number (Green)|123789123|ebh3c|
	|https://s.hongleongconnect.my/rib/app/fo/login|chrome|dsfsdf|12678fd92|New IC Number (Green)|12sdasdasd9123|ebh3c|
	