package lexamenrf44.tests;

import io.qameta.allure.*;
import lexamenrf44.configuration.BrowserSetup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("with telegram notifications")
public class DnsSearchEngineTest extends BrowserSetup {

    @Owner("lexamenrf44")
    @Feature("DNS Search Form")
    @Story("Форма поиска интернет магазина DNS")
    @DisplayName("Тестирование формы поиска")
    @Description("Проверка поиска")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void dnsSearchingEngineTest() {

        step("Открыть форму регистрации", () -> {
            open("https://www.dns-shop.ru/");
        });

        step("Вводим в поиске значение", () -> {
            $(".ui-input-search").click();
            $(".ui-input-search").sendKeys("ролики");
            $(".ui-input-search").pressEnter();
        });
    }
}
