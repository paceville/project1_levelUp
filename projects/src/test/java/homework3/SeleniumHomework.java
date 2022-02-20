package homework3;

import homework3.locators.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SeleniumHomework {

    final String userLogin = "lvlp_autumn_2021";
    final String userPassword = "Hello12345!";
    final String email = "lvlp_autumn_2021@mail.ru";

    public static final String MAILRU_LINK = "https://mail.ru";

    private WebDriver driver;
    private LoginPage loginPage = new LoginPage(driver);

    public SeleniumHomework() {
       // super()
    }

    @BeforeSuite
    public void setUpSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void exercise1() {

        driver.navigate().to(MAILRU_LINK);
        loginPage.signIn(userLogin, userPassword);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
