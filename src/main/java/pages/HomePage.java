package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by student on 9/3/2015.
 */
public class HomePage {
    private static final By SEARCH_FIELD = By.id("search_from_str");
    private static final By DOWNLOAD = By.cssSelector(".button.big");

    public static void search(String searchStr) {
        $(SEARCH_FIELD).sendKeys(searchStr);
        $(DOWNLOAD).click();
    }



}
