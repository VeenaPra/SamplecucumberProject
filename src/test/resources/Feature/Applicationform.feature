Feature: Fill the application form

  Background: 
    Given User navigates to application page

  Scenario Outline: User should give valid details
    When User enters  "<firstname>" and "<lastname>" in the firstname input
    And User click gender button
    And User enters  "<emailaddress>" in the email input
    And User enters  "<mobilNo>" in the MobilNo input
    And User enters  "<Dateofbirth>" in the Dateofbirth input
    And User click hobbies button
    And User enters "<current address>" in the address input
    And User select state in dropdown
    And User select city in dropdown
    And User click the Submit button
    Then User expect the registration to form

    Examples: 
      | firstname | lastname | emailaddress            | mobilNo    | Dateofbirth | subject  | current address |
      | Veena     | Pradeep  | veenapradheep@gmail.com | 9994112884 | 19 Jun 1992 | Selenium | Perumbakkam     |
      | Pradheep  | Ang      | angpradheep@gmail.com   | 9840805544 | 23 Dec 1983 | java     | Perumbakkam     |
      | Yaash     | Praveen  | yaashpraveen@gmail.com  | 9994112874 | 22 Mar 2015 | Selenium | Perumbakkam     |
			| Acinthya  | Krishna  | acnthyakrishna@gmail.com| 9994113456 | 25 july 2015| Selenium | Adileide		     |
			| Viyaan    | Krishna  | Krishnaviyaan@gmail.com | 9874112874 | 20 oct 2015 | Selenium | Sydny			     |