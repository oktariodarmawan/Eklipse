package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSettingPage {

    WebDriver driver;

    private By personalDetailButton = By.xpath("//*[@id='0']");
    private By pluginSettingButton = By.xpath("//*[@id='3']");
    private By premiumPlanButton = By.xpath("//*[@id='2']");
    private By gameSettingButton = By.xpath("//*[@id='4']");
    private By addAccountButton = By.xpath("//*[@id='dashboard']/div[3]/div/div/div/div[1]/div[1]/div[1]/button");
    private By connectTwitchButton = By.xpath("(//BUTTON[@type='button'][text()='Connect'])[1]");
    private By connectYoutubeButton = By.xpath("(//BUTTON[@type='button'][text()='Connect'])[2]");
    private By connectFacebookButton = By.xpath("(//BUTTON[@type='button'][text()='Connect'])[3]");
    private By connectKickButton = By.xpath("(//BUTTON[@type='button'][text()='Connect'])[4]");
    private By connectRumbleButton = By.xpath("(//BUTTON[@type='button'][text()='Connect'])[5]");

    private By connectTiktokAccountButton = By.xpath("(//BUTTON[@type='button'][text()='Connect'])[5]");
    private By connectDiscordAccountButton = By.xpath("(//BUTTON[@type='button'][text()='Connect'])[7]");
    private By addToServerEklipseBotButton = By.xpath("//*[@id='dashboard']/div[3]/div/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/button");
    private By inputNameField = By.xpath("//BUTTON[@type='button'][text()='Add to Server']");
    public AccountSettingPage(WebDriver driver){
        this.driver = driver;
    }

    //ACCOUNT SETTING
    public WebElement checkDetailButton(){
        return driver.findElement(personalDetailButton);
    }

    public WebElement checkPluginSettingButton(){
        return driver.findElement(pluginSettingButton);
    }
    public WebElement checkPremiumPlanButton(){
        return driver.findElement(premiumPlanButton);
    }
    public WebElement checkGameSettingButton(){
        return driver.findElement(gameSettingButton);
    }

    public WebElement checkAddAccountButton(){
        return driver.findElement(addAccountButton);
    }
    //Social Media
    public WebElement connectTwitchButton(){
        return driver.findElement(connectTwitchButton);
    }
    public WebElement connectYoutubeButton(){
        return driver.findElement(connectYoutubeButton);
    }
    public WebElement connectFacebookButton(){
        return driver.findElement(connectFacebookButton);
    }
    public WebElement connectKickButton(){
        return driver.findElement(connectKickButton);
    }
    public WebElement connectRumbleButton(){
        return driver.findElement(connectRumbleButton);
    }
    public WebElement checkConnectTiktokAccountButton(){
        return driver.findElement(connectTiktokAccountButton);
    }
    public WebElement checkConnectDiscordAccountButton(){
        return driver.findElement(connectDiscordAccountButton);
    }
    public WebElement checkAddToServerEklipseBotButton(){
        return driver.findElement(addToServerEklipseBotButton);
    }
    //PROFILE SETTING
    public void inputName(String name){
        driver.findElement(inputNameField).clear();
        driver.findElement(inputNameField).sendKeys(name);
    }



}
