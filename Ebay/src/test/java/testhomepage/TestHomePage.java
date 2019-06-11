package testhomepage;

import base.MobileAPI2;
import homepage.HomePage;
import homepage.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI2 {
    HomePage homePage;
    LoginPage loginPage;




    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        loginPage = PageFactory.initElements(appiumDriver, LoginPage.class);


    }
    @Test
    public void clickOnSELLING() throws InterruptedException {
        homePage.clickOnSELLING();

    }
    @Test
    public void clickOnDEALS() throws InterruptedException {
        homePage.clickOnDEALS();

    }
    @Test
    public void clickOnCATEGORIES() throws InterruptedException {
        homePage.clickOnCATEGORIES();

    }
    @Test
    public void clickOnSAVED() throws InterruptedException {
        homePage.clickOnSAVED();

    }
    @Test
    public void clickOnLOGO() throws InterruptedException {
        homePage.clickOnLOGO();

    }
    @Test
    public void clickOnSEARCHBOX() throws InterruptedException {
        homePage.clickOnSEARCHBOX();

    }
    @Test
    public void clickOnRegister() throws InterruptedException {
        loginPage.clickOnRegister();

    }
    @Test
    public void clickOnCreateaBusinessAccount() throws InterruptedException {
        loginPage.clickOnCreateaBusinessAccount();

    }
    @Test
    public void inputLegalbusinessName() throws InterruptedException {
        loginPage.inputLegalbusinessName();

    }
    @Test
    public void inputLegalBusinessEmail() throws InterruptedException {
        loginPage.inputLegalBusinessEmail();

    }
    @Test
    public void ReenterEmail() throws InterruptedException {
        loginPage.ReenterEmail();

    }
    @Test
    public void Password() throws InterruptedException {
        loginPage.Password();

    }
    @Test
    public void LegalBusinessPhone() throws InterruptedException {
        loginPage.LegalBusinessPhone();

    }



}

