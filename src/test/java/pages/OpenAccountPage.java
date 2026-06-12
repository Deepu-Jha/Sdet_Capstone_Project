package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage {

    public OpenAccountPage(
            WebDriver driver){

        PageFactory.initElements(
                driver,this);
    }

    @FindBy(linkText =
            "Open New Account")
    WebElement openAccount;

    @FindBy(id="type")
    WebElement type;

    @FindBy(xpath =
            "//input[@value='Open New Account']")
    WebElement openButton;

    public void openChecking()
            throws Exception {

        openAccount.click();

        Thread.sleep(3000);

        Select select =
                new Select(type);

        select.selectByVisibleText(
                "CHECKING");

        Thread.sleep(2000);

        openButton.click();

        Thread.sleep(3000);
    }
}