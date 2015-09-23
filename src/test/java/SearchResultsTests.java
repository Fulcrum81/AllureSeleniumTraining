import base.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by student on 9/8/2015.
 */
public class SearchResultsTests extends TestBase{
    private final String SEARCH_TEXT = "Selenium WebDriver";
    private final String SEARCH_URL = "http://docs.seleniumhq.org/projects/webdriver";

    @Test
    public void searchResultsLinksCheck() {
        HomePage.search(SEARCH_TEXT);
        assertTrue("Не найдено ссылки с заданым текстом", SearchPage.checkLinkText(SEARCH_TEXT));
        assertTrue("Link Url not found", SearchPage.checkLinkUrl(SEARCH_URL));

        //$(By.id("")).click();
        //$(By.cssSelector("")).shouldNotBe(Condition.visible);
    }
}
