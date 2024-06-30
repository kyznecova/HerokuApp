package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenu() {
        contextMenuPage.open();
        Actions actions = new Actions(driver);
        actions.contextClick(contextMenuPage.getBox()).build().perform();
        contextMenuPage.isOpened();
        Alert alert = driver.switchTo().alert();
        String textAlert = alert.getText();
        assertEquals(textAlert, "You selected a context menu");
        alert.accept();
    }
}
