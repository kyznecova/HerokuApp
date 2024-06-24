package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CheckboxesTest extends BaseTest{

    @Test
    public void checkboxes() {
        checkboxesPage.open();
        WebElement checkbox1 = checkboxesPage.getCheckbox(1);
        WebElement checkbox2 = checkboxesPage.getCheckbox(2);

        assertEquals(checkbox1.isSelected(), false);
        checkbox1.click();
        assertEquals(checkbox1.isSelected(), true);

        assertEquals(checkbox2.isSelected(), true);
        checkbox2.click();
        assertEquals(checkbox2.isSelected(), false);
    }
}
