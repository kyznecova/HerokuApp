package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlsPage extends BasePage {

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private final By CHECKBOX = By.cssSelector("[type=checkbox]");
    private final By REMOVE_BUTTON = By.xpath("//*[text()='Remove']");
    private final By MESSAGE = By.id("message");

    public boolean checkboxIsIDisplayed() {
        boolean isDisplayed;
        try {
            WebElement checkbox = driver.findElement(CHECKBOX);
            if (checkbox.isDisplayed()) {
                isDisplayed = true;
            } else {
                isDisplayed = false;
            }
        } catch (NoSuchElementException e) {
            isDisplayed = false;
        } return isDisplayed;
    }

    public WebElement getRemoveButton() {
        return driver.findElement(REMOVE_BUTTON);
    }

    public DynamicControlsPage open() {
        driver.get(BASE_URL + "/dynamic_controls");
        return this;
    }

    public DynamicControlsPage isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE));
        return this;
    }
}
