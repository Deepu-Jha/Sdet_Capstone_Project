package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {

    WebDriver driver;

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void performDragDrop() throws Exception {

        WebElement source =
                driver.findElement(By.id("draggable"));

        WebElement target =
                driver.findElement(By.id("droppable"));

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        act.clickAndHold(source)
           .pause(java.time.Duration.ofSeconds(2))
           .moveToElement(target)
           .pause(java.time.Duration.ofSeconds(2))
           .release()
           .perform();

        Thread.sleep(5000);

        System.out.println(
                "Drag and Drop Performed Successfully");
    }
}