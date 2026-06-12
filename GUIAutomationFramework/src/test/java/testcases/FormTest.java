package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FormPage;
import utilities.ExcelUtils;

public class FormTest extends BaseTest {

    private static final Logger logger =
            LogManager.getLogger(FormTest.class);

    @Test
    public void fillFormTest() throws Exception {

        logger.info("Form Test Started");

        FormPage form = new FormPage(driver);

        String excelPath =
                "src/test/resources/testdata/TestData1.xlsx";

        String name =
                ExcelUtils.getCellData(excelPath, 1, 0);

        String email =
                ExcelUtils.getCellData(excelPath, 1, 1);

        String phone =
                ExcelUtils.getCellData(excelPath, 1, 2);

        String address =
                ExcelUtils.getCellData(excelPath, 1, 3);

        logger.info("Excel Data Read Successfully");

        form.enterName(name);
        logger.info("Name Entered");

        form.enterEmail(email);
        logger.info("Email Entered");

        form.enterPhone(phone);
        logger.info("Phone Entered");

        form.enterAddress(address);
        logger.info("Address Entered");

        form.selectGender();
        logger.info("Gender Selected");

        form.selectDays();
        logger.info("Days Selected");

        form.selectCountry("India");
        logger.info("Country Selected");

        form.selectColor();
        logger.info("Colors Selected");

        form.selectAnimal();
        logger.info("Animal Selected");

        form.enterDatePicker1();
        logger.info("Date Picker 1 Filled");

        form.enterDatePicker2();
        logger.info("Date Picker 2 Filled");

        form.clickSubmit();
        logger.info("Submit Button Clicked");

        Assert.assertTrue(
                driver.getTitle().contains("Automation"));

        logger.info("Form Test Passed Successfully");

        Thread.sleep(5000);
    }
}