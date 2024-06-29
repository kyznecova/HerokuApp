package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContextMenuPage extends BasePage{

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private final By BOX = By.id("hot-spot");

    public WebElement getBox() {
        return driver.findElement(BOX);
    }

    public void open() {
        driver.get(BASE_URL + "/context_menu");
    }

    public void isOpened() {
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
