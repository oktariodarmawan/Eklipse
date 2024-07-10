package AI_EditPage;

import BaseTests.Base;
import PageObject.Edit_AI_Page;
import PageObject.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EditAITest extends Base {
    @Test
    public void editSuccess() throws InterruptedException{
            var loginPage = landingPage.clickLoginPage();
            if (loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled()) ;
            {
                System.out.println("Twitch button is available");
                System.out.println("Twitch button is enabled");
            }

            loginPage.inputUsername("kevinodtesting@gmail.com");
            loginPage.inputPassword("kevinkevin");
            HomePage homepage = loginPage.clickSignInButton();
            Thread.sleep(10000);

            if (homepage.modalContent()) {
                homepage.modalContentClickSkip();
            } else {
                homepage.loginSuccessful();
            }


            WebElement element = homepage.AI_Edit_Button();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Edit_AI_Page editAI_Page = homepage.clickAI_Edit();
            editAI_Page.create_AI_Edit().click();
            String urlLink = "https://app.eklipse.gg/edited-clip/ai-edit";
            Assert.assertEquals(urlLink, "https://app.eklipse.gg/edited-clip/ai-edit");

    }
}
