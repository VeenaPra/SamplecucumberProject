package org.step;

import java.io.IOException;

import org.base.BaseDetails;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.ApplicationForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormFromExcel extends  BaseDetails{
	@Given("User navigates to Application main page")
	public void user_navigates_to_Application_main_page() {
		launchBrowser("chrome");
		launchUrl("https://demoqa.com/automation-practice-form");
	}

	@When("User enters  firstname and lastname in the firstname input from excel")
	public void user_enters_firstname_and_lastname_in_the_firstname_input_from_excel() throws IOException {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getFname(),getDataFromExcel("form register", "form", 0, 0) );
		fillTheBox(ap.getLname(), getDataFromExcel("form register", "form", 1	, 0));
		
	}

	@When("User click gender button on webpage")
	public void user_click_gender_button_on_webpage() {
		ApplicationForm ap = new ApplicationForm();
		clickFemaleBtn(ap.getFemalebtn());
	}

	@When("User enters  emailaddress in the email input from excel")
	public void user_enters_emailaddress_in_the_email_input_from_excel() throws IOException {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getEmail(),getDataFromExcel("form register", "form", 2, 0) );
	}

	@When("User enters  mobilNo in the MobilNo input from excel")
	public void user_enters_mobilNo_in_the_MobilNo_input_from_excel() throws IOException {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getPhNo(), getDataFromExcel("form register", "form", 3, 0));
	}

	@When("User enters  Dateofbirth in the Dateofbirth input from excel")
	public void user_enters_Dateofbirth_in_the_Dateofbirth_input_from_excel() throws IOException {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getdob(), getDataFromExcel("form register", "form", 4, 0));
	}

	@When("User click hobbies button on webpage")
	public void user_click_hobbies_button_on_webpage() {
		ApplicationForm ap = new ApplicationForm();
		clickHobbies(ap.getHobbie());
	}

	@When("User enters current address in the address input from excel")
	public void user_enters_current_address_in_the_address_input_from_excel() throws IOException {
		ApplicationForm ap = new ApplicationForm();
		fillTheBox(ap.getAddress(), getDataFromExcel("form register", "form", 6, 0));
	}

	@When("User click the Submit button on webpage")
	public void user_click_the_Submit_button_on_webpage() {
		ApplicationForm ap = new ApplicationForm();
		submitbtn(ap.getSubmit());
	}

	@Then("User expect the register the form successfully")
	public void user_expect_the_register_the_form_successfully() {
		ApplicationForm ap = new ApplicationForm();
		boolean th = driver.findElement(By.id("example-modal-sizes-title-lg")).isDisplayed();
		Assert.assertTrue(th);
	}
	
	


}
