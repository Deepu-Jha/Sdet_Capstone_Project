package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;

public class TestListener implements ITestListener {

    ExtentReports extent =
            ExtentManager.getReportInstance();

    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test =
        extent.createTest(
        result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

        try {

            String path =
                    ScreenshotUtil.captureScreenshot(
                    BaseClass.driver,
                    result.getMethod().getMethodName());

            test.addScreenCaptureFromPath(path);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        try {

            String path =
                    ScreenshotUtil.captureScreenshot(
                    BaseClass.driver,
                    result.getMethod().getMethodName());

            test.addScreenCaptureFromPath(path);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}