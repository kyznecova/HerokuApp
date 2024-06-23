package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest{

    @Test
    public void typos() {
        typosPage.open();
        String typosText = typosPage.getTypos().getText();
        assertEquals(typosText, "Sometimes you'll see a typo, other times you won't.");
    }
}
