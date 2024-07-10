package LandingPage;

import BaseTests.Base;
import PageObject.LandingPage;
import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertTrue;

public class LandingTests extends Base {

    @Test
    public void testFirstSection(){
        //First Section
        Map<String, String> buttonXPaths = landingPage.elementchecking1();
        WebElement button1 = driver.findElement(By.xpath(buttonXPaths.get("Button 1")));
        WebElement button2 = driver.findElement(By.xpath(buttonXPaths.get("Button 2")));
        WebElement button3 = driver.findElement(By.xpath(buttonXPaths.get("Button 3")));
        assertTrue("Button 1 should be active", button1.isEnabled());
        assertTrue("Button 2 should be active", button2.isEnabled());
        assertTrue("Button 3 should be active", button3.isEnabled());
    }

    @Test
    public void testSecondSection(){
        String[] listXpath = {
                "//div[@class='elementor-element elementor-element-c6ad5e4 e-con-full e-flex e-con e-child']",
                "//div[@class='elementor-element elementor-element-db710b2 e-con-full e-flex e-con e-child']",
                "//div[@class='elementor-element elementor-element-f7b4523 e-con-full e-flex e-con e-child']"
        };

        List<WebElement> elements = landingPage.convertToWebElements(listXpath);
        for (WebElement element : elements) {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("Teks dari elemen: " + element.getText());
        }
        WebElement button1 = elements.get(0);
        assertTrue("Button 1 should be active", button1.isEnabled());
    }

    @Test
    public void testNavbar(){
    WebElement featuresButton = landingPage.checkFeaturesButton();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    WebElement elementFeatures = wait.until(ExpectedConditions.visibilityOf(featuresButton));
    Assert.assertTrue(elementFeatures.isDisplayed(), "button is not displayed");
    featuresButton.click();
    String elementUrlFeatures = driver.getCurrentUrl();
    Assert.assertEquals(elementUrlFeatures,"https://eklipse.gg/features/");

    driver.navigate().back();

    WebElement useCaseButton = landingPage.checkUseCaseButton();
    WebElement elementUseCase = wait.until(ExpectedConditions.visibilityOf(useCaseButton));
    Assert.assertTrue(elementUseCase.isDisplayed(), "Button is not active");
    useCaseButton.click();

    driver.navigate().back();

    WebElement discoveryButton = landingPage.checkDiscoveryButton();
    wait.until(ExpectedConditions.visibilityOf(discoveryButton));
    Assert.assertTrue(discoveryButton.isDisplayed(), "Button is not active");
    discoveryButton.click();

    driver.navigate().back();

    WebElement premiumButton = landingPage.checkPremiumButton();
    wait.until(ExpectedConditions.visibilityOf(premiumButton));
    Assert.assertTrue(premiumButton.isDisplayed(), "Button is not active");
    premiumButton.click();
    String elementUrlPremium = driver.getCurrentUrl();
    Assert.assertEquals(elementUrlPremium, "https://eklipse.gg/premium/");
    }

    @Test
    public void affiliatesSectionTest(){
        WebElement affiliatesSection = landingPage.checkAffiliatesSection();
        Assert.assertTrue(affiliatesSection.isDisplayed());
    }
    @Test
    public void voiceCommandSectionTest(){
        WebElement voiceCommandSection = landingPage.checkVoiceCommandSection();
        Assert.assertTrue(voiceCommandSection.isDisplayed(),"element is not displayed");
    }

    @Test
    public void studioSectionTest(){
        WebElement studioSection = landingPage.checkStudioSection();
        Assert.assertTrue(studioSection.isDisplayed(),"element is not displayed");
    }
    @Test
    public void contentPlannerSectionTest(){
        WebElement contentPlannerSection = landingPage.checkContentPlanner();
        Assert.assertTrue(contentPlannerSection.isDisplayed(),"element is not displayed");
    }
    @Test
    public void premiumFeaturesTest(){
        WebElement premiumFeaturesSection = landingPage.checkPremiumFeatures();
        Assert.assertTrue(premiumFeaturesSection.isDisplayed(),"element is not displayed");
    }
    @Test
    public void footerSectionTest(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement helpButton = landingPage.helpButton();
        String helpString = helpButton.getText();
        WebElement refundPolicy = landingPage.refundPolicy();
        WebElement term = landingPage.term();
        WebElement privacy = landingPage.privacy();
        WebElement twitchClip = landingPage.twitchClip();
        WebElement kickClip = landingPage.kickClip();
        WebElement contactUs = landingPage.contactUs();
        WebElement productHunt = landingPage.productHunt();
        Assert.assertTrue(helpButton.isDisplayed());
        Assert.assertTrue(refundPolicy.isDisplayed());
        Assert.assertTrue(term.isDisplayed());
        Assert.assertTrue(privacy.isDisplayed());
        Assert.assertTrue(twitchClip.isDisplayed());
        Assert.assertTrue(kickClip.isDisplayed());
        Assert.assertTrue(contactUs.isDisplayed());
        Assert.assertTrue(productHunt.isDisplayed());
    }
    @Test
    public void helpButton(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement helpButton = landingPage.helpButton();
        helpButton.click();
        String helpString = driver.getCurrentUrl();
        Assert.assertEquals(helpString,"https://eklipse.gg/help/", "element is error");
    }

    @Test
    public void refundPolicy(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement refundPolicy = landingPage.refundPolicy();
        refundPolicy.click();
        String refundPolicyLink = driver.getCurrentUrl();
        Assert.assertEquals(refundPolicyLink,"https://eklipse.gg/refund-policy/", "element is error");
    }
    @Test
    public void terms(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement terms = landingPage.term();
        terms.click();
        String termsLink = driver.getCurrentUrl();
        Assert.assertEquals(termsLink,"https://eklipse.gg/terms-of-use/", "element is error");
    }
    @Test
    public void privacyPolicy(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement privacyPolicy = landingPage.privacy();
        privacyPolicy.click();
        String privacyLink = driver.getCurrentUrl();
        Assert.assertEquals(privacyLink,"https://eklipse.gg/privacy-policy/", "element is error");
    }

    @Test
    public void twitchClip(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement twitchClip = landingPage.twitchClip();
        twitchClip.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String twitchLink = driver.getCurrentUrl();
        Assert.assertEquals(twitchLink,"https://streamclip.ai/home?utm_id=eklipse_lp", "element is error");
    }
    @Test
    public void kickCLip(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement kickClip = landingPage.kickClip();
        kickClip.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String kickLink = driver.getCurrentUrl();
        Assert.assertEquals(kickLink,"https://streamclip.ai/kick-downloader?utm_id=eklipse_lp", "element is error");
    }
    @Test
    public void contactUs(){
        WebElement footerSection = landingPage.checkFooterSection();
        Assert.assertTrue(footerSection.isDisplayed(),"element is not displayed");
        WebElement contactUS = landingPage.contactUs();
        contactUS.click();
        String contactLink = driver.getCurrentUrl();
        Assert.assertEquals(contactLink,"https://eklipse.gg/contact/", "element is error");
    }


}


