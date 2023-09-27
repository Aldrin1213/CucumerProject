package org.baseutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;

	@BeforeClass
	public static void browserlaunch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		reporter = new ExtentHtmlReporter("./junitaugreport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@After
	public void flush() {
		extent.flush();
	}

	@AfterClass
	public static void close() {
		driver.close();
	}

}
