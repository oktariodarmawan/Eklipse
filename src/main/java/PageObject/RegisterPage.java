package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver driver;

    private By getStartedLogo = By.xpath("//h1[@class='login-logo text-center my-2']");
    private By twitchButton = By.xpath("//div[@class='col-3 px-2'][1]");
    private By googleButton = By.xpath("//div[@class='col-3 px-2'][2]");
    private By facebookButton = By.xpath("//div[@class='col-3 px-2'][3]");
    private By appleButton = By.xpath("//div[@class='col-3 px-2'][4]");
    private By nameField = By.xpath("//input[@id='name']");
    private By emailField = By.xpath("//input[@id='email']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By passwordConfirmationField = By.xpath("//input[@id='password_confirmation']");
    private By signUpButton = By.xpath("//button[text()='Sign Up']");
    private By alertEmailTaken = By.xpath("//div[@class='alert alert-danger text-center']");
    private By alertNameField = By.xpath("//div[@class='form-group'][1]/div[@class='invalid-feedback']");
    private By alertEmailField = By.xpath("//div[@class='form-group'][2]/div[@class='invalid-feedback']");
    private By alertPasswordField = By.xpath("//div[@class='form-group position-relative'][1]/div[@class='invalid-feedback']");
    private By alertPasswordConfirmationField = By.xpath("//div[@class='form-group position-relative'][2]/div[@class='invalid-feedback']");
    private By alertPasswordDoesntMatch = By.xpath("//div[@class='form-group position-relative'][2]/div[@class='invalid-feedback d-block']");
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement checkGetStartedLogo(){
        return driver.findElement(getStartedLogo);
    }
    public WebElement checkTwitchButton(){
        return driver.findElement(twitchButton);
    }
    public WebElement checkGoogleButton(){
        return driver.findElement(googleButton);
    }
    public WebElement checkFacebookButton(){
        return driver.findElement(facebookButton);
    }
    public WebElement checkAppleButton(){
        return driver.findElement(appleButton);
    }
    public void inputName(String name){
    driver.findElement(nameField).sendKeys(name);
    }
    public void inputEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void inputPasswordConfirmation(String passwordConfirmation){
        driver.findElement(passwordConfirmationField).sendKeys(passwordConfirmation);
    }
    public WebElement clickSubmit(){
        return driver.findElement(signUpButton);
    }

    public WebElement emailTaken(){
        return driver.findElement(alertEmailTaken);
    }
    public WebElement alertNameField(){
        return driver.findElement(alertNameField);
    }
    public WebElement alertEmailField(){
        return driver.findElement(alertEmailField);
    }
    public WebElement alertPasswordField(){
        return driver.findElement(alertPasswordField);
    }
    public WebElement alertPasswordConfirmationField(){
        return driver.findElement(alertPasswordConfirmationField);
    }
    public WebElement alertDoesntMatch(){
        return driver.findElement(alertPasswordDoesntMatch);
    }
}
