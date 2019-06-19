package testhomepage;

import base.MobileAPI2;
import homepage.HomePage;
import homepage.LoginPage;
import homepage.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI2 {
    HomePage homePage;
    LoginPage loginPage;
    SignInPage signInPage;




    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        loginPage = PageFactory.initElements(appiumDriver, LoginPage.class);
        signInPage = PageFactory.initElements(appiumDriver, SignInPage.class);


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
        loginPage.clickOnCreateaBusinessAccount();
        loginPage.LegalbusinessName();
        loginPage.LegalBusinessEmail();
        loginPage.ReenterEmail();
        loginPage.Password();
        loginPage.LegalBusinessPhone();


    }
    //@Test
    public void clickOnCreateaBusinessAccount() throws InterruptedException {
        loginPage.clickOnCreateaBusinessAccount();

    }
    //@Test(priority = 2)
    public void LegalbusinessName() throws InterruptedException {
        loginPage.LegalbusinessName();

    }
    //@Test(priority = 3)
    public void LegalBusinessEmail() throws InterruptedException {
        loginPage.LegalBusinessEmail();

    }
    //@Test(priority = 4)
    public void ReenterEmail() throws InterruptedException {
        loginPage.ReenterEmail();

    }
    //@Test(priority = 5)
    public void Password() throws InterruptedException {
        loginPage.Password();

    }
    //@Test(priority = 6)
    public void LegalBusinessPhone() throws InterruptedException {
        loginPage.LegalBusinessPhone();

    }
    @Test
    public void DailyDeals() throws InterruptedException {
        homePage.DailyDeals();

    }
    @Test
    public void Image() throws InterruptedException {
        homePage.Image();

    }
    @Test
    public void SEEALL() throws InterruptedException {
        homePage.SEEALL();

    }
    @Test(priority = 1)
    public void SignIn(){
        signInPage.SignIn();
        signInPage.CREATEANACCOUNT();
        signInPage.CONTINUEWITHGOOGLE();
    }
}

