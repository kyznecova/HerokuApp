package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HoversTest extends BaseTest {

    @Test
    public void hovers() {
        hoversPage.open();
        for (int i = 1; i <= 3; i++) {
            WebElement user = hoversPage.getUser(String.valueOf(i));
            Actions actions = new Actions(driver);
            actions.moveToElement(user).build().perform();
            WebElement name = hoversPage.getName(String.valueOf(i));
            assertTrue(name.isDisplayed());
            WebElement href = hoversPage.getHref(String.valueOf(i));
            href.click();
            WebElement userPage = hoversPage.getUserPage();
            assertTrue(userPage.isDisplayed());
            driver.navigate().back();
        }

    }
}
