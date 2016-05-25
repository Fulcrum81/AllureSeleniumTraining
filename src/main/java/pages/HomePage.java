package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private static final By SEARCH_FIELD = By.id("search_from_str");
    private static final By DOWNLOAD = By.cssSelector(".button.big");

    public static void search(String searchStr) {
        $(SEARCH_FIELD).sendKeys(searchStr);
        $(DOWNLOAD).click();
    }



}
