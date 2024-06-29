package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FramesPage extends BasePage{

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    private final By IFRAME_STRING = By.xpath("//*[text()='iFrame']");
    private final By TEXT_IN_PARAGRAPH = By.xpath("//p[text()='Your content goes here.']");

    public String getTextInParagraph() {
        return driver.findElement(TEXT_IN_PARAGRAPH).getText();
    }

    public FramesPage open() {
        driver.get(BASE_URL + "/frames");
        return this;
    }

    public FramesPage openIFrameString() {
        driver.findElement(IFRAME_STRING).click();
        return this;
    }

    public FramesPage isOpenedAndSwitchTo() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        return this;
    }
}
