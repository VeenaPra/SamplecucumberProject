package org.step;

import org.base.BaseDetails;
import org.pom.ApplicationForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FormWithScenario extends BaseDetails {
	@Given("User navigates to Application page")
	public void user_navigates_to_Application_page() {
	    launchBrowser("chrome");
	    launchUrl("https://demoqa.com/automation-practice-form");
	}
	
	@When("User enters  firstname and lastname in the firstname input")
	public void user_enters_firstname_and_lastname_in_the_firstname_input() {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getFname(), "Veena");
		fillTheBox(ap.getLname(), "Pradheep");
	}

	@When("User enters  emailaddress in the email input")
	public void user_enters_emailaddress_in_the_email_input() {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getEmail(), "veenapradheep@gmail.com");
	}

	@When("User enters  mobilNo in the MobilNo input")
	public void user_enters_mobilNo_in_the_MobilNo_input() {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getPhNo(), "9994112884");
	}

	@When("User enters  Dateofbirth in the Dateofbirth input")
	public void user_enters_Dateofbirth_in_the_Dateofbirth_input() {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getdob(), "19 Jun 1992");
	}

	@When("User enters current address in the address input")
	public void user_enters_current_address_in_the_address_input() {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getAddress(), "Perumbakkam");
	}

}
