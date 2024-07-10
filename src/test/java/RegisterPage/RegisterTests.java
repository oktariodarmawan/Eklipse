package RegisterPage;

import BaseTests.Base;
import PageObject.LandingPage;
import PageObject.RegisterPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTests extends Base {

    @Test
    public void register_successful(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled(), "Element is error");

        registerPage.inputName("Kevin");
        registerPage.inputEmail("kevintesting42@gmail.com");
        registerPage.inputPassword("Kevinkevin42!");
        registerPage.inputPasswordConfirmation("Kevinkevin42!");
        registerPage.clickSubmit().click();
    }

    @Test
    public void registerFail_EmailTaken(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled(), "Element is error");

        registerPage.inputName("Kevin");
        registerPage.inputEmail("kevintesting42@gmail.com");
        registerPage.inputPassword("Kevinkevin42!");
        registerPage.inputPasswordConfirmation("Kevinkevin42!");
        registerPage.clickSubmit().click();
        WebElement alertEmailTaken = registerPage.emailTaken();
        String alertEmailTakenText = registerPage.emailTaken().getText();
        Assert.assertTrue(alertEmailTaken.isDisplayed(), "Element is error");
        Assert.assertEquals(alertEmailTakenText,"The email has already been taken.");
    }

    @Test
    public void register_password_doesnt_match(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled  (), "Element is error");

        registerPage.inputName("Kevin");
        registerPage.inputEmail("kevinodtesting@gmail.com");
        registerPage.inputPassword("kevintesting");
        registerPage.inputPasswordConfirmation("kevintestings213123213");
        WebElement submitButton = registerPage.clickSubmit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(submitButton)));
            // Jika berhasil menunggu elemen tidak dapat diklik, maka asser berhasil
            Assert.assertTrue(true, "Element is not clickable");
        } catch (Exception e) {
            // Jika terjadi TimeoutException atau elemen masih dapat diklik, maka asser gagal
            Assert.fail("Element is clickable");
        }
    }

    @Test
    public void register_name_is_less_than_three(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled(), "Element is error");

        registerPage.inputName("sa");
        registerPage.inputEmail("kevintesting42@gmail.com");
        registerPage.inputPassword("Kevinkevin42!");
        registerPage.inputPasswordConfirmation("Kevinkevin42!");
        registerPage.clickSubmit().click();
        WebElement alertNameField = registerPage.alertNameField();
        Assert.assertTrue(alertNameField.isDisplayed(), "element is error");
        System.out.println("Element: " + alertNameField.getText() + " is displayed");
    }
    @Test
    public void register_email_is_invalid(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled(), "Element is error");

        registerPage.inputName("Kevin");
        registerPage.inputEmail("kevinkevinkevin");
        registerPage.inputPassword("Kevinkevin42!");
        registerPage.inputPasswordConfirmation("Kevinkevin42!");
        registerPage.clickSubmit().click();
        WebElement alertEmailField = registerPage.alertEmailField();
        Assert.assertTrue(alertEmailField.isDisplayed(), "element is error");
        System.out.println("Element: " + alertEmailField.getText() + " is displayed");
    }

    @Test
    public void register_password_is_less_than_eight(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled(), "Element is error");

        registerPage.inputName("Kevin");
        registerPage.inputEmail("kevintesting42@gmail.com");
        registerPage.inputPassword("Ke");
        registerPage.inputPasswordConfirmation("Kevinkevin42!");
        registerPage.clickSubmit().click();
        WebElement alertPasswordField = registerPage.alertPasswordField();
        Assert.assertTrue(alertPasswordField.isDisplayed(), "element is error");
        System.out.println("Element: " + alertPasswordField.getText() + " is displayed");
    }
    @Test
    public void register_password_confirmation_is_less_than_eight(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled(), "Element is error");

        registerPage.inputName("Kevin");
        registerPage.inputEmail("kevintesting42@gmail.com");
        registerPage.inputPassword("Kevinkevin42!");
        registerPage.inputPasswordConfirmation("Kevi");
        registerPage.clickSubmit().click();
        WebElement alertPasswordConfirmation = registerPage.alertPasswordConfirmationField();
        Assert.assertTrue(alertPasswordConfirmation.isDisplayed(), "element is error");
        System.out.println("Element: " + alertPasswordConfirmation.getText() + " is displayed");
    }

    @Test
    public void register_password_confirmation_doesnt_match(){
        RegisterPage registerPage = landingPage.clickRegisterButton();
        Assert.assertTrue(registerPage.checkGetStartedLogo().isDisplayed(), "Element is error");
        Assert.assertTrue(registerPage.checkAppleButton().isDisplayed() &&
                registerPage.checkAppleButton().isEnabled(),"Element is error");
        Assert.assertTrue(registerPage.checkFacebookButton().isDisplayed() &&
                registerPage.checkFacebookButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkGoogleButton().isDisplayed() &&
                registerPage.checkGoogleButton().isEnabled(), "Element is error");
        Assert.assertTrue(registerPage.checkTwitchButton().isDisplayed() &&
                registerPage.checkTwitchButton().isEnabled(), "Element is error");

        registerPage.inputName("Kevin");
        registerPage.inputEmail("kevintesting42@gmail.com");
        registerPage.inputPassword("Kevinkevin42!");
        registerPage.inputPasswordConfirmation("Kevinkevinkevin");
        registerPage.clickSubmit().click();
        WebElement alertPasswordDoesntMatch = registerPage.alertDoesntMatch();
        Assert.assertTrue(alertPasswordDoesntMatch.isDisplayed(), "element is error");
        Assert.assertEquals(alertPasswordDoesntMatch.getText(),"Password & Confirm Password does not match","error");
        System.out.println("Element: " + alertPasswordDoesntMatch.getText() + " is displayed");
    }

}
