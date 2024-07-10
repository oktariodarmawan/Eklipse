package Home;

import BaseTests.Base;
import PageObject.HomePage;
import PageObject.LandingPage;
import PageObject.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends Base {

    @Test
    public void homeTestsuccess() throws InterruptedException {
        LoginPage loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }
        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        Thread.sleep(1000);

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }

        WebElement loginsuccess = homepage.loginSuccessful();
        Assert.assertTrue(loginsuccess.isDisplayed(),"element is not displayed");
        String homeUrlText = driver.getCurrentUrl();
        Assert.assertEquals(homeUrlText,"https://app.eklipse.gg/home");
        WebElement youtubeHighlightsButton = homepage.checkYoutubeHighlights();
        WebElement livestreamButton = homepage.checkLivestreamButton();
        Assert.assertTrue(youtubeHighlightsButton.isDisplayed() && youtubeHighlightsButton.isEnabled(), "Element is error");
        Assert.assertTrue(livestreamButton.isDisplayed() && livestreamButton.isEnabled(), "Element is error");
    }
    @Test
    public void uploadClip() throws InterruptedException {
        LoginPage loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }
        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();

        Thread.sleep(10);

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();

        }
        else {
            homepage.loginSuccessful();
        }

        WebElement loginsuccess = homepage.loginSuccessful();
        Assert.assertTrue(loginsuccess.isDisplayed(),"element is not displayed");
        String homeUrlText = driver.getCurrentUrl();
        Assert.assertEquals(homeUrlText,"https://app.eklipse.gg/home");
        WebElement youtubeHighlightsButton = homepage.checkYoutubeHighlights();
        WebElement livestreamButton = homepage.checkLivestreamButton();
        Assert.assertTrue(youtubeHighlightsButton.isDisplayed() && youtubeHighlightsButton.isEnabled(), "Element is error");
        Assert.assertTrue(livestreamButton.isDisplayed() && livestreamButton.isEnabled(), "Element is error");

        homepage.importStreamButton().click();
        homepage.uploadVideoButton().click();
    }
}
