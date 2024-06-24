package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends BasePage {

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    private final By CHECKBOXES = By.cssSelector("[type=checkbox]");

    public void open() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
    }

    public WebElement getCheckbox(int number) {
        List<WebElement> checkboxesList = driver.findElements(CHECKBOXES);
        WebElement checkbox = checkboxesList.get(number - 1);
        return checkbox;
    }
}
