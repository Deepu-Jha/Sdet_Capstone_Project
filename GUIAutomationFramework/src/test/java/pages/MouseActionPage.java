package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionPage {

    WebDriver driver;
    Actions actions;

    public MouseActionPage(WebDriver driver) {

        this.driver = driver;

        actions = new Actions(driver);
    }

    public void mouseHover() throws Exception {

        WebElement element =
                driver.findElement(
                        By.xpath("//button[text()='Point Me']"));

        Thread.sleep(3000);

        actions.moveToElement(element).perform();

        System.out.println("Mouse Hover Performed");

        Thread.sleep(5000);
    }

    public void doubleClick() throws Exception {

        WebElement button =
                driver.findElement(
                        By.xpath("//button[text()='Copy Text']"));

        Thread.sleep(3000);

        actions.doubleClick(button).perform();

        System.out.println("Double Click Performed");

        Thread.sleep(5000);
    }
}