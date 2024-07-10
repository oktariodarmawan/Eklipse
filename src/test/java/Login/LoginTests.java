package Login;

import BaseTests.Base;
import PageObject.HomePage;
import PageObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends Base {

    @Test
    public void signInFailTest(){
        LoginPage loginPage = landingPage.clickLoginPage();

        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }
        loginPage.inputUsername("oktariodarmawan@gmail.com");
        loginPage.inputPassword("kevinkevin");
        loginPage.clickSignInButton();
        loginPage.loginFailedModal();
        var text = loginPage.loginFailedText();
        Assert.assertEquals(text, "Your account or password is incorrect. Reset or change your password.");
    }

    @Test
    public void signInSuccessTest(){
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }
        loginPage.inputUsername("kevinkevinod@gmail.com");
        loginPage.inputPassword("kevinkevin42!");
        HomePage homepage = loginPage.clickSignInButton();


        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }
        homepage.profileLogoDisplay();
    }

}
