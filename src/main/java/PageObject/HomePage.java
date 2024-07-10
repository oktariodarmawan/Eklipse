package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By mainLogo = By.xpath("//img[@class='logo-main'][1]");

    private By modalContentElement = By.xpath("//div[@class='modal-content']");

    private By modalContentButtonSkip = By.xpath("//button[@class='btn btn-link--highlight' and contains(text(), 'Skip for now')]");
    private By profileLogo = By.xpath("//ul[@class='nav-account nav'][3]");
    private By settingLogo = By.xpath("//*[@id='dashboard']/div[3]/div/header/div/div[1]/ul[5]/li/div/button[3]");
    private By liveStreamButton = By.xpath("//ul[@class='ek-list-tab-style mb-3 home']/li[text()='Live Stream']");
    private By youtubeHighlightButton = By.xpath("//ul[@class='ek-list-tab-style mb-3 home']/li[text()='YouTube Highlights']");
    private By importStreamsButton = By.xpath("//div[@class='entry-point-item'][1]");
    private By uploadVideoButton = By.xpath("//div[@class='row mb-2 mb-md-0'][2]");
    private By modalStreamsuccessfullyImported = By.xpath("//div[@class='swal2-popup swal2-modal swal2-show']");
    private By alertUploadFails = By.xpath("//div[@class='d-block invalid-feedback']");
    private By loadingAI_Edit = By.xpath("//div[@class='background--grey d-flex align-items-center']");
    private By AI_Edit_Button = By.xpath("(//A[@class='sidebar-submenu-link'])[5]");
    private By dropdownLeftMenu  = By.xpath("//BUTTON[@type='button'][text()='☰']");
    private By EditedAI_Button = By.xpath("(//A[@class='sidebar-submenu-link'])[6]");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement loginSuccessful(){
        System.out.println("side Logo is Displayed");
        return driver.findElement(mainLogo);
    }
    public WebElement modalContentElement(){
        return driver.findElement(modalContentElement);
    }
    public boolean modalContent(){
        WebElement waitModal = driver.findElement(modalContentElement);
        return waitModal.isDisplayed();
    }
    public void modalContentClickSkip(){
        driver.findElement(modalContentButtonSkip).click();
    }
    public boolean profileLogoDisplay(){
        System.out.println("profile logo is displayed");
        return driver.findElement(profileLogo).isDisplayed();
    }
    public AccountSettingPage clickSettingButton(){
        driver.findElement(profileLogo).click();
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement settingLogoWait = myWait.until(ExpectedConditions.visibilityOfElementLocated(settingLogo));
        settingLogoWait.click();
        return new AccountSettingPage(driver);
    }
    public WebElement AI_Edit_Button(){
        return driver.findElement(AI_Edit_Button);
    }
    public Edit_AI_Page clickAI_Edit(){
        driver.findElement(AI_Edit_Button).click();
        return new Edit_AI_Page(driver);
    }

    public WebElement checkYoutubeHighlights(){
        return driver.findElement(youtubeHighlightButton);
    }
    public WebElement checkLivestreamButton(){
        return driver.findElement(liveStreamButton);
    }
    public WebElement importStreamButton(){
        return driver.findElement(importStreamsButton);
    }
    public WebElement uploadVideoButton(){
        return driver.findElement(uploadVideoButton);
    }
    public WebElement dropdownLeftMenuButton(){
        return driver.findElement(dropdownLeftMenu);
    }

    public WebElement editedAI_Button(){
        return driver.findElement(EditedAI_Button);
    }
    public EditedAI_page clickEdited_AI_Page(){
        driver.findElement(EditedAI_Button).click();
        return new EditedAI_page(driver);
    }
}



