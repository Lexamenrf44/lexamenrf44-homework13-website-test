package lexamenrf44.tests;

import io.qameta.allure.*;
import static io.qameta.allure.Allure.*;

import lexamenrf44.configuration.BrowserSetup;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@Tag("with telegram notifications")
public class RegardTest extends BrowserSetup {

    @DisplayName("Тестирование формы поиска")
    @Test
    @Order(1)
    void regardSearchingFormTest() {

        step("Перейти на веб-сайт Regard", () -> {
            open("https://www.regard.ru/");
        });

        step("Выбираем поле поиска", () -> {
            $("#query").click();
        });

        step("Заполняем поле поиска", () -> {
            $("#query").sendKeys("Мыши");
        });

        step("Отправляем заполненную форму", () -> {
            $("#query").pressEnter();
        });
    }

    @DisplayName("Тестирование результатов поиска")
    @Test
    @Order(2)
    void regardSearchResultsTest() {

        step("Проверка отображение результатов поиска", () -> {
            $(".content").shouldBe(appear);
        });
    }
}
