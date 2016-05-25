package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeTest
    public void setup() {
        Configuration.browser = "firefox";
        Configuration.timeout = 20;
        open("http://www.tut.by");
    }
}
