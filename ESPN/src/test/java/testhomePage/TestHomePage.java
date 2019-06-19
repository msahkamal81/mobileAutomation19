package testhomePage;

import base.MobileAPI2;
import homePage.HomePage;
import homePage.LoginPage;
import homePage.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI2 {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;


    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        loginPage = PageFactory.initElements(appiumDriver, LoginPage.class);
        registerPage = PageFactory.initElements(appiumDriver, RegisterPage.class);


    }

    @Test
    public void clickOnSIGNUP() throws InterruptedException {
        homePage.clickOnSIGNUP();

    }
    @Test
    public void clickOnLOGIN() throws InterruptedException {
        homePage.clickOnLOGIN();

    }
    @Test
    public void clickOnAppLogo() throws InterruptedException {
        homePage.clickOnAppLogo();

    }
    @Test
    public void clickOnIndia() throws InterruptedException {
        homePage.clickOnIndia();

    }
    @Test
    public void clickOnSignUpLate() throws InterruptedException {
        homePage.clickOnSignUpLate();

    }
    @Test
    public void clickOnBBL() throws InterruptedException {
        homePage.clickOnBBL();

    }

}
