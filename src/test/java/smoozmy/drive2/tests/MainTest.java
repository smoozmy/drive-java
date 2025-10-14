package smoozmy.drive2.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import smoozmy.drive2.base.BaseTest;
import smoozmy.drive2.pages.MainPage;

public class MainTest extends BaseTest {

    @BeforeEach
    void login() {
        loginAsDefaultUser();
    }

    @Test
    void testGetTitleText() {
        MainPage mainPage = new MainPage(driver);
        System.out.println(mainPage.getFeedTitle());
        Assertions.assertTrue(mainPage.getFeedTitle().contains("Лента"));
    }
}
