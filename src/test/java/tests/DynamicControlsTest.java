package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControl() {
        dynamicControlsPage
                .open()
                .getRemoveButton()
                .click();
        assertFalse(dynamicControlsPage.isOpened().checkboxIsIDisplayed());

    }
}
