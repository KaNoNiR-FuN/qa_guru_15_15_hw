package tests;

import configs.AuthConfig;
import configs.TestBase;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.DtfPage;

public class DtfTests extends TestBase {

    DtfPage dtfPage = new DtfPage();
    AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

    @Test
    @DisplayName("Проверка отображения основных пунктов меню")
    void menuItemsTest() {
        dtfPage.openPage()
                .checkMenuItems();
    }

    @Test
    @DisplayName("Проверка перехода на страницу 'О проекте'")
    void aboutProjectTest() {
        dtfPage.openPage()
                .aboutProjectButtonClick()
                .aboutProjectCheckHeader();
    }

    @Test
    @DisplayName("Проверка перехода в подсайт 'Индустрия'")
    void industryTest() {
        dtfPage.openPage()
                .industryButtonClick()
                .industryCheckDescription();
    }

    @Test
    @DisplayName("Проверка поиска статьи")
    void articleSearchTest() {
        dtfPage.openPage()
                .search("God of War вышла на PS4 и PS5")
                .checkArticleHeaderInSearchResults("God of War Ragnarök вышла на PS4 и PS5");
    }

    @Test
    @DisplayName("Проверка авторизации на сайте")
    void loginTest() {
        dtfPage.openPage()
                .loginButtonClick()
                .signupLoginButtonClick()
                .logWithEmailClick()
                .setLogEmail(config.email())
                .setLogPassword(config.password())
                .enterAccountButtonClick()
                .openProfile()
                .checkProfileName(config.profileName());
    }
}
