package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

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
        open("https://dtf.ru/");
        return this;
    }

    public DtfPage checkMenuItems() {
        popularButton.shouldHave(text("Популярное"));
        newButton.shouldHave(text("Свежее"));
        jobsButton.shouldHave(text("Вакансии"));
        ratingButton.shouldHave(text("Рейтинг DTF"));
        subsButton.shouldHave(text("Подписки"));
        return this;
    }

    public DtfPage aboutProjectButtonClick() {
        aboutProjectButton.click();
        return this;
    }

    public DtfPage aboutProjectCheckHeader() {
        aboutProjectHeader.shouldHave(text("Что такое DTF"));
        return this;
    }

    public DtfPage industryButtonClick() {
        industryButton.click();
        return this;
    }

    public DtfPage industryCheckDescription() {
        subSiteHeaderDescription.shouldHave(text("Новости и статьи для тех," +
                " кто хочет знать, как устроена игровая индустрия." +
                " Тут публикуются чарты, аналитика, финансовые отчёты, анонсы мероприятий и мнения."));
        return this;
    }

    public DtfPage search(String text) {
        searchInput.setValue(text);
        searchResultButton.click();
        return this;
    }

    public DtfPage checkArticleHeaderInSearchResults(String headerText) {
        searchResultArticleHeader.shouldHave(text(headerText));
        return this;
    }

    public DtfPage loginButtonClick() {
        loginButton.click();
        return this;
    }

    public DtfPage signupLoginButtonClick() {
        signupLoginButton.click();
        return this;
    }

    public DtfPage logWithEmailClick() {
        logWithEmailButton.click();
        return this;
    }

    public DtfPage setLogEmail(String logEmail) {
        emailInput.setValue(logEmail);
        return this;
    }

    public DtfPage setLogPassword(String logPassword) {
        passwordInput.setValue(logPassword);
        return this;
    }

    public DtfPage enterAccountButtonClick() {
        enterAccountButton.click();
        return this;
    }

    public DtfPage openProfile() {
        profileButton.click();
        return this;
    }

    public DtfPage checkProfileName(String name) {
        profileName.shouldHave(text(name));
        return this;
    }
}
