package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {
    @Test
    public void frames() {
        framesPage
                .open()
                .openIFrameString()
                .isOpenedAndSwitchTo();
        assertEquals(framesPage.getTextInParagraph(), "Your content goes here.");
        driver.switchTo().defaultContent();
    }
}
