$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "To validate login the Adactin Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the login page with valid credientials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in the Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user to enter the valid username and password \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user to login the page",
  "keyword": "And "
});
formatter.step({
  "name": "The user navigation to the next page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Anisha213",
        "@2101ana"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the login page with valid credientials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in the Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_in_the_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user to enter the valid username and password \"Anisha213\" and \"@2101ana\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_to_enter_the_valid_username_and_password_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user to login the page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_to_login_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigation to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_navigation_to_the_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});