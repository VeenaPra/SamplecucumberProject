package org.pom;

import org.base.BaseDetails;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForm extends BaseDetails {
	public ApplicationForm() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName")
	private WebElement fname;
	
	@FindBy(id="lastName")
	private WebElement lname;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//*[text()='Female']")
	private WebElement femalebtn;
	
	@FindBy(id="userNumber")
	private WebElement phNo;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//*[@id=\"subjectsContainer\"]/div/div[1]")
	private WebElement subject;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[6]")
	private WebElement hobbie;
	
	@FindBy(id="currentAddress")
	private WebElement address;
	
	@FindBy(tagName="select")
	private WebElement state;
	
	@FindBy(tagName="select")
	private WebElement city;
	
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id="submit")
	private WebElement submit;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFemalebtn() {
		return femalebtn;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getdob() {
		return dob;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getHobbie() {
		return hobbie;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

}



