package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LandingPage {
    WebDriver driver;

    private By StartForFreeButton = By.xpath("//img[@class='logo-desktop']");

    //NAVBAR BUTTON
    private By featuresButton = By.xpath("//span[contains(text(), 'Features')][1]");
    private By useCaseButton = By.xpath("//span[contains(text(), 'Use Case')]");
    private By discoveryButton = By.xpath("//span[contains(text(), 'Discovery')]");
    private By premiumButton = By.xpath("//a[@class='nav-link' and @href='https://eklipse.gg/premium']");
    private By registerbutton = By.xpath("//div[@class='header-main__col header-main__col--right']//a[@class='btn btn-register']");
    //FIRST SECTION

    private By affiliatesSection = By.xpath("//div[@data-id='64b56f91']");
    private By voiceCommandSection = By.xpath("//div[@data-id='15a8ff3']");
    private By studioSection = By.xpath("//div[@data-id='3ca251b2']");
    private  By contentPlannerSection = By.xpath("//div[@data-id='1835234']");
    private By premiumFeaturesSection = By.xpath("//div[@data-id='344c52d9']");
    //FOOTER
    private By footerSection = By.xpath("//footer");
    private By helpButton = By.xpath("(//A[@href='https://eklipse.gg/help/'][text()='Help'])[2]");
    private By refundPolicyButton = By.xpath("//A[@href='https://eklipse.gg/refund-policy/'][text()='Refund Policy']");
    private By termsButton = By.xpath("//A[@href='https://eklipse.gg/terms-of-use/'][text()='Terms']");
    private By privacyButton = By.xpath("//A[@rel='privacy-policy'][text()='Privacy']");
    private By twitchClipDownloaderButton = By.xpath("//A[@target='_blank'][text()='Twitch Clip downloader']");
    private By kickClipDownloader = By.xpath("//A[@target='_blank'][text()='Kick Clip downloader']");
    private By contactUsButton = By.xpath("//A[@href='https://eklipse.gg/contact/'][text()='Contact Us']");
    private By productHuntButton = By.xpath("//IMG[@src='https://api.producthunt.com/widgets/embed-image/v1/featured.svg?post_id=457938&theme=light']");


    //First Section Button
    public Map<String, String> elementchecking1() {
        Map<String, String> buttonXPaths = new HashMap<>();
        buttonXPaths.put("Button 1", "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[2]");
        buttonXPaths.put("Button 2", "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[3]");
        buttonXPaths.put("Button 3", "//div[@class='elementor-element elementor-element-b0ff75c e-con-full e-flex e-con e-child']");

        return buttonXPaths;
    }

    //Second section button
    String[] listXpath = {
            "//div[@class='elementor-element elementor-element-c6ad5e4 e-con-full e-flex e-con e-child']",
            "//div[@class='elementor-element elementor-element-db710b2 e-con-full e-flex e-con e-child']",
            "//div[@class='elementor-element elementor-element-f7b4523 e-con-full e-flex e-con e-child']"
    };
    public List<WebElement> convertToWebElements(String[] xpaths) {
        List<WebElement> elements = new ArrayList<>();
        for (String xpath : xpaths) {
            elements.add(driver.findElement(By.xpath(xpath)));
        }
        return elements;
    }


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkButtonsStatus(Map<String, String> buttonXPaths) {
        for (Map.Entry<String, String> entry : buttonXPaths.entrySet()) {
            String buttonName = entry.getKey();
            String buttonXPath = entry.getValue();

            WebElement button = driver.findElement(By.xpath(buttonXPath));
            if (button.isEnabled()) {
                System.out.println("Button '" + buttonName + "' is active.");
            } else {
                System.out.println("Button '" + buttonName + "' is inactive.");
            }
        }
    }

    public LoginPage clickLoginPage() {
        driver.findElement(By.xpath("//div[@class='header-main__col header-main__col--right']/a[@class='btn btn-login']")).click();
        return new LoginPage(driver);
    }

    //NAVBAR
    public WebElement checkFeaturesButton(){
        return driver.findElement(featuresButton);
    }
    public WebElement checkUseCaseButton(){
        return driver.findElement(useCaseButton);
    }
    public WebElement checkDiscoveryButton(){
        return driver.findElement(discoveryButton);
    }
    public WebElement checkPremiumButton(){
        return driver.findElement(premiumButton);
    }
    public WebElement checkAffiliatesSection(){
        return driver.findElement(affiliatesSection);
    }

    public WebElement checkVoiceCommandSection(){
        return driver.findElement(voiceCommandSection);
    }
    public WebElement checkStudioSection(){
        return driver.findElement(studioSection);
    }
    public WebElement checkContentPlanner(){
        return driver.findElement(contentPlannerSection);
    }
    public WebElement checkPremiumFeatures(){
        return driver.findElement(premiumFeaturesSection);
    }
    public WebElement checkFooterSection(){
        return driver.findElement(footerSection);
    }

    public RegisterPage clickRegisterButton(){
        driver.findElement(registerbutton).click();
        return new RegisterPage(driver);
    }

    public WebElement helpButton(){
        return driver.findElement(helpButton);
    }
    public WebElement refundPolicy(){
        return driver.findElement(refundPolicyButton);
    }
    public WebElement term(){
        return driver.findElement(termsButton);
    }
    public WebElement privacy(){
        return driver.findElement(privacyButton);
    }
    public WebElement twitchClip(){
        return driver.findElement(twitchClipDownloaderButton);
    }
    public WebElement kickClip(){
        return driver.findElement(kickClipDownloader);
    }
    public WebElement contactUs(){
        return driver.findElement(contactUsButton);
    }
    public WebElement productHunt(){
        return driver.findElement(productHuntButton);
    }

}
