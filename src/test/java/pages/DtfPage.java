package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class DtfPage {

    private SelenideElement
            popularButton = $("[data-gtm=\"Menu — Popular Feed — Click\"]"),
            newButton = $("[data-gtm=\"Menu — New Feed — Click\"]"),
            jobsButton = $("[data-gtm=\"Sidebar — SiteNavigation — Vacancies\"]"),
            ratingButton = $("[data-gtm=\"Sidebar — SiteNavigation — Subsites rating\"]"),
            subsButton = $("[data-gtm=\"Sidebar — SiteNavigation — subscriptions\"]"),
            aboutProjectButton = $(".sidebar__footer__item[href=\"/about\"]"),
            aboutProjectHeader = $(".content-title"),
            industryButton = $("[data-gtm=\"Sidebar — Subscriptions — Item 3\"]"),
            subSiteHeaderDescription = $(".v-header-description__content.v-header-description__content--full"),
            searchInput = $(".v-text-input__input[type=\"text\"]"),
            searchResultButton = $(".popover__list"),
            searchResultArticleHeader = $(".search-content"),
            loginButton = $(".navigation-user[is-autofocus-search=\"true\"]"),
            signupLoginButton = $("[data-gtm=\"Signup — Login — Click\"]"),
            logWithEmailButton = $("[data-gtm=\"Login — Mail — Click\"]"),
            emailInput = $("[name=\"email\"]"),
            passwordInput = $("[name=\"password\"]"),
            enterAccountButton = $("[data-gtm=\"Login Mail — Login — Click\"]"),
            profileButton = $(".navigation-user[is-autofocus-search=\"true\"]"),
            profileName = $("[data-gtm=\"Account — Profile — Click\"]");

    public DtfPage openPage() {
        step("Открыть 'https://dtf.ru/'", () ->
            open("https://dtf.ru/"));
        return this;
    }

    public DtfPage checkMenuItems() {
        step("Проверить отображение пункта меню 'Популярное'", () ->
            popularButton.shouldHave(text("Популярное")));
        step("Проверить отображение пункта меню 'Свежее'", () ->
            newButton.shouldHave(text("Свежее")));
        step("Проверить отображение пункта меню 'Вакансии'", () ->
            jobsButton.shouldHave(text("Вакансии")));
        step("Проверить отображение пункта меню 'Рейтинг DTF'", () ->
            ratingButton.shouldHave(text("Рейтинг DTF")));
        step("Проверить отображение пункта меню 'Подписки'", () ->
            subsButton.shouldHave(text("Подписки")));
        return this;
    }

    public DtfPage aboutProjectButtonClick() {
        step("Нажать кнопку 'О проекте'", () ->
            aboutProjectButton.click());
        return this;
    }

    public DtfPage aboutProjectCheckHeader() {
        step("Проверить заголовок страницы 'О проекте'", () ->
            aboutProjectHeader.shouldHave(text("Что такое DTF")));
        return this;
    }

    public DtfPage industryButtonClick() {
        step("Нажать кнопку перехода в подсайт 'Индустрия'", () ->
            industryButton.click());
        return this;
    }

    public DtfPage industryCheckDescription() {
        step("Проверить описание подсайта 'Индустрия'", () ->
            subSiteHeaderDescription.shouldHave(text("Новости и статьи для тех," +
                    " кто хочет знать, как устроена игровая индустрия." +
                    " Тут публикуются чарты, аналитика, финансовые отчёты, анонсы мероприятий и мнения.")));
        return this;
    }

    public DtfPage search(String text) {
        step("Ввести текст в поискую строку", () ->
            searchInput.setValue(text));
        step("Нажать кнопку поиска", () ->
            searchResultButton.click());
        return this;
    }

    public DtfPage checkArticleHeaderInSearchResults(String headerText) {
        step("Проверить заголовок статьи", () ->
            searchResultArticleHeader.shouldHave(text(headerText)));
        return this;
    }

    public DtfPage loginButtonClick() {
        step("Нажать кнопку 'Войти'", () ->
            loginButton.click());
        return this;
    }

    public DtfPage signupLoginButtonClick() {
        step("Нажать кнопку 'Войти'", () ->
            signupLoginButton.click());
        return this;
    }

    public DtfPage logWithEmailClick() {
        step("Нажать кнопку 'Почта'", () ->
            logWithEmailButton.click());
        return this;
    }

    public DtfPage setLogEmail(String logEmail) {
        step("Ввести email", () ->
            emailInput.setValue(logEmail));
        return this;
    }

    public DtfPage setLogPassword(String logPassword) {
        step("Ввести пароль", () ->
            passwordInput.setValue(logPassword));
        return this;
    }

    public DtfPage enterAccountButtonClick() {
        step("Нажать кнопку 'Войти'", () ->
            enterAccountButton.click());
        return this;
    }

    public DtfPage openProfile() {
        step("Нажать кнопку 'Профиль'", () ->
            profileButton.click());
        return this;
    }

    public DtfPage checkProfileName(String name) {
        step("Проверить имя профиля", () ->
            profileName.shouldHave(text(name)));
        return this;
    }
}
