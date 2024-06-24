package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TablesTest extends BaseTest {

    @Test
    public void tables() {
        tablesPage.open();
        assertEquals(tablesPage.getTextTableElement(2, 2, 2), "Frank");
        assertEquals(tablesPage.getTextTableElement(1, 3, 5), "http://www.jdoe.com");
        assertEquals(tablesPage.getTextTableElement(1, 1, 4), "$50.00");
    }
}
