package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablesPage extends BasePage {

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    private final String TABLE_ELEMENT_PATTERN = "//table[%d]//tr[%d]//td[%d]";

    public void open() {
        driver.get("http://the-internet.herokuapp.com/tables");
    }

    public String getTextTableElement(int table, int row, int column) {
        By tableElement = By.xpath(String.format(TABLE_ELEMENT_PATTERN, table, row, column));
        return driver.findElement(tableElement).getText();
    }
}
