package org.step;

import org.base.BaseDetails;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pom.ApplicationForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationStep extends BaseDetails{
	@Given("User navigates to application page")
	public void user_navigates_to_application_page() {
		launchBrowser("chrome");
	    launchUrl("https://demoqa.com/automation-practice-form");
	}

	@When("User enters  {string} and {string} in the firstname input")
	public void user_enters_and_in_the_firstname_input(String firstname, String lastname) {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getFname(), firstname);
		fillTheBox(ap.getLname(), lastname);
		
	}

	@When("User click gender button")
	public void user_click_gender_button() {
		ApplicationForm ap = new ApplicationForm();
	clickFemaleBtn(ap.getFemalebtn());
	}

	@When("User enters  {string} in the email input")
	public void user_enters_in_the_email_input(String emailaddress) {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getEmail(), emailaddress);
		
	}

	@When("User enters  {string} in the MobilNo input")
	public void user_enters_in_the_MobilNo_input(String mobilNo) {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getPhNo(), mobilNo);
	}

	@When("User enters  {string} in the Dateofbirth input")
	public void user_enters_in_the_Dateofbirth_input(String Dateofbirth) {
		ApplicationForm ap = new ApplicationForm();
		
		
		fillTheBox(ap.getdob(), Dateofbirth);
	}

	/*@When("User enters  {string} in the subject input")
	public void user_enters_in_the_subject_input(String subject) {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getSubject(), subject);
		
	}*/

	@When("User click hobbies button")
	public void user_click_hobbies_button() {
		ApplicationForm ap = new ApplicationForm();
		clickHobbies(ap.getHobbie());
	}

	@When("User enters {string} in the address input")
	public void user_enters_in_the_address_input(String currentaddress) {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getAddress(), currentaddress);
	}

	@When("User select state in dropdown")
	public void user_select_state_in_dropdown() {
		ApplicationForm ap = new ApplicationForm();
		dropDownState(ap.getState());
	}

	@When("User select city in dropdown")
	public void user_select_city_in_dropdown() {
		ApplicationForm ap = new ApplicationForm();
		dropDowncity(ap.getCity());
	}

	@When("User click the Submit button")
	public void user_click_the_Submit_button() {
		ApplicationForm ap = new ApplicationForm();
		submitbtn(ap.getSubmit());
	}

	@Then("User expect the registration to form")
	public void user_expect_the_registration_to_form() {
		
		ApplicationForm ap = new ApplicationForm();
		boolean th = driver.findElement(By.id("example-modal-sizes-title-lg")).isDisplayed();
		Assert.assertTrue(th);
	}
	


}
