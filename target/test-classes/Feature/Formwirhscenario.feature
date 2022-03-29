Feature: Fill the application form 
Scenario: User should give valid details
   
    Given User navigates to Application page
    When User enters  firstname and lastname in the firstname input
    And User click gender button
    And User enters  emailaddress in the email input
    And User enters  mobilNo in the MobilNo input
    And User enters  Dateofbirth in the Dateofbirth input
    And User click hobbies button
    And User enters current address in the address input
    And User select state in dropdown
    And User select city in dropdown
    And User click the Submit button
    Then User expect the registration to form