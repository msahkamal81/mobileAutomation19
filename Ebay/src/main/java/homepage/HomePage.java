package homepage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Selling button\"]")
    WebElement SELLING;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]")
    WebElement DEALS;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]\n")
    WebElement CATEGORIES;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Saved button\"]")
    WebElement SAVED;
    @FindBy(id = "com.ebay.mobile:id/logo")
    WebElement LOGO;
    @FindBy(id = "com.ebay.mobile:id/search_box")
    WebElement SEARCHBOX;


    public void clickOnSELLING() throws InterruptedException {
        SELLING.click();
        Thread.sleep(5);
    }
    public void clickOnDEALS() throws InterruptedException {
        DEALS.click();
        Thread.sleep(5);
    }
    public void clickOnCATEGORIES() throws InterruptedException {
        CATEGORIES.click();
        Thread.sleep(5);
    }
    public void clickOnSAVED() throws InterruptedException {
        SAVED.click();
        Thread.sleep(5);
    }
    public void clickOnLOGO() throws InterruptedException {
        LOGO.click();
        Thread.sleep(5);
    }
    public void clickOnSEARCHBOX() throws InterruptedException {
        SEARCHBOX.click();
        Thread.sleep(5);
    }


}
