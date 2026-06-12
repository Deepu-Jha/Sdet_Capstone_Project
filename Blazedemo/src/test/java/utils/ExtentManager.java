package utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            // Create reports folder automatically
            String reportDir =
                    System.getProperty("user.dir")
                    + "/reports";

            File directory = new File(reportDir);

            if (!directory.exists()) {
                directory.mkdirs();
            }

            String reportPath =
                    reportDir
                    + "/BlazeDemo_Automation_Report.html";

            // Print report location in console
            System.out.println(
                    "Extent Report Path: "
                    + reportPath);

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(reportPath);

            reporter.config()
                    .setReportName(
                    "BlazeDemo Flight Booking Automation Report");

            reporter.config()
                    .setDocumentTitle(
                    "BlazeDemo Test Execution Report");

            extent = new ExtentReports();

            extent.attachReporter(reporter);

            extent.setSystemInfo(
                    "Project",
                    "BlazeDemo Automation");

            extent.setSystemInfo(
                    "Tester",
                    "Deepu");

            extent.setSystemInfo(
                    "Environment",
                    "QA");

            extent.setSystemInfo(
                    "Tool",
                    "Selenium + TestNG");

            extent.setSystemInfo(
                    "Browser",
                    "Chrome");
        }

        return extent;
    }
}