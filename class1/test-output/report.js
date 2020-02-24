$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featuretest2.feature");
formatter.feature({
  "line": 1,
  "name": "Tags test",
  "description": "",
  "id": "tags-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "exploring cucumber",
  "description": "",
  "id": "tags-test;exploring-cucumber",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "contactus@targetbay",
        "t@rgEdb@y"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click submit",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepfordatadriven.open_the_browser()"
});
formatter.result({
  "duration": 4020596178,
  "status": "passed"
});
formatter.match({
  "location": "Stepfordatadriven.enter_url()"
});
formatter.result({
  "duration": 9872907469,
  "status": "passed"
});
formatter.match({
  "location": "Stepfordatadriven.enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 361145923,
  "status": "passed"
});
formatter.match({
  "location": "Stepfordatadriven.click_submit()"
});
formatter.result({
  "duration": 3084745320,
  "status": "passed"
});
});