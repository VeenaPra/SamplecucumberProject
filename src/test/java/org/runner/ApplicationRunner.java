package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Applicationform.feature", glue="org\\step",
plugin= {"pretty", "html:C:\\Users\\USER\\eclipse-workspace\\FormTaskOnCucumber\\HtmlReport"})

public class ApplicationRunner {

}
