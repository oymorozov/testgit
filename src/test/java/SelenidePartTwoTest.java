import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenidePartTwoTest {

    @Test
    void hoverTest() {
        open("https://github.com");
        $$(".HeaderMenu-link.border-0").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprises")).click();
        $$(".Primer_Brand__Heading-module__Heading___IVpmp")
                .findBy(text("The enterprise-ready platform that developers know and love"))
                .shouldBe(visible);
    }

    @Test
    void hoverTestNew() {
        open("https://github.com");

        // Ожидание перед hover
        $$(".HeaderMenu-link.border-0")
                .findBy(text("Solutions"))
                .shouldBe(visible)
                .hover();

        // Ожидание перед кликом
        $$(".HeaderMenu-dropdown-link")
                .findBy(text("Enterprises"))
                .shouldBe(visible)
                .click();

        // Проверка заголовка после перехода
        $$(".Primer_Brand__Heading-module__Heading___IVpmp")
                .findBy(matchText("The enterprise-ready platform that developers know and love"))
                .shouldBe(visible);
    }
}
