package com.crm.qa.testreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("usr.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("FREE CRM Automation Report");
		reporter.config().setDocumentTitle("FREE CRM Test Results");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Prachi Dhanotiya", "Automation Tester");
		return extent;
		
	}

}
