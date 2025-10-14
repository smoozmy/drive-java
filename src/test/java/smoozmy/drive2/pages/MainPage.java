package smoozmy.drive2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private final By feedTitle = By.xpath("//h1[(text()='Лента')]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getFeedTitle() {
        return getText(feedTitle);
    }
}
