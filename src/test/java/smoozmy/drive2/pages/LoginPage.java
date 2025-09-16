package smoozmy.drive2.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    private static final String PATH = "/reception";
    private final String loginUrl;

    private final By usernameField = By.xpath("//input[@name='Login']");
    private final By passwordField = By.xpath("//input[@name='Password']");
    private final By loginButton = By.xpath("//button[text()='Войти']");

    public LoginPage(WebDriver driver, String baseUrl) {
        super(driver);
        this.loginUrl = baseUrl + PATH;
    }

    public void open() {
        super.open(loginUrl);
    }

    public void login(String username, String password) {
        sendKeys(usernameField, username);
        sendKeys(passwordField, password);
        click(loginButton);
    }
}
