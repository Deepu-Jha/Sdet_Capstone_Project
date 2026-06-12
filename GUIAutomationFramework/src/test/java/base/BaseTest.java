package base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import utilities.ExtentManager;
import utilities.ScreenshotUtil;

public class BaseTest {

    protected WebDriver driver;

    protected static ExtentReports extent =
            ExtentManager.getReport();

    protected ExtentTest test;

    @BeforeMethod
    public void setup(Method method) {

        test = extent.createTest(method.getName());

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get(
            "https://testautomationpractice.blogspot.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result)
            throws Exception {

        if (result.getStatus()
                == ITestResult.SUCCESS) {

            test.pass("Test Passed");

            System.out.println(
                    "Test Passed: "
                    + result.getName());
        }

        else if (result.getStatus()
                == ITestResult.FAILURE) {

            test.fail(result.getThrowable());

            ScreenshotUtil.captureScreenshot(
                    driver,
                    result.getName());

            System.out.println(
                    "Screenshot captured for failed test: "
                    + result.getName());
        }

        else if (result.getStatus()
                == ITestResult.SKIP) {

            test.skip("Test Skipped");
        }

        Thread.sleep(5000);

        if (driver != null) {

            driver.quit();
        }
    }

    @AfterSuite
    public void generateReport() {

        extent.flush();

        System.out.println(
                "Extent Report Generated Successfully");
    }
}