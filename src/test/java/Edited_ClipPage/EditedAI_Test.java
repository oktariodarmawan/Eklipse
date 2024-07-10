package Edited_ClipPage;

import BaseTests.Base;
import PageObject.Edit_AI_Page;
import PageObject.EditedAI_page;
import PageObject.HomePage;
import PageObject.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditedAI_Test extends Base {

    @Test
    public void EditedAISuccess() throws InterruptedException {
        LoginPage loginPage = landingPage.clickLoginPage();
        if (loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled()) ;
        {
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }
        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        Thread.sleep(1000);

        if (homepage.modalContent()) {
            homepage.modalContentClickSkip();
        } else {
            homepage.loginSuccessful();
        }

        WebElement element = homepage.editedAI_Button();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        EditedAI_page editedPage = homepage.clickEdited_AI_Page();

    }
}
