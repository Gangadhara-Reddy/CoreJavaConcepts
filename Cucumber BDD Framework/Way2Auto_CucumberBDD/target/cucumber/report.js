$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "\r\nIn Order to perform successful login\r\nAs a user\r\nI want to enter correct username and password",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "duration": 360436,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "In order to verify login to facebook",
  "description": "",
  "id": "login;in-order-to-verify-login-to-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user entered the username",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user entered the password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 162136377,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 92777,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_entered_the_username()"
});
formatter.result({
  "duration": 115356,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_entered_the_password()"
});
formatter.result({
  "duration": 91135,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 99756,
  "status": "passed"
});
formatter.after({
  "duration": 114124,
  "status": "passed"
});
formatter.uri("logintoprod.feature");
formatter.feature({
  "line": 2,
  "name": "Login to production",
  "description": "\r\nIn Order to perform successful login\r\nAs a user\r\nI want to enter correct username and password",
  "id": "login-to-production",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@bvt"
    }
  ]
});
formatter.before({
  "duration": 266837,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "In order to verify login to facebook",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user entered the username",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user entered the password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates the captcha image",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 96883,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 85799,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_entered_the_username()"
});
formatter.result({
  "duration": 80873,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_entered_the_password()"
});
formatter.result({
  "duration": 64451,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_validates_the_captcha_image()"
});
formatter.result({
  "duration": 112482,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 59526,
  "status": "passed"
});
formatter.after({
  "duration": 65683,
  "status": "passed"
});
});