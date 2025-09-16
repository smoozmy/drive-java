package smoozmy.drive2.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import smoozmy.drive2.utils.Config;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String baseUrl;


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        baseUrl = Config.get("base.url");
        username = Config.get("username");
        password = Config.get("password");

        driver.get(baseUrl);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
