package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            String reportPath =
                    System.getProperty("user.dir")
                    + "/reports/ExtentReport.html";

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(reportPath);

            reporter.config()
                    .setReportName(
                    "GUI Automation Framework Report");

            reporter.config()
                    .setDocumentTitle(
                    "Automation Test Report");

            extent = new ExtentReports();

            extent.attachReporter(reporter);
        }

        return extent;
    }
}