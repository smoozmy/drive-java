package smoozmy.drive2.tests;

import org.junit.jupiter.api.Test;
import smoozmy.drive2.base.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest extends BaseTest {


    @Test
    public void openDriver() {

        String title = driver.getTitle();

        assertTrue(title.contains("DRIVE2"), "Заголовок не соответствует ожиданию");
    }
}
