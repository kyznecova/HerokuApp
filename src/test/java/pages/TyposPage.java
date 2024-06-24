package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TyposPage extends BasePage {

    public TyposPage(WebDriver driver) {
        super(driver);
    }
    private final By TYPOS = By.xpath("//*[@id='content']/div/p[2]");

    public void open() {
        driver.get("http://the-internet.herokuapp.com/typos");
    }

    public WebElement getTypos() {
        return driver.findElement(TYPOS);
    }
}
