package ru.ozon.tests;

import static io.qameta.allure.Allure.*;

import ru.ozon.configuration.TestBase;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class OzonTest extends TestBase {

    @Test
    @DisplayName("Тестирование формы поиска Ozon")
    void searchFormTest() {
        step("Перейти на веб-сайт Ozon", () ->
            open(""));

        step("Выбираем поле поиска ozon", () ->
            $("[placeholder='Искать на Ozon']").click());

        step("Заполняем поле поиска ozon", () ->
            $("[placeholder='Искать на Ozon']").sendKeys("Мышь"));

        step("Отправляем заполненную форму поиска Ozon", () ->
            $("[placeholder='Искать на Ozon']").pressEnter());

        step("Проверка отображение результатов поиска", () ->
                $(byText("Мыши")).shouldBe(visible));
    }

    @Test
    @Disabled
    @DisplayName("Тестирование отображение первого товара на Ozon")
    void goodsFormTest() {
        step("Перейти на веб-сайт Ozon", () ->
                open(""));

        step("Выбираем поле поиска Ozon", () ->
                $("[placeholder='Искать на Ozon']").click());

        step("Заполняем поле поиска Ozon", () ->
                $("[placeholder='Искать на Ozon']").sendKeys("Мышь"));

        step("Отправляем заполненную форму Ozon", () ->
                $("[placeholder='Искать на Ozon']").pressEnter());

        step("Переход на первую строку результата поиска Ozon", () ->
                $(".hq .f-tsBodyL").click());
    }

    @Test
    @DisplayName("Тестирование формы Ozon Express")
    void expressLinkTest() {
        step("Перейти на веб-сайт Ozon", () ->
                open(""));

        step("Перейти по ссылке Ozon Express", () ->
                $("[data-widget='horizontalMenu'] [href*='/category/supermarket-25000/']").click());

        step("Проверка отображение формы Ozon Express", () ->
                $("[data-widget='catalogResultsHeader']").$(withText("OZON Express")).should(appear));
    }

    @Test
    @DisplayName("Тестирование формы авторизации")
    void idFrameTest() {
        step("Перейти на веб-сайт Ozon", () ->
                open(""));

        step("Перейти на форму авторизации", () ->
                $("[data-widget='profileMenuAnonymous']").click());

        step("Проверка отображение формы авторизации", () -> {
                $("[data-widget='ozonIdIframe']").should(appear);
        });
    }

    @Test
    @DisplayName("Тестирование формы заказов")
    void orderWindowTest() {
        step("Перейти на веб-сайт Ozon", () ->
                open(""));

        step("Перейти на форму заказов", () ->
                $("[data-widget='orderInfo'] [href*='/my/orderlist']").click());

        step("Проверка отображения на формы заказов", () ->
                $("[data-widget='myGuest']").$(withText("Вы не авторизованы")).should(appear));
    }

    @Test
    @DisplayName("Тестирование формы избранного")
    void featuredWindowTest() {
        step("Перейти на веб-сайт Ozon", () ->
                open(""));

        step("Перейти на форму заказов", () ->
                $("[data-widget='favoriteCounter']").click());

        step("Проверка отображения на формы заказов", () -> {
            $("[data-widget='caption']").$(withText("Избранное")).should(appear);
            $("[data-widget='emptyState']").$(withText("В Избранном пока ничего нет"));
        });
    }

}
