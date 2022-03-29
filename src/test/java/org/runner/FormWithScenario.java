package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Feature\\Formwirhscenario.feature", glue="org\\step", 
dryRun=false, monochrome=true,
strict=true,plugin= {"pretty","json:C:\\Users\\USER\\eclipse-workspace\\FormTaskOnCucumber\\JsonReport\\form.json",
		"junit:C:\\Users\\USER\\eclipse-workspace\\FormTaskOnCucumber\\JunitReport\\form.xml"})

public class FormWithScenario {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\JsonReport\\form.json");

	}

}
