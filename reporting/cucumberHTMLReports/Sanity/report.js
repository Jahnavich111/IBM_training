$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/feature/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in search page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cProduct\u003e product",
  "keyword": "When "
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "Product \u003cProduct\u003e should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Product"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "Macbook Pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters iPhone product",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Product iPhone should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Verify login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters Macbook Pro product",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Product Macbook Pro should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});