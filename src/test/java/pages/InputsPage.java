package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage extends BasePage {

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    private final By INPUTS = By.cssSelector("[type=number]");

    public void open() {
        driver.get("http://the-internet.herokuapp.com/inputs");
    }

    public WebElement getInputs() {
        return driver.findElement(INPUTS);
    }
}
