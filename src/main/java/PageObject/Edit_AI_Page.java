package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edit_AI_Page {
    private WebDriver driver;
    private By AI_Edit_Button = By.xpath("(//A[@class='sidebar-submenu-link'])[5]");
    private By createAI_Button = By.xpath("//DIV[@class='btn-ai']");
    private By start_AI_Edit_Button = By.xpath("//BUTTON[@class='ek-primary-button pl-5 pr-5'][text()='Start AI Edit']");
    private By modalContentAI = By.xpath("//DIV[@class='modal-content']");
    private By localUploadButton = By.xpath("(//DIV[@class='action'])[2]");
    private By browseClipLibraryButton = By.xpath("(//DIV[@class='action'])[1]");
    private By uploadVideoButton = By.xpath("//BUTTON[@class='btn btn-primary btn-xs'][text()='Upload a Video']");
    private By confirmUpload = By.xpath("//BUTTON[@type='button'][text()='Confirm']");

    public Edit_AI_Page(WebDriver driver){
        this.driver = driver;
    }

    public WebElement AI_Edit(){
        return driver.findElement(AI_Edit_Button);
    }
    public WebElement create_AI_Edit(){
        return driver.findElement(createAI_Button);
    }
    public WebElement startAI_Edit(){
        return driver.findElement(start_AI_Edit_Button);
    }
    public WebElement localUpload(){
        return driver.findElement(localUploadButton);
    }

    public void clickUploadButton(){
        driver.findElement(confirmUpload).click();
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(uploadVideoButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }
}
