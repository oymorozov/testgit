import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstTestSelenideOneTest {

    @Test
    void test1(){
        open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[data-testid='results-list'] a").$(byText("selenide / selenide")).click();
        $("#wiki-tab").click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $$("ul li a").findBy(text("Soft assertions")).click();
        $(".highlight-text-html-basic").shouldBe(visible);
        sleep(5000);

    }
}
