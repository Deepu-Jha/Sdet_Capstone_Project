package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import utils.ExtentManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    private ExtentReports extent =
            ExtentManager.getReport();

    private ExtentTest test;

    @Override
    public void onStart(ITestContext context) {

        System.out.println("Extent Listener Started");
    }

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(
                result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

        try {

            String screenshotPath =
                    ScreenshotUtil.captureScreenshot(
                            BaseTest.driver,
                            result.getMethod().getMethodName());

            test.addScreenCaptureFromPath(
                    screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        try {

            String screenshotPath =
                    ScreenshotUtil.captureScreenshot(
                            BaseTest.driver,
                            result.getMethod().getMethodName());

            test.addScreenCaptureFromPath(
                    screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("Extent Listener Finished");

        extent.flush();
    }
}