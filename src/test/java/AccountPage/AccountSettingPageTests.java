package AccountPage;

import BaseTests.Base;
import PageObject.AccountSettingPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccountSettingPageTests extends Base {


    @Test
    public void connectToTwitch(){
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }

        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        WebElement modalContentElement = homepage.modalContentElement();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement waitModal = myWait.until(ExpectedConditions.visibilityOf(modalContentElement));

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }
        homepage.profileLogoDisplay();

        AccountSettingPage accountSettingPage = homepage.clickSettingButton();

        //scroll
        WebElement element = driver.findElement(By.xpath("(//BUTTON[@type='button'][text()='Connect'])[1]"));
        element.click();
        String twitchUrl = driver.getCurrentUrl();
        Assert.assertTrue(twitchUrl.contains("twitch"));
    }


    @Test
    public void connectToTiktok() throws InterruptedException {
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }

        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        WebElement modalContentElement = homepage.modalContentElement();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement waitModal = myWait.until(ExpectedConditions.visibilityOf(modalContentElement));

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }
        homepage.profileLogoDisplay();

        AccountSettingPage accountSettingPage = homepage.clickSettingButton();

        //scroll
        WebElement element1 = driver.findElement(By.xpath("(//DIV[@class='account-detail-container'])[5]"));
        WebElement element2 = driver.findElement(By.xpath("(//BUTTON[@type='button'][text()='Connect'])[6]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Thread.sleep(5000);
        element2.click();
        String tiktokUrl = driver.getCurrentUrl();
        Assert.assertTrue(tiktokUrl.contains("https://www.tiktok.com"));
    }

    @Test
    public void connectYoutube(){
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }

        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        WebElement modalContentElement = homepage.modalContentElement();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement waitModal = myWait.until(ExpectedConditions.visibilityOf(modalContentElement));

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }
        homepage.profileLogoDisplay();

        AccountSettingPage accountSettingPage = homepage.clickSettingButton();

        //scroll

        WebElement element = accountSettingPage.connectYoutubeButton();
        element.click();
        String youtubeUrl = driver.getCurrentUrl();
        Assert.assertTrue(youtubeUrl.contains("youtube"));
    }

    @Test
    public void connectFacebook() throws InterruptedException {
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }
        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();

        homepage.profileLogoDisplay();
        AccountSettingPage accountSettingPage = homepage.clickSettingButton();
        //scroll;
        Thread.sleep(5000);
        WebElement connectFacebook = accountSettingPage.connectFacebookButton();

        connectFacebook.click();

        System.out.println(driver.getCurrentUrl());
        String facebookUrl = driver.getCurrentUrl();
        Assert.assertTrue(facebookUrl.contains("facebook"));
    }

    @Test
    public void connectKick(){
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }

        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        WebElement modalContentElement = homepage.modalContentElement();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement waitModal = myWait.until(ExpectedConditions.visibilityOf(modalContentElement));

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }
        homepage.profileLogoDisplay();

        AccountSettingPage accountSettingPage = homepage.clickSettingButton();

        //scroll
        ;
        WebElement element = accountSettingPage.connectKickButton();
        element.click();
        WebElement modalKick = driver.findElement(By.xpath("(//DIV[@class='modal-content'])[4]"));
        Assert.assertTrue(modalKick.isDisplayed(),"Element is error");
    }

    @Test
    public void connectDiscord() {
            var loginPage = landingPage.clickLoginPage();
            if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
                System.out.println("Twitch button is available");
                System.out.println("Twitch button is enabled");
            }

            loginPage.inputUsername("kevinodtesting@gmail.com");
            loginPage.inputPassword("kevinkevin");
            HomePage homepage = loginPage.clickSignInButton();
            WebElement modalContentElement = homepage.modalContentElement();
            WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement waitModal = myWait.until(ExpectedConditions.visibilityOf(modalContentElement));

            if(homepage.modalContent()){
                homepage.modalContentClickSkip();
            }
            else {
                homepage.loginSuccessful();
            }
            homepage.profileLogoDisplay();

            AccountSettingPage accountSettingPage = homepage.clickSettingButton();

            //scroll
            WebElement element1 = driver.findElement(By.xpath("(//DIV[@class='account-detail-container'])[5]"));
            WebElement element2 = driver.findElement(By.xpath("(//BUTTON[@type='button'][text()='Connect'])[7]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
            element2.click();
            WebElement discordModalPop = driver.findElement(By.xpath("//DIV[@class='container p-4']"));
            Assert.assertTrue(discordModalPop.isDisplayed());
    }

    @Test
    public void profileSettingChangeNameSuccess(){
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }

        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        WebElement modalContentElement = homepage.modalContentElement();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement waitModal = myWait.until(ExpectedConditions.visibilityOf(modalContentElement));

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }
        homepage.profileLogoDisplay();

        AccountSettingPage accountSettingPage = homepage.clickSettingButton();
        //scroll
        WebElement element1 = driver.findElement(By.xpath("(//DIV[@class='form-input-detail-row'])[1]"));
        WebElement element2 = driver.findElement(By.xpath("//INPUT[@name='Name']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        element2.clear();
        element2.sendKeys("Kevin testing 2024");
        WebElement saveChangeButton = driver.findElement(By.xpath("(//BUTTON[@type='button'][text()='Save Changes'])[1]"));
        saveChangeButton.click();
        WebElement saveChangeSuccessModal = driver.findElement(By.xpath("//DIV[@aria-labelledby='swal2-title']"));
        Assert.assertTrue(saveChangeSuccessModal.isDisplayed());
    }

    @Test
    public void profileSettingchangePassword(){
        var loginPage = landingPage.clickLoginPage();
        if(loginPage.getTwitchButton().isDisplayed() && loginPage.getTwitchButton().isEnabled());{
            System.out.println("Twitch button is available");
            System.out.println("Twitch button is enabled");
        }

        loginPage.inputUsername("kevinodtesting@gmail.com");
        loginPage.inputPassword("kevinkevin");
        HomePage homepage = loginPage.clickSignInButton();
        WebElement modalContentElement = homepage.modalContentElement();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement waitModal = myWait.until(ExpectedConditions.visibilityOf(modalContentElement));

        if(homepage.modalContent()){
            homepage.modalContentClickSkip();
        }
        else {
            homepage.loginSuccessful();
        }
        homepage.profileLogoDisplay();

        AccountSettingPage accountSettingPage = homepage.clickSettingButton();
        //scroll
        WebElement element1 = driver.findElement(By.xpath("(//DIV[@class='form-input-detail-row'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        WebElement changePasswordButton = driver.findElement(By.xpath("//BUTTON[@type='button'][text()='Change Password']"));
        changePasswordButton.click();
        WebElement currentPasswordField = driver.findElement(By.xpath("//INPUT[@name='currentPassword']"));
        WebElement newPasswordField = driver.findElement(By.xpath("//INPUT[@name='newPassword']"));
        WebElement confirmPasswordField = driver.findElement(By.xpath("//INPUT[@name='confirmPassword']"));
        currentPasswordField.sendKeys("kevinkevin");
        newPasswordField.sendKeys("KevinKevin");
        confirmPasswordField.sendKeys("KevinKevin");
        WebElement saveChangesButton = driver.findElement(By.xpath("(//BUTTON[@type='button'][text()='Save Changes'])[2]"));
        saveChangesButton.click();
        System.out.println("Modal Pop up!");
    }
}
