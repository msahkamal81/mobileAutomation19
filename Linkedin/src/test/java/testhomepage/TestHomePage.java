package testhomepage;

import base.MobileAPI2;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestHomePage extends MobileAPI2 {

    HomePage homePage;



    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);

    }




}
