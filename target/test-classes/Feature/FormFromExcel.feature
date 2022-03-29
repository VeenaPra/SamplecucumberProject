Feature: Fill the application form using excel 
Scenario: User should give valid details from excel
   
    Given User navigates to Application main page
    When User enters  firstname and lastname in the firstname input from excel
    And User click gender button on webpage
    And User enters  emailaddress in the email input from excel
    And User enters  mobilNo in the MobilNo input from excel
    And User enters  Dateofbirth in the Dateofbirth input from excel
    And User click hobbies button on webpage
    And User enters current address in the address input from excel
    And User click the Submit button on webpage
    Then User expect the register the form successfully