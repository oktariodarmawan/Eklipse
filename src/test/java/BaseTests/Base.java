package BaseTests;

import PageObject.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
    protected LandingPage landingPage;




    @BeforeMethod
    public void goHome(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eklipse.gg/eklipse-new-homepage-control/");
        landingPage = new LandingPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
