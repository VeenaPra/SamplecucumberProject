$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Applicationform.feature");
formatter.feature({
  "name": "Fill the application form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should give valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" in the firstname input",
  "keyword": "When "
});
formatter.step({
  "name": "User click gender button",
  "keyword": "And "
});
formatter.step({
  "name": "User enters  \"\u003cemailaddress\u003e\" in the email input",
  "keyword": "And "
});
formatter.step({
  "name": "User enters  \"\u003cmobilNo\u003e\" in the MobilNo input",
  "keyword": "And "
});
formatter.step({
  "name": "User enters  \"\u003cDateofbirth\u003e\" in the Dateofbirth input",
  "keyword": "And "
});
formatter.step({
  "name": "User click hobbies button",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccurrent address\u003e\" in the address input",
  "keyword": "And "
});
formatter.step({
  "name": "User select state in dropdown",
  "keyword": "And "
});
formatter.step({
  "name": "User select city in dropdown",
  "keyword": "And "
});
formatter.step({
  "name": "User click the Submit button",
  "keyword": "And "
});
formatter.step({
  "name": "User expect the registration to form",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "emailaddress",
        "mobilNo",
        "Dateofbirth",
        "subject",
        "current address"
      ]
    },
    {
      "cells": [
        "Veena",
        "Pradeep",
        "veenapradheep@gmail.com",
        "9994112884",
        "19 Jun 1992",
        "Selenium",
        "Perumbakkam"
      ]
    },
    {
      "cells": [
        "Pradheep",
        "Ang",
        "angpradheep@gmail.com",
        "9840805544",
        "23 Dec 1983",
        "java",
        "Perumbakkam"
      ]
    },
    {
      "cells": [
        "Yaash",
        "Praveen",
        "yaashpraveen@gmail.com",
        "9994112874",
        "22 Mar 2015",
        "Selenium",
        "Perumbakkam"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigates to application page",
  "keyword": "Given "
});
formatter.match({
  "location": "ApplicationStep.user_navigates_to_application_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should give valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  \"Veena\" and \"Pradeep\" in the firstname input",
  "keyword": "When "
});
formatter.match({
  "location": "ApplicationStep.user_enters_and_in_the_firstname_input(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click gender button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_gender_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"veenapradheep@gmail.com\" in the email input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_email_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"9994112884\" in the MobilNo input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_MobilNo_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"19 Jun 1992\" in the Dateofbirth input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_Dateofbirth_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click hobbies button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_hobbies_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Perumbakkam\" in the address input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_address_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select state in dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_select_state_in_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select city in dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_select_city_in_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User expect the registration to form",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationStep.user_expect_the_registration_to_form()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigates to application page",
  "keyword": "Given "
});
formatter.match({
  "location": "ApplicationStep.user_navigates_to_application_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should give valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  \"Pradheep\" and \"Ang\" in the firstname input",
  "keyword": "When "
});
formatter.match({
  "location": "ApplicationStep.user_enters_and_in_the_firstname_input(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click gender button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_gender_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"angpradheep@gmail.com\" in the email input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_email_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"9840805544\" in the MobilNo input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_MobilNo_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"23 Dec 1983\" in the Dateofbirth input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_Dateofbirth_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click hobbies button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_hobbies_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Perumbakkam\" in the address input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_address_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select state in dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_select_state_in_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select city in dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_select_city_in_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User expect the registration to form",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationStep.user_expect_the_registration_to_form()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigates to application page",
  "keyword": "Given "
});
formatter.match({
  "location": "ApplicationStep.user_navigates_to_application_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should give valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters  \"Yaash\" and \"Praveen\" in the firstname input",
  "keyword": "When "
});
formatter.match({
  "location": "ApplicationStep.user_enters_and_in_the_firstname_input(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click gender button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_gender_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"yaashpraveen@gmail.com\" in the email input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_email_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"9994112874\" in the MobilNo input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_MobilNo_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  \"22 Mar 2015\" in the Dateofbirth input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_Dateofbirth_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click hobbies button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_hobbies_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Perumbakkam\" in the address input",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_enters_in_the_address_input(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select state in dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_select_state_in_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select city in dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_select_city_in_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationStep.user_click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User expect the registration to form",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationStep.user_expect_the_registration_to_form()"
});
formatter.result({
  "status": "passed"
});
});