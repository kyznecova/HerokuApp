package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    private final String USER_PATTERN = "//div[@id='content']/descendant::div[@class='figure'][%s]";
    private final String NAME_PATTERN = "//div[@id='content']/descendant::h5[%s]";
    private final String HREF_PATTERN = "//a[@href='/users/%s']";
    private final By USER_PAGE = By.xpath("//*[text()='Not Found']");

    public void open() {
        driver.get("http://the-internet.herokuapp.com/hovers");
    }

    public WebElement getUser(String number) {
        return driver.findElement(By.xpath(String.format(USER_PATTERN, number)));
    }

    public WebElement getName(String number) {
        return driver.findElement(By.xpath(String.format(NAME_PATTERN, number)));
    }

    public WebElement getHref(String number) {
        return driver.findElement(By.xpath(String.format(HREF_PATTERN, number)));
    }

    public WebElement getUserPage(){
        return driver.findElement(USER_PAGE);
    }
}
