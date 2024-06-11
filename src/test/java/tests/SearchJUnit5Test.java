package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchJUnit5Test {

    @Test
    void searchJUnit5(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").shouldHave(text("wiki")).click();
        $("#wiki-tab").click();
        $$("[href$='SoftAssertions']").first().shouldHave(text("Soft assertions"));
        $$("[href$='SoftAssertions']").first().click();
        $$("h4.heading-element").findBy(text("JUnit5")).should(exist);
    }
}
