package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    CheckboxesPage checkboxesPage;
    InputsPage inputsPage;
    TyposPage typosPage;
    TablesPage tablesPage;
    HoversPage hoversPage;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FramesPage framesPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        checkboxesPage = new CheckboxesPage(driver);
        inputsPage = new InputsPage(driver);
        typosPage = new TyposPage(driver);
        tablesPage = new TablesPage(driver);
        hoversPage = new HoversPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        framesPage = new FramesPage(driver);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
