package smoozmy.drive2.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import smoozmy.drive2.pages.LoginPage;
import smoozmy.drive2.utils.Config;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String baseUrl;


    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        baseUrl = Config.get("base.url");
        username = Config.get("username");
        password = Config.get("password");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    protected void loginAsDefaultUser() {
        LoginPage loginPage = new LoginPage(driver, baseUrl);
        loginPage.open();
        loginPage.login(username, password);
    }
}
