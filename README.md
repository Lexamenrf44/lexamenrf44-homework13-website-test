# Проект по автоматизации тестирования OZON

## :cherry_blossom:	Содержание

> ➠ [Покрытый функционал](#earth_africa-покрытый-функционал)
>
> ➠ [Технологический стек](#classical_building-технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#robot-удаленный-запуск-тестов)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)
>
> ➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
>
> ➠ [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid)

## :earth_africa: Покрытый функционал

> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Тестирование формы поиска Ozon
- [x] Тестирование формы Ozon Express
- [x] Тестирование формы авторизации
- [x] Тестирование формы заказов
- [x] Тестирование формы избранного

## :classical_building: Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

 В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.


## Запуск тестов из терминала

### :robot: Локальный запуск тестов

```
gradle clean test
```

### :robot: Удаленный запуск тестов 

```
clean
test
-DremoteUrl=${REMOTEURL}
-Duser=${USER}
-Dpassword=${PASSWORD}
-Dbrowser=${BROWSER}
-DbrowserVersion=${VERSION}
-DbrowserSize=${RESOLUTION}
```
### :robot: Параметры сборки

> <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).

### :skier: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screens/allure_overview.png">
</p>

### :eye_speech_bubble: Группировка тестов по проверяемому функционалу

<p align="center">
<img title="Allure Behaviors" src="images/screens/allure_behavior.png">
</p>


### :frog: Основной дашборд

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure_graphs.png">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.

<p align="center">
<img title="Telegram Notifications" src="images/screens/telegram_bot_notification.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gifs/test_run_example.gif">
</p>
