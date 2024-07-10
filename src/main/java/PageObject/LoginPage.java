package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    private By loginFailedText = By.xpath("//div[@id='swal2-html-container']");
    private By personalDetailButton = By.xpath("//*[@id='0']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getTwitchButton(){
       return driver.findElement(By.xpath("(//BUTTON[@type='button'])[1]"));
    }
    public WebElement getGoogleButton(){
        return driver.findElement(By.xpath("(//BUTTON[@type='button'])[2]"));
    }
    public WebElement getAppleButton(){
        return driver.findElement(By.xpath("(//BUTTON[@type='button'])[4]"));
    }

    public WebElement getFacebookButton(){
        return driver.findElement(By.xpath("(//BUTTON[@type='button'])[3]"));
    }

    public void inputUsername(String username){
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
    }
    public HomePage clickSignInButton(){
        driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div/div[2]/form/div[4]/button")).click();
        return new HomePage(driver);
    }
    public boolean loginFailedModal(){
       return driver.findElement(By.xpath("/html/body/div[4]/div")).isDisplayed();
    }
    public String loginFailedText(){
        return driver.findElement(loginFailedText).getText();
    }
}


