$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterForOnlineBanking.feature");
formatter.feature({
  "line": 1,
  "name": "To Test Register for Online Banking functionality",
  "description": "\r\nDescription: \"Purpose of this feature file is to test the Register for online banking functionality with both valid and invalid details.\"",
  "id": "to-test-register-for-online-banking-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Test register for banking functionality as new user with valid data",
  "description": "",
  "id": "to-test-register-for-online-banking-functionality;test-register-for-banking-functionality-as-new-user-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch \"\u003curl\u003e\" on \"\u003cbrowserName\u003e\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Register for Online Banking button on login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "select Hong Leong Credit Card option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Register Now button from first step",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Verification ID on second step",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter any \"\u003cpcNumber\u003e\" in principal card number field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter any \"\u003ctempID\u003e\" in temporary id field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select any \"\u003cidType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter any \"\u003cidNumber\u003e\" in ID number field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \"\u003ccaptcha\u003e\" and click on next button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "validate the user friendly message on the current step",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "to-test-register-for-online-banking-functionality;test-register-for-banking-functionality-as-new-user-with-valid-data;",
  "rows": [
    {
      "cells": [
        "url",
        "browserName",
        "pcNumber",
        "tempID",
        "idType",
        "idNumber",
        "captcha"
      ],
      "line": 20,
      "id": "to-test-register-for-online-banking-functionality;test-register-for-banking-functionality-as-new-user-with-valid-data;;1"
    },
    {
      "cells": [
        "https://s.hongleongconnect.my/rib/app/fo/login",
        "chrome",
        "1234567898765432",
        "1234567892",
        "New IC Number (Green)",
        "123456789123",
        "ebh3c"
      ],
      "line": 21,
      "id": "to-test-register-for-online-banking-functionality;test-register-for-banking-functionality-as-new-user-with-valid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1375198282,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Test register for banking functionality as new user with valid data",
  "description": "",
  "id": "to-test-register-for-online-banking-functionality;test-register-for-banking-functionality-as-new-user-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch \"https://s.hongleongconnect.my/rib/app/fo/login\" on \"chrome\" browser",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Register for Online Banking button on login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "select Hong Leong Credit Card option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Register Now button from first step",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Verification ID on second step",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter any \"1234567898765432\" in principal card number field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter any \"1234567892\" in temporary id field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select any \"New IC Number (Green)\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter any \"123456789123\" in ID number field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \"ebh3c\" and click on next button",
  "matchedColumns": [
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "validate the user friendly message on the current step",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://s.hongleongconnect.my/rib/app/fo/login",
      "offset": 8
    },
    {
      "val": "chrome",
      "offset": 60
    }
  ],
  "location": "steps.launch_on_browser(String,String)"
});
formatter.result({
  "duration": 48478595310,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_on_Register_for_Online_Banking_button_on_login_page()"
});
formatter.result({
  "duration": 10805168286,
  "status": "passed"
});
formatter.match({
  "location": "steps.select_Hong_Leong_Credit_Card_option()"
});
formatter.result({
  "duration": 5195257657,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_on_Register_Now_button_from_first_step()"
});
formatter.result({
  "duration": 3626648671,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_select_Verification_ID_on_second_step()"
});
formatter.result({
  "duration": 5382140136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567898765432",
      "offset": 13
    }
  ],
  "location": "steps.i_enter_any_in_principal_card_number_field(String)"
});
formatter.result({
  "duration": 1996024869,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567892",
      "offset": 13
    }
  ],
  "location": "steps.i_enter_any_in_temporary_id_field(String)"
});
formatter.result({
  "duration": 1481926393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New IC Number (Green)",
      "offset": 14
    }
  ],
  "location": "steps.i_select_any(String)"
});
formatter.result({
  "duration": 3177269496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789123",
      "offset": 13
    }
  ],
  "location": "steps.i_enter_any_in_ID_number_field(String)"
});
formatter.result({
  "duration": 1505130567,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ebh3c",
      "offset": 9
    }
  ],
  "location": "steps.i_enter_and_click_on_next_button(String)"
});
formatter.result({
  "duration": 637783759,
  "status": "passed"
});
formatter.match({
  "location": "steps.validate_the_user_friendly_message_on_the_current_step()"
});
formatter.result({
  "duration": 907781168,
  "status": "passed"
});
formatter.after({
  "duration": 717112924,
  "status": "passed"
});
});