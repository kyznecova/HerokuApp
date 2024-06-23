package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputsNumberAndUp() {
        inputsPage.open();
        WebElement inputs = inputsPage.getInputs();
        inputs.sendKeys("1", Keys.ARROW_UP, Keys.ARROW_UP);
        String text = inputs.getAttribute("value");
        assertEquals(text, "3");
    }

    @Test
    public void inputsLetterAndDown() {
        inputsPage.open();
        WebElement inputs = inputsPage.getInputs();
        inputs.sendKeys("e", Keys.ARROW_DOWN);
        String text = inputs.getAttribute("value");
        assertEquals(text, "-1");
    }
}
