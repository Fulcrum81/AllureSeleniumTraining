package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    private static final By RESULTS_LIST = By.className("b-results-list");
    private static final By RESULT = By.cssSelector("h3>a[target]");


    public static boolean checkLinkText(String linkText) {
        List<SelenideElement> linksList = /*driver.findElement(RESULTS_LIST)*/$(RESULTS_LIST).$$(RESULT);
        //boolean linkExists = false;

        for (SelenideElement webElement : linksList) {
            String actualText = webElement.getText();
            //webElement.shouldHave(Condition.text(linkText));
            if (webElement.getText().equals(linkText)) {
                return true;
            }

        }
        return false;
    }

    public static boolean checkLinkUrl(String linkUrl) {
        List<SelenideElement> linksList = $(RESULTS_LIST).$$(RESULT);
        //boolean linkExists = false;

        for (WebElement webElement : linksList) {
            if (webElement.getAttribute("href").equals(linkUrl)) {
                return true;
            }
        }
        return false;
    }
}
