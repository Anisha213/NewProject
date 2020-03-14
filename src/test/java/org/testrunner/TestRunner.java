package org.testrunner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",glue="org.step",dryRun=false,monochrome=true,
plugin= {"html:src\\test\\resources\\Reports","json:src\\test\\resources\\Reports\\report.json"})
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\report.json");
		System.out.println("ReportGenerated");
	}
	
}
