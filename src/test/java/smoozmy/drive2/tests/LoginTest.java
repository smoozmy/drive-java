package smoozmy.drive2.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import smoozmy.drive2.base.BaseTest;
import smoozmy.drive2.pages.LoginPage;

public class LoginTest extends BaseTest {


    @Test
    @Story("Успешный вход")
    @Description("Авторизация на портале под своей УЗ")
    void testLogin() {
        LoginPage loginPage = new LoginPage(driver, baseUrl);
        loginPage.open();
        loginPage.login(username, password);
    }
}
