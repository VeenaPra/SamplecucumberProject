package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	public static void generateJvmReport(String Jsonpath) {
		File f = new File(System.getProperty("user.dir")+"\\JVMReport");
		
		//step-2
		Configuration c = new Configuration(f,"ApplicationForm");
		c.addClassifications("platform", "Windows");
		c.addClassifications("sprint", "12334");
		c.addClassifications("JDK version", "1.8");
		//step3
		List<String> l = new ArrayList<String>();
		l.add(Jsonpath);
		
		//step-4
		ReportBuilder r = new ReportBuilder (l,c);
		r.generateReports();
		

	}

}
